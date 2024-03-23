package TestKTNC;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	@Test
	public void testsetup(){
	 String str= "I am done with Junit setup";
     assertEquals("I am done with Junit setup",str);
}
}
