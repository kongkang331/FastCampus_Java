package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(java));	// 데이터 연결 전
		buffer.append(android);
		
		String test = buffer.toString();
		System.out.println(test);
		System.out.println(System.identityHashCode(java));	// 데이터 연결 후 
		// 주소 값이 같음 -> 쓰레기 값 만들지 않음 
		// 단일 스레드 => stringBuilder
		// 멀티 스레드 => stringBuffer
		
	}
	
}
