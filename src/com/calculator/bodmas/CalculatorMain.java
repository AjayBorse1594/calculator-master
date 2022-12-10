package com.calculator.bodmas;

import java.util.Scanner;

public class CalculatorMain {
	static String  equation;
	public static void main(String[] args) {
		
		inputEqu();
	}
	public static void inputEqu() {
	System.out.println("Please Enter Your Equation:  ");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	equation=sc.next();
	System.out.println("Your Input Equation is= "+ equation);
	ValidEquationCheck vec=new ValidEquationCheck();
	vec.equationCheck();
	}
	
	public void callBodmas() {
		
		BodmasCal bs=new BodmasCal();
		bs.SolveEquation(equation);
	//	System.out.println("Result is: "+equation);
	}	
	
 
}
