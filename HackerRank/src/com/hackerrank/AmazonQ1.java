package com.hackerrank;

public class AmazonQ1 {

	public static void main(String[] args) 
	{
		int array[] = {1,1,0,0,1,1,1,0,0,1,1};
		int totalNumberOfFlips = 2;
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
