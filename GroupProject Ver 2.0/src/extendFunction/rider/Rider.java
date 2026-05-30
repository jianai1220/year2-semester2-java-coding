package extendFunction.rider;

// Interface for OrderPickup
interface OrderPickup {
    void pickupOrder();
}

// Abstract class for Rider
public abstract class Rider {
    private String name;

    public Rider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for delivery
    public abstract void deliver();
    public abstract void pickupOrder();
}
