package poly.edu.vn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AirthematicTest {
	public String message = "Fpoly exception";
	
	JunitMessage junitMessage = new JunitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testUnitMessage() throws Exception{
					
			System.out.println("Fpoly Junit Message Exception is priting ");
			junitMessage.printMessage();
		}
	@Test
	public void testJUnitHiMessage() {
		message="Hi!" + message;
		System.out.println("Fpoly Junit Message is printng");
		assertEquals(message, junitMessage.printHiMessage());
		
	}

}
