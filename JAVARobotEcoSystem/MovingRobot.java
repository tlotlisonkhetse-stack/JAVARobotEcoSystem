
public class MovingRobot extends BaseRobot 
{

    private int numberOfWheels;

    // Constructor
    public MovingRobot(String id, int batteryLevel, int numberOfWheels) 
    {

        super(id, batteryLevel);
        this.numberOfWheels = numberOfWheels;
    }

    // Method for driving
    public void drive() 
    {

        if (!isRunning()) 
        {
            throw new IllegalStateException(
                "Start the robot before driving."
            );
        }

        System.out.println(getId() + " Nowis driving on "
                + numberOfWheels + " wheels.");
    }

    // Display robot information
    @Override
    public void status() 
    {

        System.out.println("Moving Robot Status:");

        super.status();

        System.out.println("Number of wheels: " + numberOfWheels);
    }
}
