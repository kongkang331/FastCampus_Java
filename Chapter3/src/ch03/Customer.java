package ch03;

// Customer class == VIPCustomer & GoldCustomer class들의 상위 클래 
public class Customer {

	// private는 상속받는 하위 클래스에서도 사용 못함 -> protected를 사용하면 해결! (외부 접근 차단 / 하위 클래스는 허용)
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	double saleRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//	}
	// 디폴트 생성자가 없으므로 하위클래스에서 super로 호출 시 디폴트를 찾지 못해 에러 발생
	// 1. super에 값을 넣고 명시적으로 호출 
	// 2. 하위 클래스에서 이 클래스와 같은 유형의 생성자를 직접 명시 (VIPCustomer.java - 16line)
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
}
