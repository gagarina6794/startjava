package motonew;

public class Unicycle extends Motorcycle {

    public String name = "Unicycle";
    public double fuelCapacity = 0.8;
    public int wheel = 1;

    @Override
    public void chooseDrivingMode(String typeRoad) {
        if (typeRoad.equals("of-road")) {
            System.out.println("I can drive on off-road.");
        } else {
            System.out.println("Wrong type of road!");
        }
    }
}
