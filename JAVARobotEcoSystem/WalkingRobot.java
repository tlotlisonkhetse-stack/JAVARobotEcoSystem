
public class WalkingRobot extends BaseRobot 
{

    private int numberOfLegs;

    // Constructor
    public WalkingRobot(String id, int batteryLevel, int numberOfLegs) 
    {

        super(id, batteryLevel);
        this.numberOfLegs = numberOfLegs;
    }

    // Walking behaviour
    public void walk() 
    {

        if (!isRunning()) {
            throw new IllegalStateException(
                "Start the robot before walking."
            );
        }

        System.out.println(getId() + " is walking using "
                + numberOfLegs + " legs.");
    }

    // Obstacle negotiation
    public void negotiateObstacle() 
    {

        if (!isRunning()) 
        {
            throw new IllegalStateException(
                "No negotiate obstacles."
            );
        }

        System.out.println(getId() + " is crossing an obstacle.");
    }

    // Display robot information
    @Override
    public void status() 
    {

        System.out.println("Walking Robot Status:");

        super.status();

        System.out.println("Number of legs: " + numberOfLegs);
    }
}
