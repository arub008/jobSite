package Main;

import Employer.Employer;
import Job.Job;
import Resume.Resume;
import Worker.Worker;
import Worker.Sex;
import Worker.Education;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class Main {


        public static void main( String[] args )
        {

            Worker worker1  = new Worker("Pall Dornon", Sex.MALE, new Education("Спбгу"), new Resume("Бухгалтер") );
            Worker worker2  = new Worker("Ara Falek", Sex.FEMALE, new Education("МГППУ"), new Resume("Поэтесса"));
       

            System.out.println("worker1 \\ " + worker1.toString());
            System.out.println("worker2 \\ " + worker2.toString());

            Employer employer1 = new Employer("Apple", new Job("маркетолог", " Мск"));
            Employer employer2 = new Employer("Oracle", new Job("java программист", " LA"));

            System.out.println("employer1 \\ " + employer1.toString());
            System.out.println("employer2 \\ " + employer2.toString());
        }


}
