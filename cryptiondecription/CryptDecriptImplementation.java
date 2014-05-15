package com.cryptiondecription;

import java.util.ArrayList;
import java.util.HashMap;


public class CryptDecriptImplementation implements CryptDecript{

	ArrayList<LetterMapping> letterMappingList = GenerateColection.generateArrayList();
	HashMap<String, Integer> resultMap = GenerateColection.generateHashMap();
	
	
	@Override
	public String CryptArrayList(String sir) {
			
		String resultCrypted = "";
		
		char[] transformedSir = sir.toCharArray();
		
		for(int i = 0; i < transformedSir.length; i++){
			String aux = transformedSir[i] + "";
			for(int j = 0; j < letterMappingList.size(); j++){		
				if(aux.equals(letterMappingList.get(j).letter)){
					resultCrypted = resultCrypted + letterMappingList.get(j).number + " ";
					break;
				}
			}
		}
		
		return resultCrypted;
	}

	@Override
	public String CryptHashmap(String sir) {		
		
		String resultCrypted = "";
		
		char[] transformedSir = sir.toCharArray();
		
		for(int i = 0; i < transformedSir.length; i++){
			String aux = transformedSir[i] + "";
			
			if(resultMap.containsKey(aux)){
				resultCrypted = resultCrypted + resultMap.get(aux) + " ";
			}
				
		}
		
		return resultCrypted;
	}

	@Override
	public String DecriptArrayList(String sir) {
		
		String resultDecripted = "";
		
		String[] transformedSir = sir.split(" ");
		
		for(int i = 0; i < transformedSir.length; i++){
			if(transformedSir[i].endsWith(" ") == false){
				for(int j = 0; j < letterMappingList.size(); j++){
					String newaux = letterMappingList.get(j).number + "";
					if(transformedSir[i].equals(newaux)){
						resultDecripted = resultDecripted + letterMappingList.get(j).letter;
						break;
					}
				}
			}
		}
		
		return resultDecripted;
	}

	@Override
	public String DecriptHashmap(String sir) {

		return null;
	}
	

}
