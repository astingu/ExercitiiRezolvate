package clientsserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyThread implements Runnable{
	
	Scanner scanner;
	PrintWriter out;
	BufferedReader in; 
	
	public MyThread(Socket client) throws IOException{
		scanner = new Scanner(System.in);
		out = new PrintWriter(client.getOutputStream(), true);
	    in = new BufferedReader(new InputStreamReader(client.getInputStream()));
	}
	
	@Override
	public void run() {
		
		String clientMessage;
		while(true){
			try {
				
				 clientMessage = in.readLine();
				 System.out.println(clientMessage);
				 String msg = scanner.nextLine();
				 out.println(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}     	
	}

}
