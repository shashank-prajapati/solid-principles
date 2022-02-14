package solidPrinciplesSatisfied;

public class Car implements Vehicle {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void startEngine(){
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
}
