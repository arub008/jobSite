import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class Employer {
    String name;
    List<String> phone;
    List<String> site;
    String info; // о компании

    List<Job> job; //вакансия компании

    public Employer(String name, ArrayList<Job> vacancy){
        this.name = name;
        this.job = vacancy;
    }

    public Employer(String name, ArrayList<String> phone, ArrayList<String> site, String info, ArrayList<Job> job) {
        this.name = name;
        this.phone = phone;
        this.site = site;
        this.info = info;
        this.job = job;
    }

    @Override
    public String toString(){
        return "Организация " + name + job.toString();
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employer employer = (Employer) o;

        if (info != null ? !info.equals(employer.info) : employer.info != null) return false;
        if (job != null ? !job.equals(employer.job) : employer.job != null) return false;
        if (!name.equals(employer.name)) return false;
        if (!phone.equals(employer.phone)) return false;
        if (site != null ? !site.equals(employer.site) : employer.site != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + (site != null ? site.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        return result;
    }
}
