package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		// Buy, Sell interface 모두 사용 가능 
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		// Buy interface 것만 사용 가능 
		Buy buyer = customer; // Upcasting
		buyer.buy();
		buyer.order();
		// Sell interface 것만 사용 가능 		
		Sell seller = customer;	// Upcasting
		seller.sell();
		seller.order();
		
	}
	
}
