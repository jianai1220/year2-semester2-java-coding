public class App {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee("Alif", "12345");
        Employee emp2 = new Employee("Yeoh", "67890");
        Employee emp3 = new Employee("Loges", "54321");

        Department dept = new Department("Human Resource");

        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);

        System.out.println(emp1 + "\n" + emp2 + "\n" + emp3);

        System.out.println(dept);
    }
}
