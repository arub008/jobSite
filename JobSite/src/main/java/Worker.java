import java.time.LocalDate;

/**
 * Created by Anastasya on 02.03.2015.
 */


public class Worker {

    String name;
    Sex sex;
   LocalDate date; //дата рождения
    String phone;
    Language language;
    Education education;
    Resume resume;
    
  public   Worker(String name, Sex sex, Education education, Resume resume)
    {
        this.name = name;
        this.sex = sex;
        this.education = education;
        this.resume = resume;
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (date != null ? !date.equals(worker.date) : worker.date != null) return false;
        if (education != null ? !education.equals(worker.education) : worker.education != null) return false;
        if (language != worker.language) return false;
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
        return result;
    }

    @Override
    public String toString(){

        return "ФИО: " + name + sex.toString() + education.toString() + resume.toString();
        
    }
}
