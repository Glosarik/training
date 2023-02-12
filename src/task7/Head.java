package task7;

public enum Head implements Part<String> {
    OVAL("Oval"), ROUND("Round"), SQUARE("Square");

    private final String name;

    Head(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
