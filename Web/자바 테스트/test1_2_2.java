import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class test1_2_2 {
	public static void main(String[] args) throws IOException {
		try {
			// ����Ʈ ������ �����б�
			String filePath = "C:\\Users\\mtn20\\Desktop\\test\\test.txt"; // ��� ����
			FileInputStream fileStream = null; // ���� ��Ʈ��

			fileStream = new FileInputStream(filePath);// ���� ��Ʈ�� ����

			// ���� ����
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}

			System.out.println(new String(readBuffer)); // ���

			fileStream.close(); // ��Ʈ�� �ݱ�

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}