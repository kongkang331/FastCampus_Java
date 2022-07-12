package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();	// default 생성자 -> 매개변수 있는 생성자를 만들면 에러 발생 
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3); // 매개변수 있는 생성자 사용을 위해 만든 생성자 
		System.out.println(studentKim.showStudentInfo());
	}
}
