import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String airplaneType;
    private int maximumSpeed;
    private int maximumDistance;
    private String tailID;
    private List<Flight> assignedFlights;

    public Plane(String airplaneType, int maximumSpeed, int maximumDistance, String tailID){
        this.airplaneType = airplaneType;
        this.maximumSpeed = maximumSpeed;
        this.maximumDistance = maximumDistance;
        this.tailID = tailID;
        this.assignedFlights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        assignedFlights.add(flight);
        flight.setAssignedPlane(this);
    }

    public List<Flight> getAssignedFlights(){
        return assignedFlights;
    }

    public String getTailID(){
        return tailID;
    }

    public String getAirplaneType(){
        return airplaneType;
    }
}
