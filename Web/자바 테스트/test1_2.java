//파일 입력

import java.io.*;
import java.util.Scanner;

public class test1_2 {
	public static void main(String[] args) throws IOException {
		test1_2 myTest = new test1_2();
		String adsf = "qwer1234";

		myTest.writer("testinnnnng");
		myTest.writer("fdas" + adsf);

	}

	// 처음 참고한 예제
	public static void test1(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		String i = scan.nextLine();

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			String str = "Hello, World!";
			bs.write(str.getBytes()); // Byte로만 받아 들일 수 있다.
			bs.write(i.getBytes());

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // 꼭 닫는다.
		}
		scan.close();
	}

	// 파일 추가해서 쓰기
	public void writer(String words_writer) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\mtn20\\Desktop\\test\\test.txt", true);

		words_writer = words_writer + "\r\n";
		fw.write(words_writer);
		fw.close(); // 꼭 닫는다.

	}

	// 파일 덮어쓰기
	public void write(String words) throws IOException {

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			bs.write(words.getBytes()); // Byte로만 받아 들일 수 있다.
		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // 꼭 닫는다.
		}

	}

	// 파일 덮어쓰기(scan사용)
	public void write_scan() throws IOException {
		Scanner scan = new Scanner(System.in);
		String words_scan = scan.next();

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			String str = "Hello, World!";
			bs.write(str.getBytes()); // Byte로만 받아 들일 수 있다.
			bs.write(words_scan.getBytes());

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // 꼭 닫는다.
		}
		scan.close();
	}
	
}
