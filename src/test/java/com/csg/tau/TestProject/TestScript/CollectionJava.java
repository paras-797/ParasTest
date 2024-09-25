package com.csg.tau.TestProject.TestScript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbffcdabnctgdnaaggff";
		char []ch=str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c,  hm.get(c)+1);
			}else {
				hm.put(c,1);
			}
				
		}
		for(Map.Entry m: hm.entrySet()){
			System.out.println(m.getKey() + " is appearing "+ m.getValue() + " times");
		}

		
		
		
	}

}
