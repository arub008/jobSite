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
      //  worker1.education.add(new ArrayList<String>());
            ArrayList<String> worker1_education = new ArrayList<String>();
              worker1_education.add("Бухгалтер");
              worker1.education = worker1_education.get(0);
              System.out.println("worker1.age() = " + worker1.age());
              //   Worker worker2  = new Worker("Ara Falek", Sex.FEMALE, new List<String>() Education("МГППУ"), new Resume("Поэтесса"), null);
              // System.out.println("worker2.age() = " + worker2.age());

              System.out.println("worker1 \\ " + worker1.toString());
        /*    System.out.println("worker2 \\ " + worker2.toString());*/

       /*     Employer employer1 = new Employer("Apple", new Job("маркетолог", " Мск"));
            Employer employer2 = new Employer("Oracle", new Job("java программист", " LA"));

            System.out.println("employer1 \\ " + employer1.toString());
            System.out.println("employer2 \\ " + employer2.toString());*/

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
