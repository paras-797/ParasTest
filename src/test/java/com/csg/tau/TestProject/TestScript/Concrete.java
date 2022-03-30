package com.csg.tau.TestProject.TestScript;

public class Concrete implements Abc, Abc2{


	
	
	public static void main(String[] args) {
	Concrete obj=new Concrete();
	obj.sum();
	obj.print();
	}

	
	public void sum() {
		System.out.println("sum method of interface");
		
	}

	
	public void print() {
		System.out.println("print method of interface");
		
	}

}
