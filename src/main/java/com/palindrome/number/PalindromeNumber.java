package com.palindrome.number;

public class PalindromeNumber {
	public static void PalNum(int i)
	{
		int t,s=0,rem;
		t=i;
		while(i>0)
		{
			rem=i%10;
			s=(s*10)+rem;
			i=i/10;
		}
		if(t==s)
		{
			System.out.println(t+" is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
