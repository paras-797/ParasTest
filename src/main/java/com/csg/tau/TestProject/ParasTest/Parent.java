package com.csg.tau.TestProject.ParasTest;

//method overriding

public class Parent {
	
	public void sum(int a, int b) {
	int z=a+b;
	System.out.println("sum is "+z);
	}
	
	public void minus(int a, int b) {
	int z=a-b;
	System.out.println("substraction is "+z);
	}
	
	public void print(int a, float b) {
		System.out.println("I am the parent class");
	}

	public static void main(String[] args) {

		Parent p=new Parent();
		p.sum(10, 20);

	}
}
