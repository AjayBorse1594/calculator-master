package com.calculator.bodmas;

import java.util.Stack;

public class BodmasCal {
	public int SolveEquation(String expression) {
		System.out.println(expression);
		char[] arr=expression.toCharArray();
		//stack for numbers
		Stack<Integer> values=new Stack<Integer>();
		//stack for operators
		Stack<Character> operator=new Stack<Character>();
		for(int i=0;i<arr.length;i++) {
			//skip white Space
			if(arr[i]==' ')
				continue;
			
			
				//if opening braces at i then condition
			else  if( arr[i]=='('   ){
				operator.push(arr[i]);  
				}
			//once meet close braces then solve the inner equation
			else if( arr[i]==')'   ){
				while(operator.peek()!='('  )
				 values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
		operator.pop();
				System.out.println(values+"here 1st loop will print");
				}
			else if(arr[i]=='+'  ) {
				System.out.println(arr[i]);
			//when top sign is greater or equal sign then
				//apply operator on top which is greater
				//bring top two element in values stack
				while(! operator.empty() || hasPrecedence(arr[i] ,operator.peek()))
				{	//pusing token into operator
					operator.push(arr[i]);
					values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
					}
			//remaining is parse values ,we use rest operator for the remain value
			while(!operator.empty()) {
				values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
				//if top value will result simply return it
				}}
			else if(arr[i]=='-'  ) {
				System.out.println(arr[i]);
			//when top sign is greater or equal sign then
				//apply operator on top which is greater
				//bring top two element in values stack
				while(! operator.empty() || hasPrecedence(arr[i] ,operator.peek()))
				{	//pusing token into operator
					operator.push(arr[i]);
					values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
					}
			//remaining is parse values ,we use rest operator for the remain value
			while(!operator.empty()) {
				values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
				//if top value will result simply return it
				}}
			else if(arr[i]=='*'  ) {
				System.out.println(arr[i]);
			//when top sign is greater or equal sign then
				//apply operator on top which is greater
				//bring top two element in values stack
				while(! operator.empty() || hasPrecedence(arr[i] ,operator.peek()))
				{	//pusing token into operator
					operator.push(arr[i]);
					values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
					}
			//remaining is parse values ,we use rest operator for the remain value
			while(!operator.empty()) {
				values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
				//if top value will result simply return it
				}}
			else if(arr[i]=='/'  ) {
				System.out.println(arr[i]);
			//when top sign is greater or equal sign then
				//apply operator on top which is greater
				//bring top two element in values stack
				while(! operator.empty() || hasPrecedence(arr[i] ,operator.peek()))
				{	//pusing token into operator
					operator.push(arr[i]);
					values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
					}
			//remaining is parse values ,we use rest operator for the remain value
			while(!operator.empty()) {
				values.push(applyOpration(operator.pop(),values.pop(),values.pop()));
				//if top value will result simply return it
				}}
	
	
			//if there is number push it into the stack for numbers stack
			 if(arr[i]>='0' &&arr[i]<='9' && arr[i]!='+' && arr[i] !='-' && arr[i]!='*' && arr[i]!='/' ) {
				StringBuffer sbuff=new StringBuffer();
				
				//if num more than 1 digit
				while(i<arr.length && arr[i]>='0' && arr[i]<='9' && arr[i]!='+' && arr[i] !='-' && arr[i]!='*' && arr[i]!='/' ) {
					sbuff.append(arr[i++]);
					values.push(Integer.parseInt(sbuff.toString()));
				}}
		
		}
		System.out.println(values.pop());
		return values.pop();	
	}
	public static boolean hasPrecedence(char oper1, char oper2) {
		System.out.println("hi..final is this");
		if(oper2=='(' || oper2==')')
			return false;
		if(oper1=='*' || oper1=='/' && (oper2=='+' || oper2=='-'))
			return false;
		else
			return true;}
	

	private int applyOpration(char sign, int var2, int var1) {
		System.out.println(sign+var1+var2);
		switch(sign) {
		case '+' :
			return var1+ var2;
		case '-' :
			return var1- var2;
		case '*' :
			return var1* var2;
		case '/' :
			if(var2==0) {
			throw new ArithmeticException("Can't Divisible by Zero..!");
			}
			return var1/var2;
		}
		return  0;
		
	
		}	

}