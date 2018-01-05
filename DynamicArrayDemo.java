package com.ds;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		Dynamic_Array<Integer> hello = new Dynamic_Array<Integer>();
		hello.put(10);
		System.out.println(hello.getsize());
		hello.put(11);
		System.out.println(hello.getsize());
		hello.put(12);
		System.out.println(hello.getsize());
		hello.put(13);
		System.out.println(hello.getsize());
		hello.put(14);
		System.out.println(hello.getsize());
		hello.put(15);
		System.out.println(hello.getsize());
		hello.put(16);
		System.out.println(hello.getsize());
		hello.printArray();
		

	}

}
