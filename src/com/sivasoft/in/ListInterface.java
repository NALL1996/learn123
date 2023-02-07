package com.sivasoft.in;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("NALLAPATI");
		list.add("nagarjuna");
		list.add("venkata siva");
		list.add("NALLAPATI");
		list.add("venkata siva");
		for(String student :list)
		System.out.println(student);
	
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		for(String numbers :listStrings)
		System.out.println(numbers);
	
	
	
}

}
