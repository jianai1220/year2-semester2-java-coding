package extendFunction.Food;

// Fries extends from Food
public class Fries extends Food {
 // Constructor
  public Fries() {
    super("Crispy Curly Fries", 7.00, "mild");
  }
  
  @Override
  public void prepare()
  {
    System.out.println("Preparing " + getName() + " with spiciness: " + getSpiciness() + "...");
  }
}
