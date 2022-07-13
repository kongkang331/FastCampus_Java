package ch08;

import java.util.ArrayList;

// 다형성 활용 구현 
// extends + override => polymorphism
class Animal {
	// 하위 클래스에서 공통적으로 사용되는 메소드는 상위클래스에 적용
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		// 각각의 다른 클래스들이 마치 동일한 타입인 것처럼 쓰이지만 실제 싫행은 다르게 쓰이는 것
		// UpCasting - flying(), book() 등의 메소드는 DownCasting 필요
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		AnimalTest test = new AnimalTest();
		// 기본 출력 
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		// ArrayList 활용 출력
		// UpCasting 된 정보 출력 
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for (Animal animal : animalList) {
			animal.move();
		}
		// DownCasting 된 정보 출력 
		test.testDownCasting(animalList);
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for (int i = 0 ; i < list.size() ; i++) {
			Animal animal = list.get(i);
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			} else {
				System.out.println("Unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
