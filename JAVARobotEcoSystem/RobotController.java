
import java.util.ArrayList;
import java.util.List;

public class RobotController 
{

    private List<Robot> robots;

    // Constructor
    public RobotController() 
    {
        robots = new ArrayList<>();
    }

    // Add robots to the list
    public void addRobot(Robot robot) 
    {

        robots.add(robot);

        System.out.println("Robot added successfully.");
    }

    // Start all robots
    public void startAllRobots() 
    {

        System.out.println("\nStarting all robots");

        for (Robot robot : robots) 
        {

            try 
            {
                robot.start();
            }
            catch (IllegalStateException e) 
            {
                System.out.println("Warning: " + e.getMessage());
            }
        }
    }

    // Display all robot statuses
    public void displayAllRobots() 
    {

        System.out.println("\nMy Robot Information:");

        for (Robot robot : robots) 
        {

            robot.status();

            System.out.println("----------------------");
        }
    }

    // Stop all robots
    public void stopAllRobots() 
    {

        System.out.println("\nStopping all robots...");

        for (Robot robot : robots) 
        {
            robot.stop();
        }
    }
}
