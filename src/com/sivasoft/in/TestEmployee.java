package com.sivasoft.in;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> employees  = Employee.getEmployees();
		   
	  //Sort all employees by first name
		  employees.sort(Comparator.comparing(e -> e.getFirstName()));
		//  System.out.println(employees);
		
	  // you can use below
		  employees.sort(Comparator.comparing(Employee::getFirstName));	
	 //	  System.out.println(employees);
	
		  //Sort all employees by first name; And then reversed
		  Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
		  employees.sort(comparator.reversed());
	//	  System.out.println(employees);
	
		  //Sorting on multiple fields; Group by.
		  Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
		                            .thenComparing(Employee::getLastName);
		  employees.sort(groupByComparator);
		//  System.out.println(employees);	
	
		//Parallel Sorting
		  Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
		   
		  //Parallel sorting
		  Arrays.parallelSort(employeesArray, groupByComparator);
		//  System.out.println(employeesArray);
		
		    Comparator<Employee> empNameComparator = Comparator.comparing(Employee::getFirstName, Comparator.nullsLast(String::compareTo));
		    Collections.sort(employees, empNameComparator);
		 //   employees.forEach(System.out::println);
		
		    Comparator<Employee> empNameComparator2 = Comparator.comparing(Employee::getFirstName).reversed();
		    Collections.sort(employees, empNameComparator2);
	 //      employees.forEach(System.out::println);
	 
	       
	       
	       Comparator<Employee> basedOnName = new Comparator<Employee>() {
	   		@Override
	   		public int compare(Employee o1, Employee o2) {
	   			return o1.getFirstName().compareTo(o2.getFirstName());
	   		}
	   	};
	   
			/*
			 * Comparator<Employee> basedOnFiName = (Employee o1, Employee
			 * o2)->o1.getFirstName().compareTo(o2.getFirstName());
			 */
	}
	}

