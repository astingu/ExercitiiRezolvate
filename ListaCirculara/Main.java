package ListaCirculara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args){
		LastNumberNode myList = new LastNumberNode();
		
		myList.add("aaa");
		myList.add("bbb");
		myList.add("ccc");
		myList.add("ddd");
		
		/* serialize  the list*/
	    try
	      {
	         FileOutputStream fileOut =
	         new FileOutputStream("serial.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(myList);
	         out.close();
	         fileOut.close();
	         System.out.println("Serialized data is saved in serial.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		
		/* deserialize  the list */
	    try
	      {
	         FileInputStream fileIn = new FileInputStream("serial.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         myList = (LastNumberNode) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("LastNumberNode class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized");

	    }
	
}
