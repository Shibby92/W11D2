import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientNumbers {

	// umjesto 127.0.0.1. moze i localHost
	public static final String serverAdress = "127.0.0.1";
	// port mora biti isti ako i kod servera!!
	public static final int port = 1728;

	/**
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 */

	private static void connectToServer() throws UnknownHostException,
			IOException {

		Socket client = new Socket(serverAdress, port);

		SocketRW sc = new SocketRW(client.getInputStream(),
				client.getOutputStream());

		while (true) {
			String message = sc.recieve();
			System.out.println("Number: " + message);

		}

	}

	public static void main(String[] args) {
		try {
			connectToServer();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}