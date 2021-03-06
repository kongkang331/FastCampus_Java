package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}

}

public class ReduceTest {

	public static void main(String[] args) {
		
		String greetings[] = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		// 람다식을 직접 이용
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
		// 바이너리오퍼레이터 인터페이스를 활용한 클래스를 만들어 람다식 이용 
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
	}
	
}
