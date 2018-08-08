package com.largest.given.number;

public class LargestOfGivenNumber {
	public static void largest(int i,int j,int k)
	{
		if(i>j && i>k)
		{
			System.out.println(i+" is greatest");
		}
		else if(j>i && j>k)
		{
			System.out.println(j+" is greatest");
		}
		else if(k>i && k>j)
		{
			System.out.println(k+" is greatest");
		}
		else if(k==i && k==j && i==j)
		{
			System.out.println("all the given numbers are equal");
		}
	}

}
