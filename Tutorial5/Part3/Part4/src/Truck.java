public class Truck extends Car{
    private float horsepower;

    public Truck(String name, float horsepower)
    {
        super(name, 2);
        this.horsepower = horsepower;
    }

    @Override
    public String describe(){
        return "Truck: " + getName() + ", horsepower: " + horsepower;
    }
}
