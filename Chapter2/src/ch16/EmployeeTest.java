package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		 
		Employee employeeLee = new Employee();	// Main method에 Employee 타입으로 선언된 지역변수 => stack memory에 저장됨
		employeeLee.setEmployeeName("이순신");	// 위의 지역변수를 참조하여 생성된 인스턴스 => heep memory에 저장됨 
		// public 일 때, serialNum에 노란 라인 뜨는 이유는 인스턴스 이름과 함께 쓰여서 클래스 이름으로 쓰라는 의미 == Employee.serialNum
//		System.out.println(employeeLee.serialNum);	// serialNum == 1000
		System.out.println(Employee.getSerialNum());	// private로 선언됐을 때 
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
//		employeeKim.serialNum++;
		// 두 개의 인스턴스(serialNum)가 하나의 메모리 주소를 공유해서 생긴 일 
		// serialNum은 data 영역에 저장되서 각 다른 인스턴스들이 같이 공유해서 사용함
		// System.out.println(employeeLee.serialNum);	// serialNum == 1001
		// System.out.println(employeeKim.serialNum);	// serialNum == 1001
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
		
	}
	
}
