package com.csg.tau.TestProject.TestScript;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(33, "A"));
		list.add(new Student(11, "C"));
		list.add(new Student(25, "B"));
		list.add(new Student(22, "B"));
		list.sort(Comparator.comparing(o -> o.getName()));
		for(Student s: list) {
			System.out.println(s.age + " "+s.name);
		}

	}

}
