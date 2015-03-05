/**
 * Created by Anastasya on 02.03.2015.
 */
public class Resume {
    String job_name; //Желаемая должность
    String job_city;
    int salary; //Желаемая зарплата
    String info; //информация
    
    public Resume(String job_name){
        this.job_name = job_name;
        
    }

    public Resume(String job_name, String job_city, int salary, String info) {
        this.job_name = job_name;
        this.job_city = job_city;
        this.salary = salary;
        this.info = info;
    }

    @Override
   public String toString()
   {
       return " \\ резюме - " + job_name;
       
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;

        if (salary != resume.salary) return false;
        if (info != null ? !info.equals(resume.info) : resume.info != null) return false;
        if (job_city != null ? !job_city.equals(resume.job_city) : resume.job_city != null) return false;
        if (!job_name.equals(resume.job_name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = job_name.hashCode();
        result = 31 * result + (job_city != null ? job_city.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }
}
