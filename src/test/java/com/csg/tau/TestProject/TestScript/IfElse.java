package com.csg.tau.TestProject.TestScript;

public class IfElse {

	public static void main(String[] args) {
		int x=100;
		int y=200;
		int z=30;
		if(x>y) {
			if(x>z) {
				System.out.println(x);
			}
			else {
				System.out.println(z);
			}
		}
		else {
			if(y>z) {
				System.out.println(y);
			}
			else {
				System.out.println(z);
				
			}
			
		}

	}

}
