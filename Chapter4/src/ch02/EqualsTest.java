package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);	// Output == false
		System.out.println(std1.equals(std2));	// Output == overriding - (before)false / (after)true
		System.out.println(std1.equals(std3));	// Output == true
		// overriding - (before)225534817 & 1878246837 / (after)100 & 100 (== studentNum)
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		std1.setStudentName("kim");
		Student copyStudent = (Student)std1.clone();	// 원본 데이터 값 바꾸면 복사 데이터도 바뀜 
		System.out.println(copyStudent);
		
	}
	
}
