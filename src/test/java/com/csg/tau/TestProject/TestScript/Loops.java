package com.csg.tau.TestProject.TestScript;

public class Loops {
	int id;
	String name;
	int marks;
	static String college="IIT";
	
	public void print(int sid, String sname, int smarks) {
		id=sid;
		name=sname;
		marks=smarks;
		System.out.println(id+" "+ name+" "+marks+" "+college);
		
	}
	
	public static void type() {
		System.out.println("I am static method");
	}
	
	void add() {
		final String i="pranav";
		int j=20;
		
		System.out.println();
	}
	

	public static void main(String[] args) {
		Loops obj=new Loops();
		obj.add();

	}

}
