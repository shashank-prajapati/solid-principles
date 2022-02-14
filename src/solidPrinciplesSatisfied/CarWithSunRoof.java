package solidPrinciplesSatisfied;

public class CarWithSunRoof extends Car implements SunRoof {
    public CarWithSunRoof(Engine engine) {
        super(engine);
    }

    @Override
    public void openSunRoof() {
        System.out.println("Opening SunRoof...");
    }
}
