import java.util.Vector;
public class LecturerVector {
    public static void main(String[] args) {
        Vector<Integer> ageVector = new Vector<>();
        ageVector.addElement(40);
        ageVector.addElement(45);
        ageVector.addElement(50);

        Vector<String> nameVector = new Vector<>();
        nameVector.addElement("Dr. Ahmad");
        nameVector.addElement("Prof. Lisa");
        nameVector.addElement("Dr. Pham");

        Vector<Lecturer> lecturerVector = new Vector<>();
        for(int i=0; i<nameVector.size(); i++){
            String name = nameVector.get(i);
            int age = ageVector.get(i);
            lecturerVector.addElement(new Lecturer(name, age));
        }
        lecturerVector.addElement(new Lecturer("Dr. Maria", 55));
        lecturerVector.addElement(new Lecturer("Prof. Rahman", 60));
        lecturerVector.addElement(new Lecturer("Dr. Sarah", 48));

        System.out.println("Vector of Lecturer objects:");
        for(int i=0; i<lecturerVector.size(); i++)
        {
            Lecturer lecturer = lecturerVector.elementAt(i);
            System.out.println("Lecturer at index " + i + ": " + lecturer.getName() + " (Age: " + lecturer.getAge() + ")");
        }
        System.out.println("The Lecturer Vector Capacity is " + lecturerVector.capacity());

        lecturerVector.setElementAt(new Lecturer("Prof. Emily", 52), 4);
        lecturerVector.removeElementAt(3);

        nameVector.removeElement("Dr Maria");
        nameVector.insertElementAt("Prof. Mikali", 0);

        lecturerVector.insertElementAt(new Lecturer(nameVector.get(0),55),3);

        System.out.println("Vector of Lecturer objects after amendment:");
        for(int i=0; i<lecturerVector.size(); i++)
        {
            Lecturer lecturer = lecturerVector.elementAt(i);
            System.out.println("Lecturer at index " + i + ": " + lecturer.getName() + " (Age: " + lecturer.getAge() + ")");
        }
        lecturerVector.trimToSize();
        System.out.println("The Lecturer Vector Capacity after amendment is " + lecturerVector.capacity());

        System.out.println(lecturerVector.elementAt(0));
    }
}

class Lecturer{
    private String name;
    private int age;

    public Lecturer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
