package clientsserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args){
		try{
			ServerSocket serverSocket = new ServerSocket(20000);

            while(true) {
            	Socket client = serverSocket.accept();
    			System.out.println("Clientul s-a conectat");
    		
    			Thread newThread = new Thread(new MyThread(client));
    			newThread.start();
            }
		}  catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}