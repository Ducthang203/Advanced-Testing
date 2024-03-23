package lab2;

public class MathFunc {
	int calls;
	public int getCalls() {
		return calls;
	}
	public long factorial(int number) {
		calls++;
		
		if(number < 0)
			throw new IllegalArgumentException();
		
		long result = 1;
		if (number > 1) {
			for(int i=1; i <= number; i++)
				result = result * i;
			
		}
		return result;
	}
	public long plus(int num1, int num2) {
		calls++;
		return num1+num2;
	}
	
	
}
/*@Before: Phương thức được đánh dấu
annotation này sẽ được thực thi trước mỗi
phương thức test.

@After: Phương thức được đánh dấu annotation
này sẽ được thực thi sau mỗi phương thức test.

@BeforeClass: Phương thức được đánh dấu
annotation này sẽ thực thi trước tất cả các
phương thức test.

@AfterClass: Phương thức được đánh dấu với
annotation này sẽ được thực thi ngay sau khi tất
cả các test đều được thực hiện*/
