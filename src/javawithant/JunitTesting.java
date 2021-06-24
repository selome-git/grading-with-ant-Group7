
package junit_testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class JUnitTest {
    public  javawithant javawithant;
  int subjects=6;
  float total=510.0;
  float avg=85;
  
  String grade=90;

    public JUnitTest() {
    }
     @Before
    public void initTest() {
       =new javawithant();
        subjectsNum=6;
    }
    
    @After
    public void tearDown() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
public void testSubjects()
{
    
 subjects=javawithant.getSubjects();
 assertEquals(subjects,6);
}
public void testAvg()
{
 average=javawithant.calcAvg(avg);
 assertEquals(avg,85);

}
@Test
public void testGrade()
{
    grade=javawithant.getGrade(grade);
    assertEquals(grade,"A");

}
    
   

    // TODhO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
