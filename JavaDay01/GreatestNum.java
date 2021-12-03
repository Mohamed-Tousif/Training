package com.sonata;

public class GreatestNum {
	public static void main( String[] args ){
		int a=12,b=25,c=89;
		if(a>=b && a>=c)  
			System.out.println("The largest number is "+a); 
		else if (b>=a && b>=c)
			System.out.println("The largest number is "+b);
		else
			System.out.println("The largest number is "+c);
	}

}
