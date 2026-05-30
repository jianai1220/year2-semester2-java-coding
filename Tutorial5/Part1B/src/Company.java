import java.util.ArrayList;
import java.util.List;

public class Company {
    public String name;
    public List<Job> jobs;
    
    public Company(String name){
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
