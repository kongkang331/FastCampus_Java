package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}
	
	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}
	
	// 요기까지만 작성하면 default Method의 중복 사용으로 에러
	// ->Buy, Sell 두 인터페이스 중 하나의 defaul method를 반드시 재정의 해야함 
	@Override
	public void order() {
		System.out.println("Customer Order");
	}
	
	public void hello() {
		System.out.println("Hello");
	}
	
}
