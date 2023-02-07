package com.sivasoft.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");
		System.out.println("listStrings before sorting: " + listStrings);
		Collections.sort(listStrings);
		System.out.println("listStrings after sorting: " + listStrings);

		listStrings.sort(null); // sort by natural ordering of the elements
	
	}

}
