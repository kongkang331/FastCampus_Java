package ch02;

// Customer class의 기능이 더 구체적임 -> extends로 상속 받아 해당 기능 사용 
public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentId;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentId() {
		return agentId;
	}
	
}
