package ch23;

// command + shift + o
import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		// 갯수를 지정하지 않으면 시스템이 default == 10개로 잡아둠 
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));

		for (int i = 0 ; i < library.size() ; i++) {
			library.get(i).showInfo();
		}
		
	}

}
