package extendFunction.addMenu;
public abstract class Drink{
    private String name;
    private double price;
    private String ice;
    private String sweetness;

    public Drink(String name, double price, String ice, String sweetness){
        this.name = name;
        this.price = price;
        this.ice = ice;
        this.sweetness = sweetness;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getIce(){
        return ice;
    }

    public String getSugar(){
        return sweetness;
    }    
    
    public abstract void prepare();
}