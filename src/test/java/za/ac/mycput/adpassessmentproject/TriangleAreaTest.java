/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.adpassessmentproject;

//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author
 */
public class TriangleAreaTest {

    private TriangleArea x;
    private TriangleArea y;
    private TriangleArea z;

    public TriangleAreaTest() {
    }

    @Test
    public void setUp() {
        x = new TriangleArea();
        y = new TriangleArea();
        z = y;
    }

    @Test
    public void testEquality() {
        assertEquals(x, z);
    }

    @Test
    public void testIdentity() {
        assertSame(z, y);
    }

    @Test
    public void failTest() {
        try {
            fail("This should fail");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

    @Test(timeout = 150)
    public void testTimeout() {
      int maxNum =3;
      int prevNum =0;
      int nextNum =1;
      
      for(int i=1; i<=maxNum;++i){
          System.out.println(prevNum+" ");
          int sum =prevNum+nextNum;
          nextNum=sum;
      }
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
