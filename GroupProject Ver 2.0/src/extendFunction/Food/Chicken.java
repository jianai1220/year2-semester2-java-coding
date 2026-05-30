package extendFunction.Food;

// Chicken extends from Food
public class Chicken extends Food {
 // Constructor
  public Chicken() {
    super("Roasted Wings x6", 15.00, "spicy");
  }
  
  @Override
  public void prepare()
  {
    System.out.println("Preparing " + getName() + " with spiciness: " + getSpiciness() + "...");
  }
}
