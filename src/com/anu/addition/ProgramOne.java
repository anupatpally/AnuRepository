package com.anu.addition;

public class ProgramOne {
	
	int a;
	int show(int a)
	{
	  
	   System.out.println(" Value of var is: "+a);
	   return a+1;
	}
	
	public static void main(String[] args) {
		ProgramOne obj= new ProgramOne();
		int x=obj.show(10);
		
		System.out.println(x);
		
		

	}

}
