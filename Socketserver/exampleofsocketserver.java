package exampleofclientserver;

import java.net.Socket;
import java.net.ServerSocket;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		System.out.println("waiting for client ...");
        ServerSocket ss = new ServerSocket(9809);
        Socket soc = ss.accept();
        System.out.println("CONNECTION ESTABLISHED");
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
        
	}
	}


