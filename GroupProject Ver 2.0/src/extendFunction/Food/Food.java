package extendFunction.Food;

// The abstract class for all the 'food' subclasses
public abstract class Food{
  private String name;
  private double price;
  private String spiciness;

  public Food(String name, double price, String spiciness){
      this.name = name;
      this.price = price;
      this.spiciness = spiciness;
  }

  public String getName(){
      return name;
  }

  public double getPrice(){
      return price;
  }
  
  public String getSpiciness(){
      return spiciness;
  }
  public abstract void prepare();
}
