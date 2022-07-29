package ch10;

public class Counting {

	public static void main(String...args) {
		
		int[] people = {55, 40, 27, 99, 76, 81, 29, 31, 33, 62};
		int[] ages = new int[10];
		
		for (int i = 0 ; i < people.length ; i++) {
			int age = people[i];
			
			if ( age < 30 ) ages[0]++;
			else if ( age < 40 ) ages[1]++;
			else if ( age < 50 ) ages[2]++;
			else if ( age < 60 ) ages[3]++;
			else if ( age < 70 ) ages[4]++;
			else if ( age < 80 ) ages[5]++;
			else if ( age < 90 ) ages[6]++;
			else if ( age <= 100 ) ages[7]++;
		}
		
		int number = people.length;
		
		for (int i = 0 ; i < 8 ; i++) {
			System.out.println(number + "명 중 " + ((i * 10) + 20) + "대는 " + ages[i] + "명 입니다.");
		}
		
	}
	
}
