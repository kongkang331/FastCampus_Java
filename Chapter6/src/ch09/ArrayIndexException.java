package ch09;

public class ArrayIndexException {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		try {	// error 발생 코드 
			for (int i = 0 ; i <= 5 ; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {		// error 예외 처리 코드 
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("here!!");	// log (try-catch 문 없으면 여기까지 안 옴)
	}

}
