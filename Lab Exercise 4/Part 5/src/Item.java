public class Item {
    private double shippingWeight;
    private String description;
    private double price;
    private double tax;

    public Item(double shippingWeight, String description, double price, double tax){
        this.shippingWeight = shippingWeight;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    public double getShippingWeight(){
        return shippingWeight;
    }
    
    public double getPriceForQuantity(int quantity){
        return quantity * price;
    }

    public double getTax(){
        return tax;
    }

    public boolean inStock(){
        return true;
    }
}
