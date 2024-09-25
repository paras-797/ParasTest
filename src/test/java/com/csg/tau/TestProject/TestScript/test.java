package com.csg.tau.TestProject.TestScript;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Single{
	int sum(int x, int y);
	static void me(){
		System.out.println("I also");
	
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s=(a,b)->a+b;
		Single.me();
		List<Integer> li=Arrays.asList(1,2,3,4,5,6);
		List res=li.stream().map(x->x*x).collect(Collectors.toList());
		int result=s.sum(2,3);
		System.out.println(result);
		System.out.println(res);
		

	}

}
