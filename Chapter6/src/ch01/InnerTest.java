package ch01;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	// 인스턴스 내부 클래스 
	private class InClass {
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass num = " + sNum + " (외부 클래스의 스태틱 변수)");
			System.out.println("InClass num = " + iNum + " (내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	// 정적 내부 클래스 
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");	// 외부 클래스의 인스턴스 변수는 사용 불가
			System.out.println("InClass num = " + iNum + " (내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass num = " + sNum + " (외부 클래스의 스태틱 변수)");
			System.out.println("InClass num = " + sInNum + " (내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
//			System.out.println("InClass num = " + iNum + " (내부 클래스의 인스턴스 변수)");	// 내부 클래스의 인스턴스 변수는 사용 불가
			System.out.println("OutClass num = " + sNum + " (외부 클래스의 스태틱 변수)");
			System.out.println("InClass num = " + sInNum + " (내부 클래스의 스태틱 변수)");
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		// 인스턴스 내부 클래스 사용 
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println("==========================================");
		// 정적 내부 클래스 사용 
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		OutClass.InStaticClass.sTest();
		
	}

}
