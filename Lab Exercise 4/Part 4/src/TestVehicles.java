class Vehicle{
    public Vehicle(){
        System.out.println("This is a Vehicle");
    }

    public void goBackward(double speed, double accel){
        System.out.println("Vehicle moving backward at speed " + speed + " with acceleration " + accel);
    }

    public void goForward(double speed, double accel){
        System.out.println("Vehicle moving forward at speed " + speed + " with acceleration " + accel);
    }

    public boolean start(){
        System.out.println("Vehicle started.");
        return true;
    }

    public void stop(){
        System.out.println("Vehicle stopped.");
    }    
}

class Car extends Vehicle{
    private int numWheels;
    private double weight;
    
    public Car(int numWheels, double weight){
        System.out.println("This is a Car.");
        this.numWheels = numWheels;
        this.weight = weight;
    }

    public int getNumWheels(){
        return numWheels;
    }

    public double getWeight(){
        return weight;
    }
}

class Convertible extends Car{
    public Convertible(int numWheels, double weight){
        super(numWheels, weight);
        System.out.println("This is a Convertible.");
    }
    public boolean lowerRoof(){
        System.out.println("Convertible is lowering the roof.");
        return true;
    }

    public boolean raiseRoof(){
        System.out.println("Convertible is raising the roof.");
        return true;
    }
}

class Pickup extends Vehicle{
    private double loadCapacity;
    private int numWheels;
    private double weight;

    public Pickup(){
        super();
        System.out.println("This is a Pickup.");
    }

    public double getLoadCapacity(){
        return loadCapacity;
    }

    public int getNumWheels(){
        return numWheels;
    }

    public double getWeight(){
        return weight;
    }

    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}

class Dumptruck extends Vehicle{
    private double loadCapacity;
    private int numWheels;
    private double weight;

    public Dumptruck(){
        super();
        System.out.println("This is a Dumptruck.");
    }

    public void lowerLoad(){
        System.out.println("Dumptruck is lowering the load.");
    }

    public void raiseLoad(){
        System.out.println("Dumptruck is raising the load.");
    }
}

public class TestVehicles {
    public static void main(String[] args){
        Convertible convertible = new Convertible(4, 1500.0);
        convertible.start();
        convertible.lowerRoof();
        convertible.raiseRoof();
        convertible.goBackward(30.0,5.0);
        convertible.stop();

        Dumptruck dumptruck = new Dumptruck();
        dumptruck.start();
        dumptruck.lowerLoad();
        dumptruck.raiseLoad();
        dumptruck.goForward(20.0, 3.0);
        dumptruck.stop();
    }
}
