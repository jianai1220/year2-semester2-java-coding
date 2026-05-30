package extendFunction.addMenu;

public class Coffee extends Drink{
    public Coffee(){
        super("Latte", 8.00, "Less Ice", "No Sugar");
    }
    @Override
    public void prepare(){
        System.out.println("Preparing " + getName() + " with " + getIce() + " and " + getSugar() + "...");
    }
}