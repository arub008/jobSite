import java.time.LocalDate;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class Education {
    LocalDate date; //дата окончания
    String institution_name; //учебное заведение

  public  Education(String institution_name){

        this.institution_name = institution_name;
      
    }

    public Education(LocalDate date, String institution_name) {
        this.date = date;
        this.institution_name = institution_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Education education = (Education) o;

        if (date != null ? !date.equals(education.date) : education.date != null) return false;
        if (institution_name != null ? !institution_name.equals(education.institution_name) : education.institution_name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (institution_name != null ? institution_name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return " \\ учебное заведение: " + institution_name;
        
    }

}
