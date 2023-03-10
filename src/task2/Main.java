package task2;

public class Main {
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private boolean aBoolean;
    private char aChar;
    private double aDouble;
    private float aFloat;

    private Byte byteExample;
    private Short shortExample;
    private Integer integerExample;
    private Long longExample;
    private Boolean booleanExample;
    private Character characterExample;
    private Double doubleExample;
    private Float floatExample;
    private String stringExample;

    public static void main(String[] args) {
        byte aByte = 13;
        short aShort;
        int anInt;
        long aLong;
        boolean aBoolean = false;
        char aChar = 'Ö';
        double aDouble;
        float aFloat;

        Byte byteExample = 1;
        Short shortExample = 1;
        Integer integerExample;
        Long longExample = 1L;
        Boolean booleanExample = Boolean.FALSE;
        Character characterExample = 'Ö';
        Double doubleExample = 1d;
        Float floatExample = 1f;
        String stringExample = "Hello";

        aShort = aByte;
        anInt = Math.round(aShort);
        aLong = anInt;
        aDouble = aLong;
        aFloat = (float) aDouble + 0.524f;
        integerExample = Math.round(aFloat);

        Telephone iphone = new Telephone("Iphone 11", "Розовое-золото", 194, 128, new float[]{150.9f, 75.7f, 8.3f});
        Telephone samsung = new Telephone("Samsung a12", "Серый", 208, 32, new float[]{164.0f, 75.8f, 8.9f});

        System.out.println("Примитивные:\n" + "byte - " + aByte + "\n" + "short - " + aShort + "\n" + "int - " + anInt + "\n" + "long - " + aLong + "\n" + "boolean - " + aBoolean + "\n" + "char - " + aChar + "\n" + "double - " + aDouble + "\n" + "float - " + aFloat + "\n");
        System.out.println("Ссылочные:\n" + "Byte - " + byteExample + "\n" + "Short - " + shortExample + "\n" + "Integer - " + integerExample + "\n" + "Long - " + longExample + "\n" + "Boolean - " + booleanExample + "\n" + "Character - " + characterExample + "\n" + "Double - " + doubleExample + "\n" + "Float - " + floatExample + "\n" + "String - " + stringExample);
    }
}
