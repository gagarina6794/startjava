package motonew;

public class QuardBike extends Motorcycle {

    public String name = "Quard Bike";
    public double fuelCapacity = 12.5;
    public int wheel = 4;
    public String typeOfDrive = "all-wheel drive";

    @Override
    public void chooseDrivingMode(String typeRoad) {
        if (typeRoad.equals("road") || typeRoad.equals("of-road")) {
            System.out.println("I can drive both: on roads and off-road.");
        } else {
            System.out.println("Wrong type of road!");
        }
    }
}
