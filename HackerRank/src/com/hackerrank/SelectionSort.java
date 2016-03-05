package com.hackerrank;

public class SelectionSort {

	public static <E> void main(String[] args) 
	{
		int inputArray[] = {10,34,2,56,7,67,88,42};
		final int size = inputArray.length;
		for (int i=0;i<size; i++)
		{
			int index=0;
			for (int j=1;j<size -i; j++)
			{
				if (inputArray[index] < inputArray[j])
				{
					index = j;
				}
				if (j >= 0)
				{
					int temp = inputArray[size - i-1];
					inputArray[size - i-1] = inputArray[index];
					inputArray[index]=temp;
							
				}
			}
		}
		
			
		for (int i=0; i<inputArray.length;i++)
		{
			System.out.print(inputArray[i] + " ");	
		}
			
	}

}
