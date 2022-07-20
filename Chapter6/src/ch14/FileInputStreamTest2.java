package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		int i;
		// 이런식으로 try 안에 다 넣어버리면 끝에 다아주는 과정인 .close() 생략 가능
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			
			while ((i = fis.read()) != -1) {		// end Of File이 -1 return 
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
