package ch10;

public class PasswordTest {

	public static void main(String[] args) {

		Password passwd = new Password();
		
		String password = null;
		try {
			passwd.setPassword(password);
			System.out.println("오류 없음1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcd";
		try {
			passwd.setPassword(password);
			System.out.println("오류 없음2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try {
			passwd.setPassword(password);
			System.out.println("오류 없음3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcd#1";
		try {
			passwd.setPassword(password);
			System.out.println("비밀번호 설정이 완료되었습니다.");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
