package com.sivasoft.in;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
    
		int count[] = {21,23,43,53,22,65};
		Set<Integer> set = new HashSet<Integer>();
		try {
			for(int i = 0; i<=5; i++) {
				set.add(count[i]);
			}
		System.out.println(set); //[65, 21, 53, 22, 23, 43]
		
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		
		System.out.println("The sorted list is:");
		System.out.println(sortedSet);   //[21, 22, 23, 43, 53, 65]
		
		System.out.println("First element of the set is :"+(Integer) sortedSet.first());  //21
		System.out.println("last element of the set is :"+(Integer)sortedSet.last());    //65
		}catch(Exception e) {
	}
	}
}


