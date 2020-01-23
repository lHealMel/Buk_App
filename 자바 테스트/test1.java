//클라이언트

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class test1 {

	public static void main(String[] args) {
		try {
			int portNum = 5001; //

			Socket sock = new Socket("localhost", portNum);

			ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
			outstream.writeObject("Hello Android");
			outstream.flush();

			ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
			System.out.println(instream.readObject());
			sock.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
