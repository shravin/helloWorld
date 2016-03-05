package com.hackerrank;

public class BubbleSort {

	public static <E> void main(String[] args) 
	{
		int inputArray[] = {10,34,2,56,7,67,88,42};
		for (int i=0;i<inputArray.length		; i++)
		{
			for (int j=1;j<inputArray.length-i;j++)
			{
				if (inputArray[j-1] > inputArray[j])
				{
					int temp = inputArray[j-1];
					inputArray[j-1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		
			
		for (int i=0; i<inputArray.length;i++)
		{
			System.out.print(inputArray[i] + " ");	
		}
			
	}

}
