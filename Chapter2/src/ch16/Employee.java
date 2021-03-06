package ch16;

// 객체가 생성될 때 초기화 작업은 생성자에서 한다 == 여기서 한다! 
// ch17 == serialNum을 private로 변경 선언 후 test
public class Employee {

//	public static int serialNum = 1000;
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {	// default 생성자 
		serialNum++;	// 한 명씩 증가할 때마다(생성자 호출시 마다) 증가 
		employeeId = serialNum;
	}
	

	public static int getSerialNum() {
		return serialNum;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
