import java.util.ArrayList;

class Cafe{
    private String name;
    private ArrayList<String> menuItems;

    public Cafe(String name){
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addMenuItem(String itemName, double price){
        String menuItem = itemName + " - RM" + price;
        menuItems.add(menuItem);
    }

    public void displayMenu(){
        System.out.println("Menu for " + name + ":");
        for(String item : menuItems){
            System.out.println(item);
        }
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("JavaBean Cafe");
        myCafe.addMenuItem("Espresso", 12.5);
        myCafe.addMenuItem("Latte", 13.0);
        myCafe.addMenuItem("Croissant", 8.0);

        myCafe.displayMenu();
    }
}