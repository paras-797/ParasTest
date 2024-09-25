package com.csg.tau.TestProject.ParasTest;

public class Child extends Parent{
	
	public void multiply(int a, int b) {
		int z=a*b;
		System.out.println("multiply is "+z);
	}
	
	public void print(int a, float b) {
		System.out.println("I am the child class");
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.multiply(10,20);
		obj.sum(10,20);
		obj.minus(100, 80);
		obj.print(10, 20);

	}

}
