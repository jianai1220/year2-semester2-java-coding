import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Najwa");
        Person person2 = new Person("Boon");

        Company company1 = new Company("TechCorp");
        Company company2 = new Company("BizInc");

        Job job1 = new Job(person1, company1, 7000);
        Job job2 = new Job(person2, company1, 8000);
        Job job3 = new Job(person1, company2, 7500);

        person1.addJob(job1);
        person1.addJob(job3);
        person2.addJob(job2);

        company1.addJob(job1);
        company1.addJob(job2);
        company2.addJob(job3);

        displayPersonJobs(person1);
        displayPersonJobs(person2);

        displayCompanyJobs(company1);
        displayCompanyJobs(company2);
    }

    public static void displayPersonJobs(Person person){
        System.out.println(person.getName() + " has the following jobs:");
        for(Job job : person.getJobs())
            System.out.println(" - Company: "+job.getCompany().getName() + ", Salary: RM" + job.getSalary());
    }

    public static void displayCompanyJobs(Company company){
        System.out.println(company.getName() + " has the following employees:");
        for(Job job : company.getJobs()){
            System.out.println(" - Employee: " + job.getPerson().getName() + ", Salary: RM"+job.getSalary());
        }
    }
}
