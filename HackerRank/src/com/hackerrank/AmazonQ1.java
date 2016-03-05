/*
Given an array of 0s and 1s, and k, Find the longest continuous streak of 1s after flipping k 0s to 1s.

E.x array is {1,1,0,0,1,1,1,0,1,1}
k = 1 (which means we can flip ‘k’ one 0 to 1)

Answer: 6 (if we flip 0 at index 7, we get the longest continuous streak of 1s having length 6)
*/

package com.hackerrank;

public class AmazonQ1 {

	public static void main(String[] args) 
	{
		int array[] = {1,1,0,0,1,1,1,0,0,1,1,1};
		int totalNumberOfFlips = 4;
		int tempFlips = totalNumberOfFlips;
		int tempNumberOfOnes=0;
		int maxNumberOfOnes = tempNumberOfOnes;
		for (int index = 0; index < array.length; index++) 
		{
			if (array[index] == 0)
			{
				if (tempFlips > 0)
				{
					tempFlips--;
					maxNumberOfOnes++;
					tempNumberOfOnes++;
				}
				else
				{
					tempNumberOfOnes=0;	
					tempFlips = totalNumberOfFlips;
				}
			}
			else
			{
				tempNumberOfOnes++;
				if (maxNumberOfOnes < tempNumberOfOnes)
				{
					maxNumberOfOnes = tempNumberOfOnes;	
				}
			}
		}
		System.out.println("Counter is : " + maxNumberOfOnes);
	}
}
