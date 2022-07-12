package ch11;

// Encapsulation
// private 부분의 데이터는 클라이언트 쪽에서 알 필요 없는 내용이라 정보 보호용으로 은닉 
// 객체지향 설계시 중요한 것은 필드의 내용을 공개할 것인가 말 것인가 / 얼마나 공개해서 효율적으로, 오류없이 관리할 것인가 
public class MakeReport {

	StringBuffer buffer = new StringBuffer(); // String Class를 쭉 연결하는 방법 중 하나 (String Builder)
	private String line = "===========================================\n";
	private String title = "  이름\t   주소 \t\t  전화번호  \n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	// 외부에서 쓸 수 있는 유일한 메소드 
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
