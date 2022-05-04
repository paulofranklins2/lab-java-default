package one.dio.gof.strategy;

public class RobotTest {
    public static void main(String[] args) {

        BehaviorNormal behaviorNormal = new BehaviorNormal();
        BehaviorDefensive behaviorDefensive = new BehaviorDefensive();
        BehaviorAgressive behaviorAgressive = new BehaviorAgressive();

        Robot robot = new Robot();

        robot.setBehavior(behaviorNormal);
        robot.move();
        robot.setBehavior(behaviorDefensive);
        robot.move();
        robot.setBehavior(behaviorAgressive);
        robot.move();
    }
}
