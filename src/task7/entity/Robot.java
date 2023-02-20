package task7.entity;

import static task7.Constants.*;

public class Robot {

    private final Head head;
    private final Body body;
    private final String name;

    @Override
    public String toString() {
        return CREATE_ROBOT + NAME + this.name + HEAD + this.head.getName() + BODY + this.body.getName();
    }

    public Robot(Head head, Body body, String name) {
        this.head = head;
        this.body = body;
        this.name = name;
    }
}
