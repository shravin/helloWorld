package com.hackerrank;

import java.util.Queue;

public class InsertionSort {

	public static <E> void main(String[] args) 
	{
		int inputArray[] = {10,34,2,56,7,67,88,42};
		int key;
		for (int i=0;i<inputArray.length; i++)
		{
			key = inputArray[i];
			int j=i-1;
			while (j>=0 && key < inputArray[j])
				{
						inputArray[j+1]=inputArray[j];
						j--;
				}
				inputArray[j+1]=key;
			}
			
			for (int i=0; i<inputArray.length;i++)
		{
			System.out.print(inputArray[i] + " ");
		}
			
		
	}

}


//public static void insertionSort(int toSort[]) {  
//	  for (int i = 0; i < toSort.length; i++) {  
//	   int value = toSort[i];  
//	   int j = i - 1;  
//	   while (j >= 0 && toSort[j] > value) {  
//	    toSort[j + 1] = toSort[j];  
//	    j = j - 1;  
//	   }  
//	   toSort[j + 1] = value;  
//	  
//	  }  
//	 } 