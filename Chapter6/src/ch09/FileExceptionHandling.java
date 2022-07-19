package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		// java9 부터 외부에서 선언 가능해짐 
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");
			System.out.println("raed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		} finally {		// try구문이 호출되면 catch에  return이 있어도 finally는 무조건 호출 됨 
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("finally");
		}
		
		System.out.println("end");
		
	}
	
}
