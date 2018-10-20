package com.cg.mps.exception;

public class MobileException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String msg;
	public MobileException(String msg)
	{
		super(msg);
	}
	public MobileException(String msg, Throwable cause,ErrorCode code)
	{
		super(msg,cause);
	}
}
