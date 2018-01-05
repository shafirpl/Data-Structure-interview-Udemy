package com.ds;

public class One_Dimension_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[5];
		numbers[0] = 20;
		numbers[1] = 5;
		numbers[2] = 10;
		numbers[3] = 6;
		numbers[4] = 11;
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		Student [] students = new Student[4];
		students[0] = new Student("hossain",27);
		students[1] = new Student("hosn",25);
		students[2] = new Student("ain",20);
		students[3] = new Student("hos",31);
		
		for(Student i:students)
		{
			System.out.println(i.name+ " "+i.age);
		}
	}

}
