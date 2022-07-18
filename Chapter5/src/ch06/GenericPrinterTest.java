package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();	// 다이아몬드 연산자 / <>사이 타입 기록 생략 가능 
		powderPrinter.setMaterial(powder);
		Powder p = powderPrinter.getMaterial();		// compiler 가 알아서 Powder의 것으로 바꿔주기 때문에 형변한 명시 필요 없음 
		System.out.println(powderPrinter.toString());
		
	}

}
