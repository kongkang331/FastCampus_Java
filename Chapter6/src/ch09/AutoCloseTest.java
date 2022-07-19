package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		try (obj) {
			// 오토 클로징이 가능한 상태일 대 실행
			throw new Exception();	// 강제 exception 
		} catch (Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");

	}

}
