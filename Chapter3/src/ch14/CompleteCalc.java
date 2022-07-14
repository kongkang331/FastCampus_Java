package ch14;

// Calc로부터 타입 상속 받음 (구현 상속과는 다름) 
// java 에서 상속은 singgle only (다중 상속 금지) 
public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) return ERROR;
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}
	
	@Override
	public void description() {
		System.out.println("CompleteCalc overriding");
	}
	
}
