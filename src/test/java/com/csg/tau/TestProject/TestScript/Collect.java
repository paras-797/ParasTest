package com.csg.tau.TestProject.TestScript;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collect {

	public static void main(String[] args) {
		//clasname objectname=new classname();
		
		LinkedList<Double> ll=new LinkedList<Double>();
		ll.add(10.5);
		ll.add(20.33);
		ll.add(10.0);
		
		ArrayList<Double> ll1=new ArrayList<Double>();
		ll1.add(20.5);
		ll1.addAll(ll);
		
		for(Double a:ll1) {
			System.out.println(a);
		}
		
		System.out.println("size of list is "+ll1.size());
		
		

	}

}
