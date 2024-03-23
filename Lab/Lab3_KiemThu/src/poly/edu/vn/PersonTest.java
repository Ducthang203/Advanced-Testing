package poly.edu.vn;

import static org.junit.Assert.fail;
import org.hamcrest.Matcher;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {
	@Test
	public void testExpectedException3() {
		try {
			
			new Person("Fpoly", -1 );
			
			fail("Should have thrown an IllegalArgumentException because age is invalid!");
			
		} catch (IllegalArgumentException e) {

		
		}
	}
	
}

