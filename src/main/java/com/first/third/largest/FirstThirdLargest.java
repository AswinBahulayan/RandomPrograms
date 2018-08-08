package com.first.third.largest;

public class FirstThirdLargest {
	public static void firstthird(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/*for(int i=0;i<=a.length;i++)
		{
			System.out.print(a[i]+", ");
		}*/
		System.out.println(a[0]+" is the first largest number");
		System.out.println(a[2]+" is the third largest number");
	}

}
