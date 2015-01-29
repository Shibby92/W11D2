import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerNumbers {
	// nesto kao adresa ili otvor gdje cekamo konekciju,
	// rade od 0 do cc.65000,
	// koristiti portove iznad 1500
	public static final int port = 1728;

	/**
	 * @throws IOException
	 * 
	 */

	public static void startServer() {
		try {
			Scanner scen = new Scanner(System.in);
			// socket koji ceka da se neko na njega spoji
			ServerSocket server = new ServerSocket(port);
			while (true) {

				System.out.println("waiting");
				Socket client = server.accept();
				SocketRW sc = new SocketRW(client.getInputStream(),
						client.getOutputStream());
				for (int i = 1; i <= 10; i++) {
					sc.send(String.valueOf(i));

				}

				// accept vraca new Socket
				// kada upisemo accept nista ispod ove
				// linije nece se izvrsiti dok se ne desi konekcija

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		startServer();
	}

}
