package extendFunction.Food;

// Pizza extends from Food
public class Pizza extends Food {
  // Constructor
  public Pizza() {
    super("Hawaiian Chicken", 40.90, "weak");
  }
  
  @Override
  public void prepare()
  {
    System.out.println("Preparing " + getName() + " with spiciness: " + getSpiciness() + "...");
  }
}