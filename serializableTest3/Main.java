package com.serializableTest3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Main {

	public static void main(String[] args) {
	      
	        SuperClasa subClass = new SubClasa();
	        subClass.setId(10);
	        subClass.setValue("Data");
	        ((SubClasa) subClass).setName("Pankaj");
	        
	        /* serialization */
	        try
		      {
		         FileOutputStream fileOut =
		         new FileOutputStream("serial.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(subClass);
		         out.close();
		         fileOut.close();
		         System.out.println("Serialized data is saved in serial.ser");
		      }catch(IOException i)
		      {
		          i.printStackTrace();
		      }
	        
	        /* deserialization */ 
		    try
		      {
		         FileInputStream fileIn = new FileInputStream("serial.ser");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         subClass = (SubClasa) in.readObject();
		         in.close();
		         fileIn.close();
		      }catch(IOException i)
		      {
		         i.printStackTrace();
		         return;
		      }catch(ClassNotFoundException c)
		      {
		         System.out.println("SubClasa class not found");
		         c.printStackTrace();
		         return;
		      }
		      System.out.println("Deserialized");
		      
		   
	}

}
