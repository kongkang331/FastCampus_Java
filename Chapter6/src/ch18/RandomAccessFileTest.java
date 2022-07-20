package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("posision: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("posision: " + rf.getFilePointer());
		rf.writeUTF("안녕하세요");		// 한글은 3byte 씩 잡힘 + null char(2byte) => output == 29
		System.out.println("posision: " + rf.getFilePointer());
		
		rf.seek(0);		// 처음으로 가게 위치를 지정해줘야 다시 돌면서 출력 가능해짐 
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
