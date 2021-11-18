import java.net.*;
import java.io.*;
import java.util.*;

public class TcpServer {
	public static void main(String args[]) throws Exception {
		ServerSocket s = new ServerSocket(6666);
		Socket s1 = s.accept();
		// DataInputStream din = new DataInputStream(s1.getInputStream());
		DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
		dout.writeUTF("Hi there");
		dout.close();
		s1.close();
	}
}
