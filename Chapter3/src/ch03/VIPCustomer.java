package ch03;

// Customer class의 기능이 더 구체적임 -> extends로 상속 받아 해당 기능 사용 
public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentId;
	
//	public VIPCustomer() {
		// super();  // 하위클래스가 상위클래스 인스턴스를 참조할 수 있게 함  ->  상위클래스가 호출되어 있지 않아도 컴파일러가 불러줌
		// super(0, "no-name");
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//	}
	// 상위클래스에서 디폴트 생성자가 없으므로 상위클래스의 유형을 맞춰 만든 생성
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentId() {
		return agentId;
	}
	
}
