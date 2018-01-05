package com.ds;

/*We are making the value object since we don't know what type of 
 * data the user wants, since object is superclass or parent of 
 * every data type, it is safe to use Object
 */
public class Node {
Object value;
Node next;
	public Node(Object value) {
		this.value = value;
	}

	public Object display() {
		return value;
	}
}
