package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int num : arr) {
			System.out.println(num);
		}
		// 스트림 : 일관적인 자료처리의 추상화 제공 
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n));
//		is.~ 	 // 위에서 이미 forEach와 사용했으므로 재사용은 불가능 
		// 또 다른 연산을 위해서는 스트림을 다시 생성해야 함 
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
	}
	
}
