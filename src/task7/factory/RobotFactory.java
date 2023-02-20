package task7.factory;

import task7.entity.Body;
import task7.entity.Head;
import task7.entity.Robot;

import java.util.Random;

public class RobotFactory {
    private final Random random = new Random();
    public static final int ONE = 0;
    private static final int THREE = 3;
    private static final int NINE = 9;
    private int id;

    public void createRobot() {
        Robot[] robots = new Robot[NINE];
        HeadFactory headFactory = new HeadFactory();
        BodyFactory bodyFactory = new BodyFactory();

        for (int i = ONE; i < robots.length; i++) {
            int num = random.nextInt(bodyFactory.create().length);
            robots[i] = new Robot(headFactory.create()[i], bodyFactory.create()[num], "Prototype_" + i);
        }

        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }

    class HeadFactory implements Factory<Head> {

        @Override
        public Head[] create() {
            Head[] heads = new Head[NINE];
            for (int i = ONE; i < heads.length; i++) {
                id = ++id == THREE ? ONE : id;
                heads[i] = Head.values()[id];
            }
            return heads;
        }
    }

    class BodyFactory implements Factory<Body> {

        @Override
        public Body[] create() {
            Body[] bodies = new Body[NINE];
            for (int i = ONE; i < bodies.length; i++) {
                id = ++id == THREE ? ONE : id;
                bodies[i] = Body.values()[id];
            }
            return bodies;
        }
    }
}

