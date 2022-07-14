package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// Default Method
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	// Static Method
	static int total(int[] arr) {
		int total = 0;
		
		for (int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	// Private Method
	private void myMethod() {
		System.out.println("myMethod");
	}
	// Private Static Method
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
	
}
