// FoodOrderingSystem.java
import java.util.*;
import extendFunction.*;
import extendFunction.addMenu.*;
import extendFunction.Food.*;
import extendFunction.Location.*;
import extendFunction.rider.*;
import extendFunction.Pay.*;


// Customer class
class Customer {
  private String name;
  public static double grandTotal = 0.0;
  private Order orderMethod;
  private payment pay;
  private location l = new PickUpLocation("N24, Faculty of Computing");

  public Customer (String name, Order orderMethod) 
  {
    this.name = name;
    this.orderMethod = orderMethod;
  }

  public String getName(){
    return name;
  }

  public void printL(){
    l.printLocation();
  }

  public void placeOrder(Food food, Drink drink)
  {
    orderMethod.orderFood(food,drink);
  }

  public void selectPayment() {
    String paymentMethod;
    Scanner scanner = new Scanner(System.in);
    boolean validPayment = false;
   
      System.out.println("Enter Credit Card or Cash to select your payment method: ");
      paymentMethod = scanner.nextLine();
      
    do
      if(paymentMethod.equals("Credit Card") ) {  
      pay = new CreditCardPayment(grandTotal);
      pay.processPayment();
      validPayment = true;
    }else if(paymentMethod.equals("Cash") ) {
      pay = new Cash(grandTotal);
      pay.processPayment();
      validPayment = true;
    }else {
      System.out.println("Invalid payment method. Please try again.");
    } while (!validPayment);
    
    }

  }

// Order class as interface
interface Order {
  void orderFood(Food food, Drink drink);
}

// OfflineOrder class implements from Order
class OfflineOrder implements Order{
  private static final double SERVICE_CHARGE = 2.0;
  
  public void orderFood(Food f, Drink d)
  {
    f.prepare();
    d.prepare();
    System.out.println(f.getName() + " ordered offline, along with " + d.getName() + ".");
    System.out.printf("Total : RM%.2f" , (f.getPrice() + d.getPrice() + SERVICE_CHARGE)); 
    Customer.grandTotal += (f.getPrice() + d.getPrice() + SERVICE_CHARGE);
    System.out.println();
  }
}  

// OnlineOrder
class OnlineOrder implements Order{
  private static final double SERVICE_CHARGE = 1.0;

  public void orderFood(Food f, Drink d){
    f.prepare();
    d.prepare();
    System.out.println(f.getName() + " ordered online, along with " + d.getName() + ".");
    System.out.printf("Total : RM%.2f" ,(f.getPrice() + d.getPrice() + SERVICE_CHARGE)); 
    Customer.grandTotal += (f.getPrice() + d.getPrice() + SERVICE_CHARGE);
    System.out.println();
}

// MAIN CLASS: FOOD ORDERING SYSTEM
public static class FoodOrderingSystem {
  //Method to add a customer to the system
  public static void addCustomer(Vector<Customer> cList, Customer c) { 
    cList.add(c); 
  }

  // Method to take orders from all customers in the system
  public static void takeOrders(Vector<Customer> cList) { 
    for (Customer c: cList) { 
      c.placeOrder(new Pizza(), new Coffee()); 
      c.placeOrder(new Burger(), new Carbonated()); 
      c.placeOrder(new Fries(), new Carbonated()); 
      c.placeOrder(new Dessert(), new Coffee()); 
      c.placeOrder(new Chicken(), new Coffee()); 
    }
  }

  public static void main(String[] args) {
	 // Create a new customer list
	 Vector<Customer> cList = new Vector<>();

	 //Add customers to the system
	 addCustomer(cList, new Customer("Haris", new OnlineOrder()));
	 addCustomer(cList, new Customer("Aliya", new OfflineOrder()));
   addCustomer(cList, new Customer("Junhui", new OnlineOrder()));
   
  
	 //Take orders from all customers
	 takeOrders(cList);
	 System.out.printf("Grand Total Sales = RM %.2f" , Customer.grandTotal);
   System.out.println();
   cList.get(0).selectPayment();
   
   System.out.println();
   Rider rider1 = new Motorcycle("Amier", "ABC123");
   Rider rider2 = new Bicycle ("Mike", "Mountain");

   System.out.println();
   rider1.deliver();
   rider2.deliver();

   System.out.println();
   rider1.pickupOrder();
   rider2.pickupOrder();

   for (Customer c: cList) { 
    c.printL();
  }
  
  }
}
}

