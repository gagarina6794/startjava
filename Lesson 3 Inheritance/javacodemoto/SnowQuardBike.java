package motonew;

public class SnowQuardBike extends QuardBike {

    public String name = "Snowmobile";
    public String typeOfDrive = "crawler drive";

    @Override
    public void chooseDrivingMode(String typeRoad) {
        if (typeRoad.equals("snow")) {
            System.out.println("I can drive on snow.");
        } else {
            System.out.println("Wrong type of road!");
        }
    }
}
