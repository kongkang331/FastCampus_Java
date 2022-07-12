package ch04;

public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	// 학생의 정보를 보여주는 메서드 
	public void showStudentInfo() {
		System.out.println(studentID + "학번의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");		
	}
	// 학생 이름 반환해줄 메서드 
	public String getStudentName() {
		return studentName;
	}
	// 학생이름 받아줄 메서드 
	public void setStudentName(String name) {
		studentName = name;
	}
}
