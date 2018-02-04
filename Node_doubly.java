package com.ds;

public class Node_doubly {
	
	Object value;
	Node_doubly next;
	Node_doubly previous;
	
	public Node_doubly(Object value){
		this.value = value;
	}

	public Object display() {
		return this.value;
	}
}
