package ch03;

public class FunctionTest {
	
	// 매개변수 O / 반환값 O
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	// 매개변수 O / 반환값 X 
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	// 매개변수 X / 반환값 O
	public static int calcSum() {
		int sum = 0;
		for (int i = 0 ; i <= 100 ; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		// 함수 호출 & 입력 
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
	}
}
