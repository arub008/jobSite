package Main;

import Worker.Worker;
import Worker.Sex;

/**
 * Created by Anastasya on 02.03.2015.
 */
public class Main {


        public static void main( String[] args )
        {

            Worker worker1  = new Worker("Pall Dornon", Sex.MALE);
            Worker worker2  = new Worker("Andy Falek", Sex.FEMALE);

            System.out.println("worker1 \\ " + worker1.toString());
            System.out.println("worker2 \\ " + worker2.toString());
        }


}
