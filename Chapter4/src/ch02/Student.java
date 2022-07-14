package ch02;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentNum + ", " + studentName;
	}
	
	// 사번과 이름이 같은 데이터는 논리적으로 같은 것으로 인식하도록 하는 작업 
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;	// DownCasting
			if(this.studentNum == std.studentNum) return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// 학번이 같을 때 같은 해시 코드 값 반환 -> 기준 == 학번
		// but 진짜 해시 코드 값은 아님 
		return studentNum;
	}
	
	// Clone Method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
