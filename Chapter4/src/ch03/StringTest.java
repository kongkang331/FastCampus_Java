package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));	// 데이터 연결 전 
		java = java.concat(android);
		
		System.out.println(java);
		System.out.print(System.identityHashCode(java));	// 데이터 연결 후
		// 주소값이 서로 다름 -> 계속 반복하다보면 쓰레기 값이 많아지고 메모리 낭비 
	}
	
}
