package Calc;

public class Addition {
	int number1;
	int number2;
	private int result;
	public Addition(int a,int b) {
		number1=a;
		number2=b;
		
	}
	public int performOperations() {
		result=number1+number2;
		return result;
		
	}

}
