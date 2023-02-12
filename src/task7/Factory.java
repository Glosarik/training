package task7;

public class Factory {

    public void createRobot() {
        Robot<Head, Body>[] robots = new Robot[9];
        robots[0] = new Robot<>(Head.OVAL, Body.LONG, "Robot1");
        robots[1] = new Robot<>(Head.ROUND, Body.SHORT, "Robot2");
        robots[2] = new Robot<>(Head.SQUARE, Body.WIDE, "Robot3");
        robots[3] = new Robot<>(Head.OVAL, Body.SHORT, "Robot4");
        robots[4] = new Robot<>(Head.ROUND, Body.WIDE, "Robot5");
        robots[5] = new Robot<>(Head.SQUARE, Body.LONG, "Robot6");
        robots[6] = new Robot<>(Head.OVAL, Body.WIDE, "Robot7");
        robots[7] = new Robot<>(Head.ROUND, Body.LONG, "Robot8");
        robots[8] = new Robot<>(Head.SQUARE, Body.SHORT, "Robot9");

        for (Robot<Head, Body> robot : robots) {
            System.out.println(robot);
        }
    }
}
