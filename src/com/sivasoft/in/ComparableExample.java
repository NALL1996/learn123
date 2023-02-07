package com.sivasoft.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

	List<Laptop> listLaptops = new ArrayList<>();	
		
	listLaptops.add(new Laptop("HCL",16,800));
	listLaptops.add(new Laptop("Apple",8,100));
	listLaptops.add(new Laptop("Dell", 4, 600));
		
	Collections.sort(listLaptops);	
	for(Laptop lap : listLaptops) {
		System.out.println(lap.getRam());
	}
		
		
		
	}

}
