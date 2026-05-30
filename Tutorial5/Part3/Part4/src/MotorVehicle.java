public class MotorVehicle extends Vehicle{
    private int numOfWheels;
    private float engineVolume;

    public MotorVehicle(String name, int numOfWheels, float engineVolume){
        super(name);
        this.numOfWheels = numOfWheels;
        this.engineVolume = engineVolume;
    }

    public String honkHorn(){
        return "Honk! Honk!";
    }
}