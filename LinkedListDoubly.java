package com.ds;

public class LinkedListDoubly<T> {
	
	Node_doubly head;
	
	public LinkedListDoubly(){
		head = null;
	}

	public void insertNode(T value) {
		Node_doubly node = new Node_doubly(value);
		if(head==null) {
			head = node;
			node.next = null;
			node.previous = null;
			return;
		}
		node.next = head;
		node.previous = null;
		head.previous =node;
		head = node;
		
	}
	public void displayallnodes() {
		Node_doubly node = head;
		System.out.println("Printing in forward direction");
		while(node!=null)
		{
			System.out.println(node.value);
			node = node.next;
		}
		System.out.println("Printing in backward direction");
		node = head;
		//traversing the list to get to the last node
		while(node.next!=null) {
			node = node.next;
		}
		
		while(node!=null) {
			System.out.println(node.value);
			node = node.previous;
		}

	}
	
	public void delete() {
		Node_doubly node = head.next;
		node.previous = null;
		head.next = null;
		head = node;
		
		
	}
	public Node_doubly findData(T data) {
		Node_doubly node = head;
		while(node!=null) {
			if(node.value.equals(data)) {
				System.out.println("Found it");
				return node;
			}
			node = node.next;
		}
		System.out.println("Data not found");
		return null;
	}
	
	public void insertNodeafter(T value, T nodevalue) {
		//System.out.println("This is from insertNodeafter");
		Node_doubly node = findData(nodevalue);
		Node_doubly newnode = new Node_doubly(value);
		//System.out.println(node);
		if(node==null) {
			System.out.println("Invalid input");
			return;
		}
		if(node==head) {
			insertNode(value);
			return;
		}
		
		//meaning last node
		if(node.next == null) {
			node.next = newnode;
			newnode.previous = node;
			newnode.next = null;
			return;
		}
		
		newnode.next = node.next;
		node.next.previous = newnode;
		node.next = newnode;
		newnode.previous = node;
	}
	
	public void deleteData(T value) {
		Node_doubly node = findData(value);

		if(node==null) {
			System.out.println("Invalid Input for deletition");
			return;
		}
		
		if(node == head) {
			head = head.next;
			head.previous = null;
			return;
		}
		//last node
		if(node.next==null) {
			Node_doubly node1 = node.previous;
			node1.next = null;
			node.previous = null;
			return;
		}
		Node_doubly node1 = node.previous;
		node1.next.next.previous = node1;
		node1.next = node.next;
		node.next = null;
		node.previous = null;
		
		
	}
	
}
