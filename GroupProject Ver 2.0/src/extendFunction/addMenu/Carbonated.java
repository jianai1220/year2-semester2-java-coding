package extendFunction.addMenu;

public class Carbonated extends Drink{
    public Carbonated(){
        super("Carbonated Drink", 2.80, "No ice", "Normal");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing " + getName() + " with " + getIce() + "...");
    }
}
