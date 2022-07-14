package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	// 구현은 됐으나 내용이 없는 것 == 추상 클래스가 아님 
	public void washCar() {}
	
	// Template Method
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
}
