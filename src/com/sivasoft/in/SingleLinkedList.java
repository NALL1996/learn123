package com.sivasoft.in;

import org.w3c.dom.Node;

public class SingleLinkedList {
	Node head;
	
 static class Node{
	 int data;
	 Node next;
	 
	 Node(int d){
		 data = d;
		 next = null;
	 }	 
 }
	
	public void display() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data+"\n");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		list.display();				
	}
}
