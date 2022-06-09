package com.csg.tau.TestProject.TestScript;

public class TestDemo {
	final int x;
	int y;
	
	public TestDemo(int a,int b) {
		x=a;
		y=b;
		
	}
	private void sum() {
		
		 int z=x+y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo obj=new TestDemo(20, 30);
		obj.sum();
	}

}











