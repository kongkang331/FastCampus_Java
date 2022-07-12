package ch21;

public class ObjectCopyTest {
	
public static void main(String[] args) {
		 
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		// library[] -> copyLibrary로 둘 다 0부터 시직, 총 5개 길이 복사 
		// 얕은 복사 
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
//		System.out.println("== library ==");
//		for (Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		// 내용도 주소도 똑같이 복사 됨
//		System.out.println("== copy library ==");
//		for (Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		// 원본 배열의 내용을 바꿔줌 -> 복사본도 똑같이 바뀜 
//		library[0].setAuthor("박완서");
//		library[0].setTitle("나목");
		
//		System.out.println("== library ==");
//		for (Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("== copy library ==");
//		for (Book book : copyLibrary) {
//			System.out.println(book);
//			book.showInfo();
//		}
		
		// 제대로된 복사를 위한 작업 
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for (int i = 0 ; i < library.length ; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		System.out.println("== library ==");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copy library ==");
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
	
}
