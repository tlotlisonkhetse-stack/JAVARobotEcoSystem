
public class FlyingRobot extends BaseRobot 
{

    // Unique attribute
    private double altitude;

    // Constructor
    public FlyingRobot(String id, int batteryLevel, double altitude) 
    {

        super(id, batteryLevel);

        this.altitude = altitude;
    }

    // Flying behaviour
    public void fly() 
    {

        if (!isRunning()) {
            throw new IllegalStateException(
                "Start the flying robot before flying."
            );
        }

        System.out.println(
            getId() + " is flying at " + altitude + " metres."
        );
    }

    // Change altitude
    public void setAltitude(double altitude) 
    {

        if (altitude < 0) {
            throw new IllegalArgumentException(
                "Altitude cannot be negative."
            );
        }

        this.altitude = altitude;

        System.out.println(
            getId() + " altitude is now " + altitude + " metres."
        );
    }

    // Override status method
    @Override
    public void status() 
    {

        System.out.println("Flying Robot Status:");

        super.status();

        System.out.println("Altitude: " + altitude + " metres.");
    }

}
