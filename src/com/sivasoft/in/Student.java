package com.sivasoft.in;

public class Student implements Comparable<Student>{  
		int rollno;  
		String name;  
		int age;  
		
	public Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
		}  
		  
		public int compareTo(Student stud){  
		if(age==stud.age)  
		return 0;  
		else if(age>stud.age)  
		return 1;  
		else  
		return -1;  
		}  
	}  

