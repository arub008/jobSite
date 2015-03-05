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

    public Employer(String name){
        this.name = name;
        this.phone = new ArrayList<String>();
        this.site = new ArrayList<String>();
        this.job = new ArrayList<Job>();
    }

    public Employer(String name, String info) {
        this.name = name;
        this.phone = new ArrayList<String>();
        this.site = new ArrayList<String>();
        this.info = info;
        this.job = new ArrayList<Job>();
    }

    public void addSite(String site_url) {
        site.add(site_url);
    }

    public void addJob(Job j)
   {
       job.add(j);
   }

    public void addPhone(String number) {
        phone.add(number);
    }

    public void addInfo(String inf) {
        this.info = inf;
    }

    @Override
    public String toString(){
        return "Организация " + name +
                (phone !=null ? " " + phone.toString() : "")
                + (site !=null ? " " + site.toString() : "")
                + (info !=null ? " " + info.toString() : "")
                + (job !=null ? " " + job.toString() : "");
        
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
