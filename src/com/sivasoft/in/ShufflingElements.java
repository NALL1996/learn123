package com.sivasoft.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflingElements {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) numbers.add(i);
		System.out.println("List before shuffling: " + numbers);
		Collections.shuffle(numbers);
		System.out.println("List after shuffling: " + numbers);	
//Reversing elements in a list
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) nums.add(i);
		System.out.println("List before reversing: " + nums);
		Collections.reverse(nums);
		System.out.println("List after reversing: " + nums);		
		
	}

}
