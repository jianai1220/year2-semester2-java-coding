public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Item item;

    public OrderDetail(int quantity, String taxStatus, Item item){
        this.quantity = quantity;
        this.taxStatus = taxStatus;
        this.item = item;
    }

    public double calcSubTotal(){
        return item.getPriceForQuantity(quantity);
    }

    public double calcTax(){
        return item.getTax() * quantity;
    }

    public double calcWeight(){
        return item.getShippingWeight() * quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getTaxStatus(){
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus){
        this.taxStatus = taxStatus;
    }

    public Item getItem(){
        return item;
    }

    public void setItem(Item item){
        this.item = item;
    }
}
