package task7;

public class Robot<H extends Part<String>, B extends Part<String>> {

    private final H head;
    private final B body;
    private final String name;

    public Robot(H head, B body, String name) {
        this.head = head;
        this.body = body;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head.getName() +
                ", body=" + body.getName() +
                ", name='" + name + '\'' +
                '}';
    }
}
