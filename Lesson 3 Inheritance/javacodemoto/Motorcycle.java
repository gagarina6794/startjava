package motonew;

public abstract class Motorcycle {

    protected String name;
    protected double fuelCapacity;
    protected int wheel;

    protected abstract void chooseDrivingMode(String typeRoad);

    protected void drive() {
        System.out.println("I drive!");
    }

    protected void stop() {
        System.out.println("I stopped!");
    }
}
