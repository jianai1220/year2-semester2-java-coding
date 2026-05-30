public class Doctor {
    private String department;
    private String name;
    
    Doctor(){};

    public void setDepartment(String d){
        this.department = d;
    }

    public void setName(String n){
        this.name = n;
    }

    public void print(){
        System.out.println("Doctor Information: " + "\nName: " + name + "\nDepartment: " + department);
    }
}
