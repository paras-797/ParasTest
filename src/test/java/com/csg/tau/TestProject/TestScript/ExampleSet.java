package com.csg.tau.TestProject.TestScript;

import java.util.*;

public class ExampleSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		
		TreeSet<Integer> hs1=new TreeSet<Integer>();
		hs1.add(40);
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		
		hs1.add(10);
		
		hs1.add(20);
		for(Integer a:hs1) {
		System.out.println(a);
		
		}

	}

}
