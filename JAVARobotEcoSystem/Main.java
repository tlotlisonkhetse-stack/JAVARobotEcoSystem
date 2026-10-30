
public class Main 
{

    public static void main(String[] args) 
    {

        System.out.println("WELCOME TO MY ROBOT ECOSYSTEM");

        // Creating robot objects
        FlyingRobot flyingRobot =
                new FlyingRobot("F901020260", 90, 150.0);

        MovingRobot movingRobot =
                new MovingRobot("M901020750", 80, 4);

        WalkingRobot walkingRobot =
                new WalkingRobot("W901020850", 75, 2);

        // Creating the controller
        RobotController controller = new RobotController();

        // Adding robots to the controller
        controller.addRobot(flyingRobot);
        controller.addRobot(movingRobot);
        controller.addRobot(walkingRobot);

        // Starting all robots
        controller.startAllRobots();

        // Displaying robot information
        controller.displayAllRobots();

        // Testing individual robot behaviours
        System.out.println("\nTESTING ROBOT ACTIVITIES");

        flyingRobot.fly();
        movingRobot.drive();
        walkingRobot.walk();
        walkingRobot.negotiateObstacle();

        // Demonstrating method overloading
        System.out.println("\nTESTING METHOD OVERLOADING");

        movingRobot.move(25.0);
        movingRobot.move(15.0, "North");

        // Changing flying robot altitude
        flyingRobot.setAltitude(200.0);

        // Testing exception handling
        System.out.println("\nTESTING LOW BATTERY");

        try {

            FlyingRobot lowBatteryRobot =
                    new FlyingRobot("FLY404", 5, 100.0);

            lowBatteryRobot.start();

        }
        catch (IllegalStateException e) {

            System.out.println("Error: " + e.getMessage());
        }

        // Stopping all robots
        controller.stopAllRobots();

        System.out.println("\nROBOT ECOSYSTEM CLOSED.");
    }
}
