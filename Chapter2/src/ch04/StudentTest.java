package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // student 클래스를 이용해서 생성자 호출
		studentLee.studentID = 12345; // 생성자의 각 인스턴스들 생성
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "경기도 성남시";
		studentKim.showStudentInfo();
		
		System.out.println("참조변수 = studentLee / 참조 값 = " + studentLee);
		System.out.println("참조변수 = studentKim / 참조 값 = " + studentKim);
	}
}
