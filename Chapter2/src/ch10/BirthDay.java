package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	private boolean isValid; // default == false
	// private 생성자를 사용함으로써 오류 확률을 줄일 수 있음 
	// getter & setter -> private 생성자 변수를 전달하여 사용할 수 있게 해줌 
	// get method
	public  int getDay() {
		return day;
	}
	// set method
	public void setDay(int day) {
		this.day = day;
	}
	// Source > Generate Getters and Setters... = auto
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if (isValid) {	// isValid == true일 경우 
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
