package com.csg.tau.TestProject.ParasTest;

import java.util.ArrayList;

public class finduniqueChar {

	public static void main(String[] args) {
		String s=" aaabbcdeefffijjjkaacmnpm";
		char[] ch=s.toCharArray();
		ArrayList<Character> al=new ArrayList<Character>();
		for(char c:ch) {
			
			if(al.contains(c)){
				al.remove(c);
				
			}else {
				al.add(c);
			}
		}
		System.out.println(al);
	}

}
