package com.sivasoft.in;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("Apple");
		queue.add("Mango");
		queue.add("Grapes");
		queue.add("Banana");
		System.out.println(queue);  //[Apple, Mango, Grapes, Banana]
		
		queue.remove("Grapes");
		System.out.println(queue); //[Apple, Mango, Banana]
		System.out.println("Queue total size: "+queue.size()); //3
		System.out.println("Queue includes fruit 'Apple'? : "+queue.contains("Apple")); //true
		
		queue.clear();
	}

}
