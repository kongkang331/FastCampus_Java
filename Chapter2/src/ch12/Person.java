package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		// this 인스턴스 사용하기 이전에 다른 건 쓸 수 없음
		// 매게변수의 유형이 맞는 메소드를 찾아감 
		this("no name", 1); // this == Person 생성자 
		// 이 이후에 쓰는 건 가능
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() {
		return this; // output == ch12.Person@4dc63996 (== class Full Name@Address)
	}
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson(); // getPerson 생성자 호출해서 this 반환 
		System.out.println(person2);
	}
}
