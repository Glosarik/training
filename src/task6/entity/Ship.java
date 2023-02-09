package task6.entity;

import static task6.Constants.FORM_CONTAINER;
import static task6.Constants.SHIP;

public class Ship extends Port {

    private static int size;
    public long totalWeight;
    public Deck[] decks;

    public Deck[] createShip() {
        Deck[] decks = new Deck[setSize()];
        Container containers = new Container();
        System.out.println("В порт прибл " + SHIP[getSize() - 1] + " корабль, список контейнеров:");
        for (int i = 0; i < decks.length; i++) {
            decks[i] = new Deck(containers.createContainer());
        }
        for (Deck d : decks) {
            for (Container c : d.container) {
                totalWeight += c.getWeight();
                ++quantityContainer;
                print(c.getDiameter(), c.getHeight(), FORM_CONTAINER[c.randomForm()], c.getVolume(),
                        Container.LIQUID[c.randomLiquid()][0], Double.parseDouble(Container.LIQUID[c.randomLiquid()][1]),
                        c.getWeight());
            }
        }
        quantityContainer = 0;
        System.out.println();
        return decks;
    }

    private int setSize() {
        return size = random.nextInt(1, 3);
    }

    private int getSize() {
        return size;
    }

    public Ship() {
    }

    public Ship(Deck[] decks) {
        this.decks = decks;
    }
}
