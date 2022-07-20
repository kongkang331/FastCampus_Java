package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		// 보조 스트림은 계속 감쌀 수 있고, 최종은 기반 스트림 
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
				
				millisecond = System.currentTimeMillis();
				
				int i;
				while ((i = bis.read()) != -1) {
					bos.write(i);
				}
				
				millisecond = System.currentTimeMillis() - millisecond;
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + "초 소요되었습니다.");
		
//		Socket socket = new Socket();
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		br.readLine();
	}

}
