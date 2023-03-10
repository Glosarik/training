package task6.entity;

import java.util.Random;

import static task6.Constants.*;

public class Port {

    protected final Random random = new Random();
    protected static final Port[] PORTS = new Port[10];
    protected int quantityContainer;

    public void addShip() {
        Ship ship = new Ship();
        for (int i = 0; i < PORTS.length; i++) {
            PORTS[i] = new Ship(ship.createShip());
        }
        System.out.println(TOTAL_WEIGHT + ship.totalWeight + KILOGRAMS);
    }

    public void print(int diagonal, int height, String form, double volume, String liquid, double density, int weight) {
        System.out.println(quantityContainer + ") " + DIAGONAL + diagonal + HEIGHT + height + FORM + form + VOLUME +
                volume + LIQUID + liquid + DENSITY + density + METERS + WEIGHT + weight + KILOGRAMS);
    }
}
