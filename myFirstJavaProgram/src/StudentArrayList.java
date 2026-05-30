import java.util.ArrayList;
public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.add(20);
        ageList.add(21);
        ageList.add(22);

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Abu");
        nameList.add("Fatimah");
        nameList.add("Boon");

        ArrayList<Student> studentList = new ArrayList<>();
        for(int i = 0; i<nameList.size(); i++){
            String name = nameList.get(i);
            int age = ageList.get(i);
            studentList.add(new Student(name,age));
        }

        studentList.add(new Student("Ali", 23));
        studentList.add(new Student("Chiew", 24));
        studentList.add(new Student("Puteri", 25));

        System.out.println("ArrayList of Student objects:");
        for(int i = 0; i<studentList.size(); i++)
        {
            Student student = studentList.get(i);
            System.out.println("Student at index " + i + ": " + student.getName() + "(Age: " + student.getAge() + ")");
        }
        studentList.set(4, new Student("Phoom", 23));

        studentList.remove(3);

        nameList.remove("Ali");
        nameList.add(0, "Naufal");

        studentList.add(3, new Student(nameList.get(0), 20));
        
        System.out.println("ArrayList of Student objects after amendment:");
        for(int i=0; i<studentList.size(); i++)
        {
            Student student = studentList.get(i);
            System.out.println("Student at index "+i+": " + student.getName() + " (Age: " + student.getAge() + ")");
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
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
