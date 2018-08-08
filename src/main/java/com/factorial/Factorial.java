package com.factorial;

public class Factorial {

	public static void facnum(int n)
	{
		int i,b=1;
		for(i=1;i<=n;i++)
		{
			b=b*i;
			
		}
		System.out.println("The factorial of the given number is :"+b);
	}
}
