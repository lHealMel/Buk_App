//���� �� ���

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
	
    //�� ó���� ������ �� ����
	public static void test1(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		String i = scan.nextLine();

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			String str = "���� ������ ���� �����ϴ�.\r\n";
			bs.write(str.getBytes()); // Byte�����θ� ���� �� ����
			bs.write(i.getBytes());

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // �ݵ�� �ݴ´�.
		}
		scan.close();
	}

	// ���� �߰� �޼ҵ�
	public void writer(String words_writer) throws IOException {
		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter("C:\\Users\\mtn20\\Desktop\\test\\test.txt");

		try {
			words_writer = words_writer + "\r\n";
			fw.write(words_writer);// Byte�����θ� ���� �� ����
		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			fw.close(); // �ݵ�� �ݴ´�.
		}
		scan.close();
	}

	// ����� �޼ҵ�
	public void write(String words) throws IOException {

		BufferedOutputStream bs = null;
		try {
			words = words + "\r\n";
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			bs.write(words.getBytes());// Byte�����θ� ���� �� ����

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // �ݵ�� �ݴ´�.
		}

	}

	// ����� (scan�̿�) �޼ҵ�
	public void write_scan() throws IOException {
		Scanner scan = new Scanner(System.in);
		String words_scan = scan.next();

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:\\Users\\mtn20\\Desktop\\test\\test.txt"));
			String str = "���� ������ ���� �����ϴ�.\r\n";
			bs.write(str.getBytes()); // Byte�����θ� ���� �� ����
			bs.write(words_scan.getBytes());

		} catch (Exception ex) {
			ex.getStackTrace();
			// TODO: handle exception
		} finally {
			bs.close(); // �ݵ�� �ݴ´�.
		}
		scan.close();
	}
}
