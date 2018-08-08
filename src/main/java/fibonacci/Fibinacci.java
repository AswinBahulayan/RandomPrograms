package fibonacci;

public class Fibinacci {
	
	public static void fib(int n)
	{
		int f1=0,f2=1;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=0;i<=n;i++)
		{
			int temp=f1+f2;
			f1=f2;
			f2=temp;
			System.out.println(temp);	
		}
	}

}
