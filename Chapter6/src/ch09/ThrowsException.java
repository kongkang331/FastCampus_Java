package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		// exception을 throw 해버리면 이 메소드를 사용하는 쪽에서 받아버림 ==> 여기서는 main
		// 예외 처리를 main 메소드한테 미뤄버림 .
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
//		try {
//			test.loadClass("a.txt", "abc");
//		} catch (FileNotFoundException e) {		// 열고자 하는 file이 없을 때 ex) a.txt 
//			System.out.println(e);
//		} catch (ClassNotFoundException e) {	// file은 있는데, class가 없을 때 ex) abc
//			System.out.println(e);
//		}
		
		// multi exception 처리도 가능함 
		try {
			test.loadClass("a.txt", "abc");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {			// default exception 을 원할 땐 최상위 클래스를 사용하면 됨 
			System.out.println("default Exception");
		}

		System.out.println("end");
	}

}
