package com.csg.tau.TestProject.TestScript;

public class Test2 extends Test1{
	
public static void mult() {
		
		int x=10; 
		int y=20;
		int z=x*y;
		System.out.println(z);
	}

public void div() {
	
	int x=100; 
	int y=20;
	int z=x/y;
	System.out.println(z);
}


public void print() {
	System.out.println("I am the print method of test2 class");
}

static {
	
	System.out.println("I amlearining static block");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2.mult();
		Test2 obj = new Test2();
		obj.div();
		
		obj.minus();
		obj.print();
	
		

	}

}



