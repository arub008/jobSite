/**
 * Created by Anastasya on 02.03.2015.
 */
public class Job {

    String job_name;
    String job_city;
    String job_info;
    
    public Job(String job_name, String job_city){
        this.job_name = job_name;
        this.job_city = job_city;
        
    }

    public Job(String job_name, String job_city, String job_info) {
        this.job_name = job_name;
        this.job_city = job_city;
        this.job_info = job_info;
    }

    @Override
    public String toString(){
        return " \\ вакансия " + job_name +
                (job_city !=null ? " \\ город " + job_city.toString() : "")
                +  (job_info !=null ? " \\ инфо " + job_info.toString() : "");
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (job_city != null ? !job_city.equals(job.job_city) : job.job_city != null) return false;
        if (job_info != null ? !job_info.equals(job.job_info) : job.job_info != null) return false;
        if (!job_name.equals(job.job_name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = job_name.hashCode();
        result = 31 * result + (job_city != null ? job_city.hashCode() : 0);
        result = 31 * result + (job_info != null ? job_info.hashCode() : 0);
        return result;
    }
}
