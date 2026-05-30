import java.util.Date;

public class App {
    public static void main(String[] args){
        Plane plane1 = new Plane("Boeing MH737", 500, 300, "AK6410");
        Flight flight1 = new Flight(101, new Date(), "JHB", "KUL");
        Flight flight2 = new Flight(102, new Date(), "KBR", "PEN");

        plane1.addFlight(flight1);
        plane1.addFlight(flight2);

        flight1.delayFlight(30);

        System.out.println("Flight 1 arrival time: " + flight1.getArrivalTime());
        System.out.println("Flight 2 arrival time: " + flight2.getArrivalTime());

        
        System.out.println("Flight 1 assigned plane: " + flight1.getAssignedPlane().getTailID());
        System.out.println("Flight 2 assigned plane: " + flight2.getAssignedPlane().getTailID());

        System.out.println("Plane " + plane1.getAirplaneType() + " " + plane1.getTailID() + " has the following flights:");
        for(Flight flight : plane1.getAssignedFlights()){
            System.out.println("Flight number: " + flight.getFlightNumber());
        }
    }
}
