package task7.entity;

public enum Head implements Part<String> {
    OVAL("Овальная"),
    ROUND("Круглая"),
    SQUARE("Квадратная");

    private final String name;

    Head(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
