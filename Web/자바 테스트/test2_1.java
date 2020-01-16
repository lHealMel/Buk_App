//파일 읽기

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class test1_2_2 {
	public static void main(String[] args) throws IOException {

		try {
			// 바이트 단위로 파일읽기
			String filePath = "D:/Eclipse/Java/Output.txt"; // 대상 파일
			FileInputStream fileStream = null; // 파일 스트림

			fileStream = new FileInputStream(filePath);// 파일 스트림 생성

			byte[] readBuffer = new byte[fileStream.available()];// 버퍼 선언

			while (fileStream.read(readBuffer) != -1) {
			}

			System.out.println(new String(readBuffer)); // 출력

			fileStream.close(); // 스트림 닫기

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
