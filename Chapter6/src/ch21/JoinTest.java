package ch21;

public class JoinTest extends Thread {

	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for (i = start ; i <= end ; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {

//		System.out.println(Thread.currentThread() + " start");
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		// jt1, jt2 thread가 다 돌아갈 때까지 main thread가 runnable 상태로 대기 
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int lastTotal = jt1.total + jt2.total;
		// JoinTest thread 2개가 끝나기도 전에 main thread가 같이 실행되버려서 실행할 때마다 값이 달라짐 -> 해결 방법 : join() 
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal);
//		System.out.println(Thread.currentThread() + " end");

	}

}
