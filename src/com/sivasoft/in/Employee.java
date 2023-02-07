package com.sivasoft.in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
   
    public Employee(Integer id, String firstName, String lastName, Integer age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
      
  @Override
    public String toString() {
        return "\n["+this.id+","+this.firstName+","+this.lastName+","+this.age+"]"; 
    }

   static List<Employee> getEmployees(){
	List<Employee> empList = new ArrayList<Employee>();  
	empList.add(new Employee(6,"Yash", "Chopra", 25));
	  empList.add(new Employee(2,"Aman", "Sharma", 28));
	  empList.add(new Employee(3,"Aakash", "Yaadav", 52));
	  empList.add(new Employee(5,"David", "Kameron", 19));
	  empList.add(new Employee(4,"James", "Hedge", 72));
	  empList.add(new Employee(8,"Balaji", "Subbu", 88));
	  empList.add(new Employee(7,"Karan", "Johar", 59));
	  empList.add(new Employee(1,"Lokesh", "Gupta", 32));
	  empList.add(new Employee(9,"Vishu", "Bissi", 33));
	  empList.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	  return empList; 
  }
  
 
}