package solidPrinciplesViolated;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving Bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Bike");
    }

    @Override
    public void openSunRoof() {
        System.out.println("Oops! I don't have Sun Roof");
    }

    @Override
    public void repairVehicle() {
        System.out.println("Repairing Bike");
    }
}
