import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alisa");
        names.add("Sheng");
        names.add("Kumar");
        names.add("David");

        System.out.println("Names in the ArrayList:");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        int index = 2;
        System.out.println("\nThe element at index " + index + " is: " + names.get(index));

        String newName = "Eve";
        names.set(index,newName);

        System.out.println("\nUpdated names in the ArrayList:");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
