package ch18;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	// singleton pattern 적용 
	public static Company getInstance() {
		if (instance == null) {	// 혹시 모를 일 대비 
			instance = new Company();
		}
		return instance;
	}
	
}
