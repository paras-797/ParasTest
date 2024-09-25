package com.csg.tau.TestProject.TestScript;

public class ChildOfInteface implements Abcd{

	public static void main(String[] args) {
		ChildOfInteface obj=new ChildOfInteface();
		obj.sum();
		obj.print();

	}
	
	@Override
	public void sum() {
		System.out.println("Sum method of interface");
		
	}

	@Override
	public void print() {
		System.out.println("print method of interface");
		
	}

}
