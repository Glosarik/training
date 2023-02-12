package task6.entity;

public class Container extends Deck {

    private int weight;
    private int height;
    private int form;
    private int diameter;
    public long volume;
    public static final String[][] LIQUID = new String[][]{{"Вода", "1000"}, {"Бромистоводородная кислота (65%)", "1767.5"}};
    private static final int TWO = 2;

    public Container[] createContainer() {
        int size = random.nextBoolean() ? TWO : 4;
        Container[] containers = new Container[size];
        if (containers.length == 2) {
            for (int i = 0; i < containers.length; i++) {
                containers[i] = new Container(this.diameter = 20, randomHeight(), randomForm(), setWeight());
            }
        } else {
            for (int i = 0; i < containers.length; i++) {
                containers[i] = new Container(this.diameter = 10, randomHeight(), randomForm(), setWeight());
            }
        }
        return containers;
    }

    protected long getVolume() {
        switch (this.form) {
            case 0:
                return this.volume = (int) Math.round(Math.PI * height * Math.pow(diameter, TWO) / 4);
            case 1:
                double s = Math.pow(diameter, 2) / 2;
                return this.volume = (int) Math.round(s * height);
            case 2:
                return this.volume = (int) Math.round(1 / 3d * Math.PI * Math.pow(diameter, TWO) * height);
            default: return 0;
        }
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    protected int randomForm() {
        return this.form = random.nextInt(0, 3);
    }

    protected int randomLiquid() {
        return random.nextInt(0, LIQUID.length);
    }

    private int setWeight() {
        return this.weight = (int) (Double.parseDouble(LIQUID[randomLiquid()][1]) * getVolume());
    }

    private int randomHeight() { //рандом высота
        return this.height = random.nextInt(10, 100);
    }

    public Container() {
    }

    public Container(int diameter, int height, int form, int weight) {
        this.diameter = diameter;
        this.height = height;
        this.form = form;
        this.weight = weight;
    }
}
