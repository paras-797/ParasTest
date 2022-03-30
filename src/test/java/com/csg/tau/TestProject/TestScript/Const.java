package com.csg.tau.TestProject.TestScript;

public class Const {
	
	final int i;
	int j;
	
	
	Const(int x, int y){
		i=10;
		
		j=y;
	}

	public void sum() {
		int k=i+j;
		System.out.println(k);
	}

	public static void main(String[] args) {
		Const obj=new Const(50,20);
		obj.sum();
		

	}

}
