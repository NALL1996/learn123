package com.sivasoft.in;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {

	public static void main(String[] args) {

	Deque<Integer> num = new ArrayDeque<>();
	num.offer(10);
	num.offerLast(21);
	num.offerFirst(52);
	System.out.println("Deque elements :"+num); //[52, 10, 21]
	int first = num.peekFirst();
	System.out.println("First elememt is:"+first); //52
	
	int lastElement = num.peekLast();
	System.out.println("Last element :"+lastElement); //21
	int removed = num.pollFirst();
	System.out.println("Removed First Element:"+removed); //52
		
	System.out.println("Updated Deque is :" +num);	//[10, 21]

		
		
	}

}
