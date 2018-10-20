package com.cg.mps.exception;

import com.cg.mps.exception.ErrorCode;

public class CustomerException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String msg;
	public CustomerException(String msg)
	{
		super(msg);
	}
	public CustomerException(String msg, Throwable cause,ErrorCode code)
	{
		super(msg,cause);
	}
}
