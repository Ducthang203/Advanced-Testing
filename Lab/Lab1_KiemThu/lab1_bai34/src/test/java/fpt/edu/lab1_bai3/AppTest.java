package fpt.edu.lab1_bai3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
    /**
     * Rigorous Test :-)
     */
    
   public AppTest(String testName)
   {
	   super (testName);
   }
   
   public void TestApp()
   {
	   assertTrue(true);
   }
   @Test
   public void TestIsEventNumber2() {
	   App demo1 = new App();
	   boolean result = demo1.isEventNumber(2);
	   assertTrue(result);
   }
   @Test
   public void testIsEventNumber4() {
	   App demo1= new App();
	   boolean result = demo1.isEventNumber(3);
			   assertTrue(result);
	   
   }
}
