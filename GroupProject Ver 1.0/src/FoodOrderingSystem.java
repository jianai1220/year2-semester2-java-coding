// FoodOrderingSystem.java
import java.util.*;
import extendFunction.*;

// FOOD
/*abstract class Food{
  private String name;
  private double price;

  public Food(String name, double price){
      this.name = name;
      this.price = price;
  }

  public String getName(){
      return name;
  }

  public double getPrice(){
      return price;
  }
  
  public abstract void prepare();
}

// PIZZA
class Pizza extends Food {
  // Constructor
  public Pizza() {
    super("Hawaiian Chicken", 40.90);
  }
  
  @Override
  public void prepare()
  {
    System.out.println("Preparing " + getName() + "...");
  }
}

// BURGER
class Burger extends Food {
  public Burger() {
    super("Double Cheeseburger", 18.35);
  }

  @Override
  public void prepare(){
    System.out.println("Preparing " + getName() + "...");
  }
}
*/

// ORDER CLASS
interface Order {
  void orderFood(Food food);
}

// OFFLINE ORDER 
class OfflineOrder implements Order{
  private static final double SERVICE_CHARGE = 2.0;
  
  public void orderFood(Food f)
  {
    f.prepare();
    System.out.println(f.getName() + " ordered offline.");
    System.out.println("Total : RM" + (f.getPrice() + SERVICE_CHARGE)); 
    Customer.grandTotal += (f.getPrice() + SERVICE_CHARGE);
    System.out.println();
  }
}  

// ONLINE ORDER
class OnlineOrder implements Order{
  private static final double SERVICE_CHARGE = 1.0;

  public void orderFood(Food f){
    f.prepare();
    System.out.println(f.getName() + " ordered online.");
    System.out.println("Total : RM" + (f.getPrice() + SERVICE_CHARGE)); 
    Customer.grandTotal += (f.getPrice() + SERVICE_CHARGE);
    System.out.println();
  }
}

// CUSTOMER
class Customer {
  private String name;
  public static double grandTotal = 0.0;
  private Order orderMethod;

  public Customer (String name, Order orderMethod)
  {
    this.name = name;
    this.orderMethod = orderMethod;
  }

  public void placeOrder(Food food)
  {
    orderMethod.orderFood(food);
  }
}

// MAIN CLASS: FOOD ORDERING SYSTEM
public class FoodOrderingSystem {
  //Method to add a customer to the system
  public static void addCustomer(Vector<Customer> cList, Customer c) { 
    cList.add(c); 
  }

  // Method to take orders from all customers in the system
  public static void takeOrders(Vector<Customer> cList) { 
    for (Customer c: cList) { 
      c.placeOrder(new Pizza(), new Coffee()); 
      c.placeOrder(new Burger(), new Carbonated()); 
    }
  }

  public static void main(String[] args) {
	 // Create a new customer list
	 Vector<Customer> cList = new Vector<>();

	 //Add customers to the system
	 addCustomer(cList, new Customer("Haris", new OnlineOrder()));
	 addCustomer(cList, new Customer("Aliya", new OfflineOrder()));


	 //Take orders from all customers
	 takeOrders(cList);
	 System.out.printf("Grand Total Sales = RM %.2f" , Customer.grandTotal);
  }
}