package extendFunction.Food;

// Burger extends from Food
public class Burger extends Food {
    // Constructor

  public Burger() {
    super("Double Cheeseburger", 18.35, "extra spicy");
  }

  @Override
  public void prepare(){
    System.out.println("Preparing " + getName() + " with spiciness: " + getSpiciness() + "...");
  }
}
