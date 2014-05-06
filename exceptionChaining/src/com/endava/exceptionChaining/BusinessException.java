package com.endava.exceptionChaining;

public class BusinessException extends Exception 
{
	BusinessException(Exception ex)
	{
		super(ex);
	}
}
