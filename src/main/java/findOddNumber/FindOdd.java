package findOddNumber;

public class FindOdd {
	public static void findoddnumber(int i)
	{
		int r;
		while(i>0)
		{
			r=i%10;
			i=i/10;
			if(!(r%2==0))
			{
				System.out.println(r+" is odd");
			}
		}
	}
}
