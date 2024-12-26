package exampleofclientserver;

import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
     System.out.println("client started");
     Socket soc = new Socket("localhost",9809);
     System.out.println("connected to server");
		}
     catch(Exception e )
     {
    	 e.printStackTrace();
     } 
	}
}
	
		
     
	


