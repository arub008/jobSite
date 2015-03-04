import org.joda.time.DateTime;
import org.joda.time.LocalDate;


import java.util.Date;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class Main {


        public static void main( String[] args )
        {
            Worker worker1  = new Worker("Pall Dornon", Sex.MALE, new Education("Спбгу"), new Resume("Бухгалтер"), new LocalDate(1983,1,14));
            System.out.println("worker1.age() = " + worker1.age());
            Worker worker2  = new Worker("Ara Falek", Sex.FEMALE, new Education("МГППУ"), new Resume("Поэтесса"),  new LocalDate(1961,8,25));
            System.out.println("worker2.age() = " + worker2.age());

            System.out.println("worker1 \\ " + worker1.toString());
            System.out.println("worker2 \\ " + worker2.toString());

            Employer employer1 = new Employer("Apple", new Job("маркетолог", " Мск"));
            Employer employer2 = new Employer("Oracle", new Job("java программист", " LA"));

            System.out.println("employer1 \\ " + employer1.toString());
            System.out.println("employer2 \\ " + employer2.toString());

         // LocalDate result = new LocalDate();
           // DateTime from = new DateTime(1997, 1, 1, 0, 0);

      // System.out.println("date = " + from);
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
