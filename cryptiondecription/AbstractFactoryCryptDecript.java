package com.cryptiondecription;

public class AbstractFactoryCryptDecript {
	public enum FactoryType{
		criptare1, criptare2
	}
	
	private static AbstractFactoryCryptDecript INSTANCE = null;
	private AbstractFactoryCryptDecript(){		
	}
	
	public static AbstractFactoryCryptDecript getInstance() throws Exception{
		if (INSTANCE == null){
			INSTANCE = new AbstractFactoryCryptDecript();
		}
		
		return INSTANCE;
	}
	
	
	public static CryptDecript createFactory (FactoryType cryptDecriptType){
		switch(cryptDecriptType){
			case criptare1: return new CryptDecriptImplementation();
			//case criptare2: return new CryptDecriptImplementation();		
		}
		throw new IllegalArgumentException("The FactoryType " + cryptDecriptType + " is not recongized!");

	}

}
