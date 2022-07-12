package ch08;


// 과제 풀이 
public class Person {
	// Person Class Area
	public int personHeight;
	public int personWeight;
	public String personName;
	public int personAge;
	
	public String showPersonInfo() {
		return "키가 " + personHeight + " 이고 몸무게가 " + personWeight + "킬로인 남성이 있습니다. 이름은 " + personName + "이고 나이는 " + personAge + "세입니다.";
	}
	
	
	// Main Method
	public static void main(String[] args) {
		
		Person personMan = new Person();
		
		personMan.personHeight = 180;
		personMan.personWeight = 78;
		personMan.personName = "Tomas";
		personMan.personAge = 37;
		
		System.out.println(personMan.showPersonInfo());
	}
}
