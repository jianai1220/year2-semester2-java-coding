package extendFunction.Location;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector; 

public class PickUpLocation extends location {
    public PickUpLocation(String address) {
        super(address);
    }

    @Override
    public void printLocation(){
        System.out.println("Order Picked Up From: " + getAddress());
    }
}
