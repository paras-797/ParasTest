package com.csg.tau.TestProject.TestScript;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streaming {

	class Student {
	    private int age;
	    private String name;
	    
	    public Student(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public String getName() {
	        return name;
	    }
	}
	public static void main(String [] args) {
		List<Student> list = new ArrayList<Student>();
		//list.add(new Student(33, "A"));
		//list.add(new Student(11, "C"));
		//list.add(new Student(22, "B"));
	}

}
  