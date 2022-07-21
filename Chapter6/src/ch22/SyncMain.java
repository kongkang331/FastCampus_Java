package ch22;

class Bank {
	
	private int money = 10000;
	// 동기화 방법 1
	public void saveMoney(int save) {
		
//		synchronized(this) {		
			int m = getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m + save);
//		}

	}
	// 동기화 방법 2
//	public synchronized void minusMoney(int minus) {
	public void minusMoney(int minus) {
		
		int m = getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread {
	public void run() {
		// 동기화 방법 3
		synchronized (SyncMain.myBank) {
			System.out.println("start save");
			SyncMain.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
		}
	}
}

class ParkWife extends Thread {
	public void run() {
		synchronized (SyncMain.myBank) {
			System.out.println("start minus");
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
		}
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		
		Park p = new Park();
		ParkWife pw = new ParkWife();
//		p.start();
		pw.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		pw.start();
		p.start();
		
	}
	
}
