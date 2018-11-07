import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCLChatServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(7000);
		System.out.println("Vao roi do");
		Socket socket = server.accept();
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String st = dis.readUTF();
			System.out.println(st);
			System.out.print("Server: ");
			String msg = sc.nextLine();
			dos.writeUTF("Server : "+msg);
			dos.flush();
			sc = sc.reset();
		}
	}
}
