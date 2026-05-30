package extendFunction.Location;


public class DeliveryLocation extends location {
    public DeliveryLocation(String address) {
        super(address);
    }

    @Override
    public void printLocation() {
        System.out.println("Order Delivered To: " + getAddress());
    }
}