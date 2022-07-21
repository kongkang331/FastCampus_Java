package ch20;

// thread 사용 방법 1 
// extends가 가능할 때 	
//class MyThread extends Thread {
//	
//	public void run() {
//		int i;
//		for (i = 1 ; i <= 200 ; i++) {
//			System.out.print(i + "\t");
//		}
//	}
//	
//}

// thread 사용 방법 2
// 이미 extends 를 해서 extends가 불가능할 
class MyThread implements Runnable {

	@Override
	public void run() {
		
		int i;
		for (i = 1 ; i <= 200 ; i++) {
			System.out.print(i + "\t");
		}
		
	}
	
}

public class MyThreadTest {

	public static void main(String[] args) {
		
		// 방법 1일 때 
//		System.out.println(Thread.currentThread() + "start");
//		MyThread th1 = new MyThread();
//		MyThread th2 = new MyThread();
//		
//		th1.start();
//		th2.start();
//		System.out.println(Thread.currentThread() + "end");
		
		// 방법 2 일 때 
		System.out.println(Thread.currentThread() + "start");
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");
		
		// 안드로이드에서도 많이 사용하는 간단하게 돌릴 때 가능한 방법 (Runnable 이용) 
		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("run");
			}
			
		};
		
		run.run();
		
	}
	
}
