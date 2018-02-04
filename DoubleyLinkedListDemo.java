package com.ds;

public class DoubleyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDoubly <String> list = new LinkedListDoubly<String>();
		list.insertNode("Shafi");
		list.insertNode("Evana");
		list.insertNode("Abbu");
		list.insertNode("Ammu");
		list.insertNode("Junk");
		list.displayallnodes();
		list.delete();
		list.displayallnodes();
		
		list.findData("Shafi");
		list.findData("Junk");
		list.insertNodeafter("Ashique", "Shafi");
		list.insertNodeafter("hello", "Abbu");
		list.insertNodeafter("Adina", "Ammu");
		list.displayallnodes();
		list.deleteData("Adina");
		list.deleteData("hello");
		list.deleteData("Ashique");
		list.deleteData("hello");
		list.displayallnodes();

	}

}
