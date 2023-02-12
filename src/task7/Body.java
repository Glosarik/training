package task7;

public enum Body implements Part<String> {
    LONG("Long"), SHORT("Short"), WIDE("Wide");

    private final String name;

    Body(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
