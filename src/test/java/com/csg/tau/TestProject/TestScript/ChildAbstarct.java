package com.csg.tau.TestProject.TestScript;

public class ChildAbstarct extends AbstractionConcept{

	public static void main(String[] args) {
		ChildAbstarct obj=new ChildAbstarct();
		obj.print();
		obj.sum();

	}

	@Override
	void print() {
		System.out.println("I am abstract method of abstract class that has been implemented by child class");
		
	}


}
