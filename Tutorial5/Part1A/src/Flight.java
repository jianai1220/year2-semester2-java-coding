import java.util.Date;

public class Flight{
    private int flightNumber;
    private Date departureTime;
    private int flightDuration;
    private String departingAirport;
    private String arrivingAirport;
    private Plane assignedPlane;

    public Flight(int flightNumber, Date departureTime, String departingAirpot, String arrivingAirpot){
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.flightDuration = 60;
        this.departingAirport = departingAirpot;
        this.arrivingAirport = arrivingAirpot;
    }

    public void delayFlight(int numberOfMinutes){
        flightDuration += numberOfMinutes;
    }

    public Date getArrivalTime(){
        long departureInMillis = departureTime.getTime();
        long durationInMillis = flightDuration * 60 * 1000;
        return new Date(departureInMillis + durationInMillis);
    }

    public Plane getAssignedPlane(){
        return assignedPlane;
    }

    public void setAssignedPlane(Plane plane){
        this.assignedPlane = plane;
    }
    
    public int getFlightNumber(){
        return flightNumber;
    }
}