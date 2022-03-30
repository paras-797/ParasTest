package com.csg.tau.TestProject.TestScript;

public class childC  extends ParentC{

	public void mult(int a, int b) {
		
		int z=a*b;
		System.out.println("Multiplication of two numbers is"+z);
		
	
	}
	
	public void print() {
		System.out.println("I am Child class");
	}
	
	public void sum(int a,int b) {
		int z=a+b;
		System.out.println("Sum of two numbers is child "+z);
	}
	
	
	public static void main(String[] args) {
		childC obj=new childC();
		obj.mult(20,10);
		obj.sum(20, 10);
		obj.print();
		
	}

}
