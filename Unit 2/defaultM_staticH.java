/*
                        DEFAULT METHODS AND STATIC HELPER METHODS
    
 */

interface vehicle
{
    default void dispVehicle()
    {
        System.out.println("interface vehicle");
    }

    static void showVehicle()
    {
        System.out.println("vehicle types: car, bike, truck");
    }
}

class car implements vehicle{
    public void dispVehicle()
    {
        vehicle.super.dispVehicle();
        System.out.println("car properties");
    }

    public void showVehicle()
    {
        vehicle.showVehicle();
        System.out.println("car: sedan, hatchback");
    }
}

public class defaultM_staticH{
    public static void main(String args[])
    {
        car c1 = new car();
        c1.dispVehicle();
        c1.showVehicle();
    }
}
