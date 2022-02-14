package solidPrinciplesViolated;

public class Car implements Vehicle {

    private Engine engine;

    public Car(){
        engine = new Engine();
    }

    public void start(){
        engine.start();
    }

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void stop() {
        System.out.println("Stopped...");
    }

    @Override
    public void openSunRoof() {
        System.out.println("Opening SunRoof...");
    }

    @Override
    public void repairVehicle() {
        System.out.println("Repairing...");
    }
}
