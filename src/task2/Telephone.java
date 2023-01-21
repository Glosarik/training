package task2;

public class Telephone {
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

    private static final String NAME = "Телефон №";
    private String color;
    private int weight, memory;
    private String model;
    private float[] size = new float[(3)];
    private static int count;

    /**
     * @param model  Название бренда телефона
     * @param color  Цвет
     * @param weight Вес
     * @param memory Память
     * @param size   Размеры (1) - Длина, (2) - Ширина, (3) - Высота
     */
    public Telephone(String model, String color, int weight, int memory, float[] size) {
        this.setCount();
        this.setModel(model);
        this.setColor(color);
        this.setWeight(weight);
        this.setMemory(memory);
        this.setSize(size);
        this.getInformation();
    }

    public void getInformation() {
        System.out.println(getName() + getCount() + "\n" + getModel() + getColor() + "Вес: " + getWeight() + " г.\n" + "Память: " + getMemory() + " гб.\n" + "Размеры: " + "Длина - " + getSize()[0] + " мм.; Ширина - " + getSize()[1] + " мм.; Высота - " + getSize()[2] + " мм.\n");
    }

    public void setCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public String getColor() {
        return "Цвет: " + color + "\n";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getModel() {
        return "Модель: " + model + "\n";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return NAME;
    }

    public void setSize(float[] size) {
        this.size = size;
    }

    public float[] getSize() {
        return size;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public Byte getByteExample() {
        return byteExample;
    }

    public void setByteExample(Byte byteExample) {
        this.byteExample = byteExample;
    }

    public Short getShortExample() {
        return shortExample;
    }

    public void setShortExample(Short shortExample) {
        this.shortExample = shortExample;
    }

    public Integer getIntegerExample() {
        return integerExample;
    }

    public void setIntegerExample(Integer integerExample) {
        this.integerExample = integerExample;
    }

    public Long getLongExample() {
        return longExample;
    }

    public void setLongExample(Long longExample) {
        this.longExample = longExample;
    }

    public Boolean getBooleanExample() {
        return booleanExample;
    }

    public void setBooleanExample(Boolean booleanExample) {
        this.booleanExample = booleanExample;
    }

    public Character getCharacterExample() {
        return characterExample;
    }

    public void setCharacterExample(Character characterExample) {
        this.characterExample = characterExample;
    }

    public Double getDoubleExample() {
        return doubleExample;
    }

    public void setDoubleExample(Double doubleExample) {
        this.doubleExample = doubleExample;
    }

    public Float getFloatExample() {
        return floatExample;
    }

    public void setFloatExample(Float floatExample) {
        this.floatExample = floatExample;
    }

    public String getStringExample() {
        return stringExample;
    }

    public void setStringExample(String stringExample) {
        this.stringExample = stringExample;
    }
}
