package com.reverse.number;

public class ReverseNum {
	public ReverseNum(int i)
	{
		int s=0,rem;
		while(i>0)
		{
			rem=i%10;
			s=(s*10)+rem;
			i=i/10;
		}
		System.out.println(s+" is the reverse of the number");
	}

}
