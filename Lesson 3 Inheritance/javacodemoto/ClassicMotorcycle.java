package motonew;

public class ClassicMotorcycle extends Motorcycle {

    public String name = "ClassicMotorcycle";
    public double fuelCapacity = 2.5;
    public int wheel = 2;
    public boolean carriage = false;

    @Override
    public void chooseDrivingMode(String typeRoad) {
        if (typeRoad.equals("road")) {
            System.out.println("I can drive on roads.");
        } else {
            System.out.println("Wrong type of road!");
        }
    }
}
