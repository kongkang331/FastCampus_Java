package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {

	private String subjectName;
	private int subjectId;
	private int gradeType;
	
	// 수강 신청한 학생 리스트 
	// register() 메서드를 호출하면 리스트에 추가 됨 
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
	
}
