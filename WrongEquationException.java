package com.calculator.bodmas;

public class WrongEquationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public WrongEquationException(String msg) {
		super(msg);
		System.out.println(msg);
		ValidEquationCheck vc=new ValidEquationCheck();
		vc.checkNew();
		
		
	}
	
	
}
