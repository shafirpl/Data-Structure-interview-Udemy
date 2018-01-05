package com.ds;

public class Two_Dimension_Array {

	public Two_Dimension_Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] data = new int[3][3];
			
			//first row
			data[0][0] = 1;
			data[0][1] = 2;
			data[0][2] = 5;
			
			//second row
			data[1][0] = 5;
			data[1][1] = 8;
			data[1][2] = 12;
			
			//third row
			data[2][0] = 0;
			data[2][1] = 0;
			data[2][2] = 0;
			
			//printing all the data
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++) {
					System.out.print(data[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
			
			//printing diagonal values
			
			System.out.println("Printing diagonal values");
			
			for(int i=0;i<3;i++) {
				System.out.println(data[i][i]);
				
			}
			
			System.out.println("\n");
			//another way to print diagonal values
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++) {
					if(i==j)
					{System.out.print(data[i][j]+"\t");}
					
				}
			}
	int a = 10;
	int b = a;
	a = 20;
	System.out.println(a+" "+b);
	
		/*ending bracket */ }
	}


