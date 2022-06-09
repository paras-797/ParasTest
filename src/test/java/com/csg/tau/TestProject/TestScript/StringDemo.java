package com.csg.tau.TestProject.TestScript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class StringDemo {
	//find the frequency of characters in a string


	public static void main(String[] args) {
		String s="find how many repeated chracters I contain";
		char [] ch=s.toCharArray();
		HashMap<Character, Integer> hm =new HashMap<Character, Integer>();
		
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + " is appearing "+ m.getValue() +" times.");
		}
	}
}






//
//Collections: are a framework in java which works on group of objects/similar objects
//
//list, set and Map
//
//ArrayList, LinkedList, HashSet and LinkedHashSet , Treeset, HashMap, LinkedHashMap and TreeMap
//
//ArrayList<Integer> al=new ArrayList<Integer>();
//
//al.add(10);
//al.add(20);
//al.add(30);






