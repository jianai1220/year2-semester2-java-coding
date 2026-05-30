public class BeverageEnumExample {
    enum Beverage{
        COFFEE("Coffee", 2.5),
        TEA("Tea", 2.0),
        SODA("Soda", 1.5),
        JUICE("Juice", 3.0),
        WATER("Water", 1.0);

        private String name;
        private double price;

        Beverage(String name, double price){
            this.name = name;
            this.price = price;
        }

        public String getName(){
            return name;
        }

        public double getPrice(){
            return price;
        }
    }

    public static void displayEnumAndValue(Beverage beverage){
        System.out.println(beverage.name() + " - " + beverage.getName() + " - RM" + beverage.getPrice());
    }

    public static void main(String[] args) {
        Beverage myDrink = Beverage.COFFEE;
        System.out.println("My favorite drink is " + myDrink.getName() + " - RM" + myDrink.getPrice());

        System.out.println("\nEnum values and their properties:");
        for(Beverage drink : Beverage.values()){
            displayEnumAndValue(drink);
        }
    }
}
