public class Car extends MotorVehicle{
    private int numOfDoors;

    public Car(String name, int numOfDoors){
        super(name, 4, 2.0f);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String describe(){
        return "Car: " + getName() + ", number of doors: " + numOfDoors;
    }

    @Override
    public String honkHorn(){
        return "Beep! Beep!";
    }
}
