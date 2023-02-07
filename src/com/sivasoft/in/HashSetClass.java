package com.sivasoft.in;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class HashSetClass {
	public static void main(String[] args) {

	HashSet<String> hset = new HashSet<String>();	
		
		hset.add("Suzuki");
		hset.add("Kawasaki");
		hset.add("Honda");
		hset.add("Ducati");
		hset.add("Yamaha");
		hset.add("Yamaha");
		hset.add("Suzuki");
		hset.add(null);
		hset.add(null);
		System.out.println(hset);
		
	 Enumeration e = Collections.enumeration(hset);
	 System.out.println("Enumerating through Java HashSet");
	    while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	  } 
}


