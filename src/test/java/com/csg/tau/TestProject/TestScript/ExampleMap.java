package com.csg.tau.TestProject.TestScript;

import java.util.*;

public class ExampleMap {

	public static void main(String [] args) {

		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(4, "Sayali");
		hm.put(1, "Padma");
		hm.put(2,  "Neha");
		hm.put(3,  "Kirtee");
		hm.put(4, "Vani");
		
		for(Map.Entry a: hm.entrySet()) {
			System.out.println(a.getKey()+"  "+ a.getValue());
			
		}

	}
}
