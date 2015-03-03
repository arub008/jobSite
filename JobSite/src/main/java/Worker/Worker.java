package Worker;

import Resume.Resume;

import java.util.Date;

/**
 * Created by Anastasya on 02.03.2015.
 */


public class Worker {

    String name;
    Sex sex;
    Date date; //дата рождения
    String phone;
    Resume resume;
    
  public   Worker(String name, Sex sex)
    {
        this.name = name;
        this.sex = sex;
        
    }

    @Override
    public String toString(){

        return "ФИО: " + name + sex.toString();
        
    }
}
