package ch19;

// 데이터가 다 들어가 있지만 상속용으로 사용할 클래스이므로 abstract를 붙여줌 
public abstract class Decorator extends Coffee {

	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}

	
	
}
