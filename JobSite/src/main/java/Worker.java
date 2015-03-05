import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anastasya on 02.03.2015.
 */


public class Worker {

    String name;
    Sex sex;
   LocalDate date; //дата рождения
    String phone;
    List<String> language;
    List<String> education; //образование
    List<Resume> resume; //резюме
    List<String> job_experience; // опыт работы
    
  public   Worker(String name, Sex sex, LocalDate date)
    {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.education = new ArrayList<String>();
        this.language = new ArrayList<String>();
        this.resume = new ArrayList<Resume>();
        this.job_experience = new ArrayList<String>();
        
    }

    public Worker(String name, Sex sex, LocalDate date, String phone) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.phone = phone;
        this.language = new ArrayList<String>();
        this.education = new ArrayList<String>();
        this.resume = new ArrayList<Resume>();
        this.job_experience = new ArrayList<String>();
    }

    public void addResume(Resume res) {
        resume.add(res);
    }

    public void addEdu(String s){//добавить образование
        education.add(s);
    } 

    public int ageCount( )//возраст
    {
        LocalDate now = new LocalDate();
       return now.getYear() - this.date.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (date != null ? !date.equals(worker.date) : worker.date != null) return false;
        if (education != null ? !education.equals(worker.education) : worker.education != null) return false;
        if (job_experience != null ? !job_experience.equals(worker.job_experience) : worker.job_experience != null)
            return false;
        if (language != null ? !language.equals(worker.language) : worker.language != null) return false;
        if (!name.equals(worker.name)) return false;
        if (phone != null ? !phone.equals(worker.phone) : worker.phone != null) return false;
        if (resume != null ? !resume.equals(worker.resume) : worker.resume != null) return false;
        if (sex != worker.sex) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (resume != null ? resume.hashCode() : 0);
        result = 31 * result + (job_experience != null ? job_experience.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){

        return "ФИО: " + name + sex.toString() + (education !=null ? " "+ education.toString() : "")
                + (resume != null ? " " + resume.toString() : "")+ (date !=null ? " " + date.toString() : "")
                + (phone !=null ? " " + phone.toString() : "") 
                + (language !=null ? " " + language.toString() : "")
                + (job_experience !=null ? " " + job_experience.toString() : "");
        
    }
}
