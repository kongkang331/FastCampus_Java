package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("=== 고객 명단 출력 ===");
//		customerList.stream().forEach(s -> System.out.println(s));		// toString이 호출됨 
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));	// class's getName() 으로 이름만 받아서 출력 
		
		System.out.print("여행비용 총합 : ");
		System.out.println(customerList.stream().mapToInt(c -> c.getPrice()).sum());
		System.out.println("");
		
		System.out.println("=== 20세 이상 고객 ===");
		// 중간연산은 여러번 쓰일 수 있으나, 최종연산은 마지막에 한 번만 쓰임 
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
