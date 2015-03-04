import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;*/
//import org.junit.Test;

/**
 * Unit test for simple App.
 */


public class JobSiteTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
  // @Test
   
  // public
   
   
    
    public JobSiteTest(String testName)
    {
        
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( JobSiteTest.class );
    }

    

   /* public void WorkerCreateTest(){

Worker worker = new Worker( "Анатолий Иванов", Sex.MALE, new Education("СГТУ"), new Resume("монтер"));
        assertEquals(" Анатолий Иванов" , worker.toString());
    }*/
}
