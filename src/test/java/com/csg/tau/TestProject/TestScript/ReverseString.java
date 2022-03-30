package com.csg.tau.TestProject.TestScript;

public class ReverseString {

	public static void main(String[] args) {
		String s="I am learning Java";
		String [] str=s.split(" ");
		String rev="";
		for(int i=str.length-1; i>=0;i--) {
			
			rev=rev+str[i]+" ";//java learning am I 
		}
		
		System.out.println("reverse of string is "+ rev);

	}

}
