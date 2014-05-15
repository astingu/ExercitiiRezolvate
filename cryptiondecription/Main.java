package com.cryptiondecription;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


import com.cryptiondecription.AbstractFactoryCryptDecript.FactoryType;



public class Main {

	public static void main(String[] args) {
		
		PrintWriter writerEncrypt = null;
		PrintWriter writerDecript = null;
		BufferedReader readerEncrypt = null;
		BufferedReader readerDecript = null;
		
		String line = null;
		
		try {
			AbstractFactoryCryptDecript newObject = AbstractFactoryCryptDecript.getInstance();
			
			/* criptarea unui fisier  */
			writerEncrypt = new PrintWriter("encryptedFile.txt");
			String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";		
			
			readerEncrypt = new BufferedReader(new FileReader("file.txt"));
			
			while((line = readerEncrypt.readLine()) != null){
				CryptDecript crypt1 = newObject.createFactory(FactoryType.criptare1);
				writerEncrypt.println(crypt1.CryptArrayList(line));
			}

			/* decriptarea unui fisier, foloseste fisierul generat la criptare */
			readerDecript = new BufferedReader(new FileReader("encryptedFile.txt"));
			writerDecript = new PrintWriter("decriptedFile.txt");
			while((line = readerDecript.readLine()) != null){
				CryptDecript crypt2 = newObject.createFactory(FactoryType.criptare1);
				writerDecript.println(crypt2.DecriptArrayList(line));
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		try {
			readerEncrypt.close();
			writerEncrypt.close();
			readerDecript.close();
			writerDecript.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	
		
	}

}
