package extendFunction.Food;

// Dessert extends from Food
public class Dessert extends Food {
 // Constructor
  public Dessert() {
    super("Habanero Sundae", 2.00, "deadly spicy");
  }
  
  @Override
  public void prepare()
  {
    System.out.println("Preparing " + getName() + " with spiciness: " + getSpiciness() + "...");
  }
}
