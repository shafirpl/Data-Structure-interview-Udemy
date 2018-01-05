package com.ds;

public class LinkedListU <T>{
Node head;
	public LinkedListU() {
		head = null;
	}
	public boolean isEmpty()
	{
		return (head==null);
	}
	
	public void insertNode(Object value) {
		
		Node newNode = new Node(value);
		
			newNode.next = head;
			head = newNode;
		
	}
	
	public void display_all_nodes() {
		Node currentNode = head;
		
		while(currentNode!=null) {
			T value = (T) currentNode.display();
			System.out.println(value);
			currentNode = currentNode.next;
		}
		
	}
	
	public T delete() {
		if(head==null) {
			return null;
			
		}
		Node currentNode = head;
		head = head.next;
		return (T) currentNode.value;
	}
	
	public T findData(T data) {
		Node currentNode = head;
		while(currentNode !=null) {
			if(data == (T)currentNode.value) {
				return data;
			}
			currentNode = currentNode.next;
		}
		return null;
	}
	public T delete(T data) {
		Node currentNode = head;
		Node previousNode = head;
		
		while(currentNode!=null) {
			if(data == (T) currentNode.value) {
				T value = (T) currentNode.value;
				previousNode.next = currentNode.next;
				return value;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
			return null;
	}

//end of class linked List 
}
