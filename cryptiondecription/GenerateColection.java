package com.cryptiondecription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenerateColection {
	
	public static ArrayList<LetterMapping> generateArrayList(){
		ArrayList<LetterMapping> letterMappingList = new ArrayList<LetterMapping>();
		
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		for(int i = 0; i < 26; i++){
			LetterMapping obj = new LetterMapping(Character.toString(alphabet[i]), i+1);
			letterMappingList.add(obj);
			
		}
		
		return letterMappingList;
	}
	
	public static HashMap<String, Integer> generateHashMap(){

		Map<String, Integer> result = new HashMap<String, Integer>();
		
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for(int i = 0; i < 26; i++){
			result.put(Character.toString(alphabet[i]),  i+1);
			
		}
		
		return (HashMap<String, Integer>) result;
		
	}

}
