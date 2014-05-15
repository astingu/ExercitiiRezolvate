package com.cryptiondecription;

public class LetterMapping {
	
		public String letter;
		public int number;
		
		public LetterMapping(String letter, int number) {
			super();
			this.letter = letter;
			this.number = number;
		}
		
		public String toString(){
			return letter + " " + number;
		}
}
