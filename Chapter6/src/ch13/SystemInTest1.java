package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
//			i = System.in.read();	// 한 바이트를 읽고 아래에서 그 값을 반환 -> 한 바이트 씩이라 한글은 깨짐
//			System.out.println(i);
//			System.out.println((char)i);
			InputStreamReader irs = new InputStreamReader(System.in);	// 한글 넣어도 깨지지 않음 
			
			while ((i = irs.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
