package task7.entity;

public enum Body implements Part<String> {
    LONG("Длинное"),
    SHORT("Короткое"),
    WIDE("Широкое");

    private final String name;

    Body(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
