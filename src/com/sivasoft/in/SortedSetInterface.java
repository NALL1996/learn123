package com.sivasoft.in;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class SortedSetInterface {

	public static void main(String[] args) {

		SortedSet set = new TreeSet();
		set.add("Bob");
		set.add("Sean");
		set.add("Jennifer");
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Object element = i.next();
			System.out.println(element.toString());
		}	
	}
}
