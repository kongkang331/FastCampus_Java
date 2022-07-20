package ch11;

public class MyLoggerTest {

	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();
		
		myLogger.log("test");

	}

}

// 실행 이후 log.txt, fine.txt, warning.txt 파일 자동 생성됨 
// 각각 세팅된 레벨에 해당하는 정보들 출력 