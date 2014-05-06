package com.endava.exceptionChaining;

public class PersistenceComponent 
{
	void persist(Object arg) throws PersistenceException{
		throw new PersistenceException("Cannot persist object " + arg.toString());
	}
}
