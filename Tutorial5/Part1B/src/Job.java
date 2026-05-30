public class Job {
    private Person person;
    private Company company;
    private double salary;

    public Job(Person person, Company company, double salary){
        this.person = person;
        this.company = company;
        this.salary = salary;
    }

    public Person getPerson(){
        return person;
    }

    public Company getCompany(){
        return company;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
