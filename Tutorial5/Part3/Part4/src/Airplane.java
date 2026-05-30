public class Airplane extends Vehicle{
    private float wingspan;
    private int capacity;
    private boolean landingGearDeployed;

    public Airplane(String name, float wingspan, int capacity){
        super(name);
        this.wingspan = wingspan;
        this.capacity = capacity;
    }

    public void landingGear(boolean deployed){
        this.landingGearDeployed = deployed;
    }

    @Override
    public float move(float distance){
        if(landingGearDeployed){
            return distance/2 * super.move(distance);
        } else{
            return super.move(distance);
        }
    }

    @Override
    public String describe(){
        return "Airplane: " + getName() + ", wingspan: " + wingspan + ", capacity: " + capacity;
    }
}
