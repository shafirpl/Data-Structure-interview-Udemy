package com.ds;

import java.util.Arrays;

public class Dynamic_Array <T>{
Object [] data;
int size;
//size here works as index
	public Dynamic_Array() {
		this.size = 0;
		this.data = new Object[1];
	}
	public int getsize() {
		return this.data.length;
	}
	public T getdata(int index) {
		return (T) data[index];
		
	}
	
	public void put(Object element)
	{
		ensurecapacity(size+1);
		//size = size+1;
		data[size] = element;
		size = size+1;
	}
	
	public void ensurecapacity(int minCapacity) {
		int oldCapacity = this.getsize();
		if(minCapacity>oldCapacity)
		{
			int newCapacity = 2*oldCapacity;
			if(minCapacity>newCapacity)
				newCapacity = minCapacity;
			data = Arrays.copyOf(data, newCapacity);
		}
	}
	
public void printArray() {
	System.out.println("Printing elements of the array");
	for(int i=0; i<data.length-1;i++)
	{
		
		System.out.println(data[i]);
	}
}
//Ending braces
	}
