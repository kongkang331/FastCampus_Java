package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		// 기존 방식 
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		// Lambda Expression 방식 
		// class를 직접 만들지 않고도 바로 사용 가능해짐 -> 내부적으로 익명 클래스가 만들어져서 사용됨 
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString(s1, s2);
		
	}

}
