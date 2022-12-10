package com.calculator.bodmas;

import java.util.Scanner;

public class ValidEquationCheck {
      int option;
	Scanner sc=new Scanner(System.in);
	public String equationCheck() throws RuntimeException{
		String str=CalculatorMain.equation;
		
		char [] arr=str.toCharArray();
		System.out.println("In Valideq check class2");
	
		for(int k=0;k<arr.length;k++) {
		if(arr[k]=='0'||arr[k]=='1'||arr[k]=='2'||arr[k]=='3'||arr[k]=='4'||arr[k]=='5'||arr[k]=='6'||arr[k]=='7'
				||arr[k]=='8'|| arr[k]=='9'||arr[k]=='(' || arr[k]==')' || arr[k]=='^' || arr[k]=='/' 
				|| arr[k]=='*' ||arr[k]=='+' ||arr[k]=='-' || arr[k]=='.') {
			option=1;
			System.out.println(option);
			if(option==1 && k ==(arr.length)-1) {
				BodmasCal p=new BodmasCal();
				p.SolveEquation(str);
				System.out.println("Inside checks");
				}
			}
	else{
			option=2;
			throw new WrongEquationException("You have Enter wrong Equation please enter Valid Equation. for Ex. (4/6)*3+2*3-44");
			
	}
		
		
		}
		return str;
		
	}
	public  void checkNew() throws RuntimeException {
		System.out.println("Please Enter 2 for Adding Correct Equation: ");
		option=sc.nextInt();
		if(option==2) {
			CalculatorMain.inputEqu();
		}
		}
	
		
	


}
