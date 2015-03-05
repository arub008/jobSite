import org.joda.time.DateTime;
import org.joda.time.LocalDate;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class Main {


        public static void main( String[] args )
        {
          try {


              Worker worker1 = new Worker("Pall Dornon", Sex.MALE, new LocalDate(1983, 1, 14));
              worker1.addEdu("СГту");
              System.out.println("worker1.age() = " + worker1.ageCount());
              worker1.addEdu("coursera");
              worker1.addResume(new Resume("Бухгалтер"));
              worker1.addResume(new Resume("Водитель"));
                Worker worker2  = new Worker("Ara Falek", Sex.FEMALE, new LocalDate(1969, 8, 27));
               System.out.println("worker2.age() = " + worker2.ageCount());
                worker2.addEdu("МГУ");
              System.out.println("worker1 \\ " + worker1.toString());
           System.out.println("worker2 \\ " + worker2.toString());

            Employer employer1 = new Employer("Apple");
            Employer employer2 = new Employer("Oracle", "Popular company");
              employer1.addPhone("812 - 888 - 888 -9");
              employer2.addJob(new Job("программист","LA"));
              
              employer1.addJob(new Job("архитектор","Спб", "ищем позитивных людей"));

            System.out.println("employer1 \\ " + employer1.toString());
            System.out.println("employer2 \\ " + employer2.toString());

          }
          catch (Exception e)
          {
              System.out.println("e = " + e);
              
          }
            LocalDate now = new LocalDate();
            System.out.println("now = " + now);
            Date date = new Date();
            System.out.println("date = " + date);
            System.out.println("now 1 = " + now.dayOfWeek().getAsText());
            System.out.println("now 2 = " + now.dayOfYear().getAsText());
            LocalDate worker1_birth = new LocalDate(1967,5,12);
            System.out.println("worker1_birth = " + worker1_birth);
        }


}
