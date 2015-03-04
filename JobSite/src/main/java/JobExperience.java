import java.time.LocalDate;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class JobExperience {
    LocalDate start; // начало работы
    LocalDate finish; //конец работы
    String job_name; //должность
    Employer employer; //работодатель
    
    
    public JobExperience(LocalDate start, LocalDate finish, String job_name){
        this.start = start;
        this.finish = finish;
        this.job_name = job_name;
        
    }
    
    public JobExperience(){

    }

    @Override
    public String toString() {
        return " \\ опыт работы " +
                "начало=" + start +
                ", конец=" + finish +
                ", название= " + job_name + '\'' +
                ", работодатель=" + employer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobExperience that = (JobExperience) o;

        if (employer != null ? !employer.equals(that.employer) : that.employer != null) return false;
        if (finish != null ? !finish.equals(that.finish) : that.finish != null) return false;
        if (!job_name.equals(that.job_name)) return false;
        if (!start.equals(that.start)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + (finish != null ? finish.hashCode() : 0);
        result = 31 * result + job_name.hashCode();
        result = 31 * result + (employer != null ? employer.hashCode() : 0);
        return result;
    }
}
