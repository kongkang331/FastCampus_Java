package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100); // 버스는 여러대 있을 수 있으므로 번호별로 생성자 호출 가능
		Bus bus500 = new Bus(500);
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		bus500.showBusInfo();
		
	}
	
}
