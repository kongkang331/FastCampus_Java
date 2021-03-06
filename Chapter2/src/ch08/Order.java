package ch08;

// 과제 풀이 
public class Order {
	// Order Class Area
	public String phoneNumber;
	public String address;
	public int date;
	public int time;
	public int price;
	public String menuNumber;
	
	public Order(int date, int time, int price) {
		this.date = date;
		this.time = time;
		this.price = price;
	}

	public String showOrderInfo() {
		return "주문 접수 번호 : " + date + menuNumber + "\n" + "주문 핸드폰 번호 : " + phoneNumber + "\n" + 
				"주문 집 주소 : " + address + "\n" + "주문 날짜 : " + date + "\n" + "주문 시간 : " + time
				+ "\n" + "메뉴 번호 : " + menuNumber;
	}

	
	// Main Method
	public static void main(String[] args) {
		
		Order orderTest = new Order(20201102, 130258, 35000);
		
		orderTest.phoneNumber = "01023450001";
		orderTest.address = "서울시 강남구 역삼동 111-333";
		orderTest.menuNumber = "0003";
		
		System.out.println(orderTest.showOrderInfo());
	}
}
