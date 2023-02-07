package com.sivasoft.in;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> numbers = new LinkedList<String>();
		numbers.add("Five");
		numbers.add("Six");
		numbers.add("Seven");
		numbers.add("Eight");
		System.out.println(numbers);
		
		/*
		 * List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
		 * System.out.println(listNumbers);
		 */
	}

}
