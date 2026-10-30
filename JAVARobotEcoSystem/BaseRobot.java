
public abstract class BaseRobot implements Robot 
{

    // Attributes
    private String id;
    private int batteryLevel;
    private boolean running;

    // Constructor
    public BaseRobot(String id, int batteryLevel) 
    {

        this.id = id;
        this.batteryLevel = batteryLevel;
        this.running = false;
    }

    // Getters
    public String getId() 
    {
        return id;
    }

    public int getBatteryLevel() 
    {
        return batteryLevel;
    }

    public boolean isRunning() 
    {
        return running;
    }

    // Start method
    @Override
    public void start() 
    {

        if (batteryLevel <= 10) 
        {
            throw new IllegalStateException(
                "Battery is too low to start the robot."
            );
        }

        running = true;
        System.out.println(id + " has started.");
    }

    // Stop method
    @Override
    public void stop() 
    {

        running = false;
        System.out.println(id + " has stopped.");
    }

    // Display robot status
    @Override
    public void status() 
    {

        System.out.println("Robot ID: " + id);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Running: " + running);
    }

    // Method overloading: move using speed
    public void move(double speed) 
    {

        if (!isRunning()) 
        {
            throw new IllegalStateException(
                "Start the robot before moving."
            );
        }

        System.out.println(id + " is moving at "
                + speed + " km/h.");
    }

    // Method overloading: move using speed and direction
    public void move(double speed, String direction) 
    {

        if (!isRunning()) 
        {
            throw new IllegalStateException(
                "Start the robot before moving."
            );
        }

        System.out.println(id + " is moving at "
                + speed + " km/h towards " + direction + ".");
    }

}
