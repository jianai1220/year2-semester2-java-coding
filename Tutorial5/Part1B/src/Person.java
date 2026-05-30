import java.util.ArrayList;
import java.util.List;


public class Person{
    private String name;
    private List<Job> jobs;


    public Person(String name){
        this.name = name;
        this.jobs = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<Job> getJobs(){
        return jobs;
    }

    public void addJob(Job job){
        jobs.add(job);
    }
}