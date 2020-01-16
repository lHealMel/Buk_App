//파일 입 출력

import java.io.*;
import java.util.Scanner;

public class test1_2 {
	public static void main(String[] args) throws IOException {
		test1_2 myTest = new test1_2();
		String adsf = "qwer1234";

		try {
			myTest.write("fdas" + adsf);
			myTest.write("testinnnnng");

		} catch (Exception ex) {
			ex.getStackTrace();
		}

	}
	
    //맨 처음에 가지고 온 예제
	public static void test1(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		String i = scan.nextLine();

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			String str = "오늘 날씨는 아주 좋습니다.\r\n";
			bs.write(str.getBytes()); // Byte형으로만 넣을 수 있음
			bs.write(i.getBytes());

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // 반드시 닫는다.
		}
		scan.close();
	}

	// 내용 추가 메소드
	public void writer(String words_writer) throws IOException {
		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter("C:\\Users\\mtn20\\Desktop\\test\\test.txt");

		try {
			words_writer = words_writer + "\r\n";
			fw.write(words_writer);// Byte형으로만 넣을 수 있음
		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			fw.close(); // 반드시 닫는다.
		}
		scan.close();
	}

	// 덮어쓰기 메소드
	public void write(String words) throws IOException {

		BufferedOutputStream bs = null;
		try {
			words = words + "\r\n";
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			bs.write(words.getBytes());// Byte형으로만 넣을 수 있음

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // 반드시 닫는다.
		}

	}

	// 덮어쓰기 (scan이용) 메소드
	public void write_scan() throws IOException {
		Scanner scan = new Scanner(System.in);
		String words_scan = scan.next();

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			String str = "오늘 날씨는 아주 좋습니다.\r\n";
			bs.write(str.getBytes()); // Byte형으로만 넣을 수 있음
			bs.write(words_scan.getBytes());

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // 반드시 닫는다.
		}
		scan.close();
	}
}
