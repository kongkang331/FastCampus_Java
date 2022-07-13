package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// Customer vc = new VIPCustomer(12345, "noname"); // 형변환(UpCasting)
		// 여기서 vs는 상위클래스인 Customer class의 형으로 사용
	}
	
}
