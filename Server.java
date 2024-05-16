import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	//create a port number to listen to
	private final static int PORT = 1234;

	public static void main(String[] args) throws IOException{
		
		try (		// create the socket
		ServerSocket serverSocket = new ServerSocket(PORT);
		
		//accept the client connection and save it in a socket object
		Socket clientSocket = serverSocket.accept();
		
		//function 1, send messaging to clients
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		
		//function 2, receive messages from clients
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
			
			
		}
	

	}

}
