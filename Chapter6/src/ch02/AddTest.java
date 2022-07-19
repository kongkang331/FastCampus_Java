package ch02;

public class AddTest {

	public static void main(String[] args) {
		
		// Lambda Expression
		Add add = (x, y) -> {return x + y;};
		// 매개변수가 하나인 경우 () 생략 가능
		// 반환문이 한 문장인 경우 {} 생략 가능 but, return문은 생략 불가능 
		// 반환문이 한 문장인데 return 마저 생략하면 {} 생략 가능 
		System.out.println(add.add(2, 3));
		
	}
	
}
