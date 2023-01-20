package task2;

public class Main {
    byte aBytee;
    short aShort;
    int anInt;
    long aLong;
    boolean aBoolean;
    char aChar;
    double aDouble;
    float aFloat;

    Byte byteExample;
    Short shortExample;
    Integer integerExample;
    Long longExample;
    Boolean booleanExample;
    Character characterExample;
    Double doubleExample;
    Float floatExample;
    String stringExample;

    public static void main(String[] args) {
        byte aByte = 0;
        short aShort = 1;
        int anInt;
        long aLong = 25298;
        boolean aBoolean = false;
        char aChar = '©';
        double aDouble = 1124.65d;
        float aFloat;

        Byte byteExample = null;
        Short shortExample = null;
        Integer integerExample = null;
        Long longExample = null;
        Boolean booleanExample = null;
        Character characterExample = null;
        Double doubleExample = null;
        Float floatExample = null;
        String stringExample = null;

        anInt = (int) Math.round(aDouble);
        aFloat = aLong + 0.422f;

        Car car1 = new Car();
        car1.setBrand("Audi");
        car1.setColor("Red");
        car1.setWeight(1_900);
        car1.setSpeed(250);

        Car car2 = new Car();
        car2.setBrand("Lada");
        car2.setColor("Yellow");
        car2.setWeight(1_742);
        car2.setSpeed(220);

        System.out.println(car1.getName() + "1");
        System.out.println("Название: " + car1.getBrand() + ", Цвет: " + car1.getColor() + ", Вес: " + car1.getWeight() + "кг." + ", Скорость: " + car1.getSpeed() + "км/ч" + "\n");

        System.out.println(car1.getName() + "2");
        System.out.println("Название: " + car2.getBrand() + ", Цвет: " + car2.getColor() + ", Вес: " + car2.getWeight() + "кг."  + ", Скорость: " + car2.getSpeed() + "км/ч"  + "\n");

        System.out.println("Примитивные: " + aByte + " " + aShort + " " + anInt + " " + aLong + " " + aBoolean + " " + aChar + " " + aDouble + " " + aFloat);
        System.out.println("Ссылочные: " + byteExample + " " + shortExample + " " + integerExample + " " + longExample + " " + booleanExample + " " + characterExample + " " + doubleExample + " " + floatExample + " " + stringExample);
    }
}
