package solidPrinciplesSatisfied;

import solidPrinciplesViolated.Bike;

public class MainClass {
    public static void main(String[] args){
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();
        Car heroHonda = new Car(petrolEngine);
        Car jeep = new Car(dieselEngine);

        CarWithSunRoof MGHector = new CarWithSunRoof(petrolEngine);

        heroHonda.startEngine();
        heroHonda.drive();
        heroHonda.stop();

        jeep.startEngine();
        jeep.drive();
        jeep.stop();

        MGHector.startEngine();
        MGHector.openSunRoof();

        solidPrinciplesViolated.Bike bike = new Bike();

        bike.openSunRoof();
    }
}
