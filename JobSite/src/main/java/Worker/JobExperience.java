package Worker;
import Employer.Employer;

import java.util.Date;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class JobExperience {
    Date start; // начало работы
    Date finish; //конец работы
    String job_name; //должность
    Employer employer; //работодатель
    
    
    public JobExperience(Date start, Date finish, String job_name){
        this.start = start;
        this.finish = finish;
        this.job_name = job_name;
        
    }
    
    public JobExperience(){

    }

}
