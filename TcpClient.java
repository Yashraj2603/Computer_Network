import java.io.*;
import java.net.*;
import java.util.*;

public class TcpClient {
	public static void main(String[] args) throws Exception {
		Socket s1 = new Socket("localhost", 6666);
		DataInputStream din = new DataInputStream(s1.getInputStream());
		String st = new String(din.readUTF());
		System.out.println(st);
		din.close();
		s1.close();

	}
}
