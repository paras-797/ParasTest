package com.csg.tau.TestProject.TestScript;

public class DemoClass {
	
	public double sum(int a , double b) {
		double z=++a + b--;//z=31, a=11, b=19
		z= ++z + --b; //z=32+18
		return z;
		
		
	}
	
	public int greatest(int a, int b,int c) {
		if(a>b && a>c)
			return a;
		else if (b>a && b>c)
		return b;
		else if(c>a && c>b)
			return c;
		else
			return 0;
		
		
	}
	
	public static void main(String[] args) {
		DemoClass obj=new DemoClass();
		double x=obj.sum(10,20.0);
//		int x=obj.greatest(500,500,500);
//		if(x==0)
//			System.out.println(" all are equal");
		System.out.println(x);

		
	}
	
}

////conditional statements
//1. if condition
//2. if else
//	3. if else if ladder
//	4 nested if else


/*Operators in JAVA
 * Unary Operators - which works on single variables
 * binary operators - whichworks on 2 variable
 * ternary operators - which works on 3 variables
 * 
 * Unary operators: ++ and --
 * 10++ =11 //operand or variable or value
 * 10-- = 9
 * 
 * 2 subtypes: pre and post
 * preincrement ++10 //first increase the value by 1 and then use the value
 * postincrement 10++ //first use the value and then increment
 * +,-,*,/,5%2=1,>,>=,<,<=,==, =, && , ||, !=
 * ?:
 */




//Object

//ClassName objectname=new Classname();
//objname.methodname();

//Class and objects

//class demotest{
	
	//variables
	//methods that performs opeartions on the variables
	//datatypes
//	101,202, 345  int
//	101.5,203.78  float
//	100.1234567 double
//	'c', 'y', 'n' char
//	"I am learning java" String
//	true, false boolean
	
	
	
	
//}
