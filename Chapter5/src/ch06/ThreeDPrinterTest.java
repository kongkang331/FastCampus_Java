package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinterObject printer = new ThreeDPrinterObject();
		
		printer.setMaterial(powder);	// insert data
		Powder p = (Powder)printer.getMaterial();	// 기존 불편한 방색 (object로 사용되므로 powder 따로 명시 필요  
		
		
		
	}

}
