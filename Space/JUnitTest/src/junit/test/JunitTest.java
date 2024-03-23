package junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	@Test
	public void testsetUp() {
		String str ="I am done with Junit setup";
		assertEquals("I am done with Junit setup",str);
	}
	
}
