package extendFunction.rider;

// Motorcycle class (inherits from Rider and implements OrderPickup)
public class Motorcycle extends Rider implements OrderPickup {
    private String licensePlate;

    public Motorcycle(String riderName, String licensePlate) {
        super(riderName);
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public void deliver() {
        System.out.println(getName() + " is delivering by motorcycle (" + licensePlate + ")");
    }

    @Override
    public void pickupOrder() {
        System.out.println(getName() + " picked up the order using motorcycle (" + licensePlate + ")");
    }
}