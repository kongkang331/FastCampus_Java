package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	// 아래의 매개변수 있는 생성자를 사용하면서 발생한 에러 해결 = Constructor(생성자) OverLoading
	public Student() {}
	
	// 생성자 생성 (매개변수 있는 생성자)
	public Student(int studentNumber, String studentName, int grade) {
//		studentNumber = studentNumber;     // 매개변수와 멤버변수의 이름이 같을 경우, 매개변수에 매개변수를 대입하는 꼴이 되어버림
		this.studentNumber = studentNumber;		// this를 붙이면 멤버변수를 가리킴 
		this.studentName = studentName;
		this.grade = grade;
	}
	
	// 생성자 생성 (매개변수 없는 생성자)
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학번 입니다.";
	}
}
