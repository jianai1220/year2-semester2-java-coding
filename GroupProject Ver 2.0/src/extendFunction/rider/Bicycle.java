package extendFunction.rider;

// Bicycle class (inherits from Rider and implements OrderPickup)
public class Bicycle extends Rider implements OrderPickup {
    private String bicycleType;

    public Bicycle(String riderName, String bicycleType) {
        super(riderName);
        this.bicycleType = bicycleType;
    }

    public String getBicycleType() {
        return bicycleType;
    }

    @Override
    public void deliver() {
        System.out.println(getName() + " is delivering by " + bicycleType + " bicycle");
    }

    @Override
    public void pickupOrder() {
        System.out.println(getName() + " picked up the order using " + bicycleType + " bicycle");
    }
}