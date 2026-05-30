import java.util.Vector;

public class ProductVector {
    public static void main(String[] args) {
        Vector<Product> products = new Vector<>();
        
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Smartphone", 599.99));
        products.add(new Product("Tablet", 299.99));
        
        System.out.println("Products:");
        for(int i=0; i<products.size(); i++){
            Product product = products.elementAt(i);
            System.out.println(product);
        }
    
        int index = 1;
        double newPrice = 399.99;
        products.elementAt(index).setPrice(newPrice);
    
        System.out.println("\nUpdated Products:");
        for(int i=0; i<products.size(); i++){
            Product product = products.elementAt(i);
            System.out.println(product);
        }
    }
}

class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        return "Product: " + name + ", Price: RM" + price;
    }
}
