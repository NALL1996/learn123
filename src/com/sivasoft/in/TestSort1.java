package com.sivasoft.in;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();  
		arrayList.add(new Student(101,"nallapati",23));  
		arrayList.add(new Student(106,"zamzam",27));  
		arrayList.add(new Student(105,"venkat",21));  
		  
		Collections.sort(arrayList);  
		for(Student student:arrayList){  
		System.out.println(student.rollno+" "+student.name+" "+student.age);  
		}  
		} 
	}


