package com.ds;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListU<String> list = new LinkedListU<String>();
		System.out.println(list.delete());
		System.out.println(list.delete("shafi"));
		list.insertNode("Shafi");
		list.insertNode("Hello");
		list.insertNode("Evana");
		list.display_all_nodes();
		System.out.println("\nDeleting node" + " "+list.delete());
		list.display_all_nodes();
		System.out.println("Node is :"+" "+list.findData("Shafi"));
		System.out.println("Hello");
		list.display_all_nodes();
		list.insertNode("Masterchief");
		list.display_all_nodes();
		System.out.println("Deleted node is:"+" "+list.delete("Shafi"));
		list.display_all_nodes();

	}

}
