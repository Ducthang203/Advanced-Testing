package lab2;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class lab2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		JUnitCore runner = new JUnitCore();
		Result result = runner.run(MathFuncTest.class);
		System.out.println("run tests: " + result.getRunCount());
		System.out.println("failed: " + result.getFailureCount());
		System.out.println("ignored tests: " + result.getIgnoreCount());
		System.out.println("success: " + result.wasSuccessful());

	}

}
