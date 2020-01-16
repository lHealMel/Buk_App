// 서버부분

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class test1_1 {

	public static void main(String[] args) {
		try {
			int portNum = 5001;

			System.out.println("Starting Java Socket Server..");
			ServerSocket aServerSocket = new ServerSocket(portNum);
			System.out.println("Listening at port" + portNum + "...");

			while (true) {
				Socket sock = aServerSocket.accept();
				InetAddress clientHost = sock.getLocalAddress();
				int clientPort = sock.getPort();
				System.out.println("A client connected. host: " + clientHost + ",port:" + clientPort);

				ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
				Object obj = instream.readObject();
				System.out.println("Input: " + obj);

				ObjectOutputStream outstream = new ObjectOutputStream(sock.getOutputStream());
				outstream.writeObject(obj + "fromserver.");
				outstream.flush();
				sock.close();
				aServerSocket.close();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
   
}
