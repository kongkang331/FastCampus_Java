package ch01;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	// Runnable : runnable interface를 이용한 쓰레드클래스 만들기 
	Runnable getRunnable(int i) {
		// final로 명시 안 했어도 컴파일러가 알아서 명시를 해 줌  
		int num = 10;
		
		// Local Inner Class
		class MyRunnable implements Runnable {
//		return new Runnable() {			// Anonymous Class 방식 
			
			int localNum = 1000;
			
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + " (외부 클래스 정적 변수)");
			}
			
		}
		
		return new MyRunnable();
		
		// Anonymous Class 방식이 쓰였을 때 해당 클래스를 메소드로 호출해서 사용 
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				
//			}
//			
//		}
		
	}
	
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();

	}

}
