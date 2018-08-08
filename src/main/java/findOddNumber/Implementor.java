package findOddNumber;

import java.util.Scanner;

import com.factorial.Factorial;
import com.first.third.largest.FirstThirdLargest;
import com.largest.given.number.LargestOfGivenNumber;
import com.month.days.MonthAndDays;
import com.palindrome.number.PalindromeNumber;
import com.reverse.number.ReverseNum;
import com.tables.writer.TablesWriter;

import fibonacci.Fibinacci;

public class Implementor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the number to check");
		int i=sc.nextInt();
		//odd number
		FindOdd.findoddnumber(i);
		//largest of three number
		LargestOfGivenNumber.largest(5, 5, 5);
		//Month and days finder
		System.out.println("please enter a value bet 1 and 12");
		int j=sc.nextInt();
		MonthAndDays.monthAnddays(j);
		//Mutiplication
		TablesWriter.tableswriter(12, 12);
		//factorial
		Factorial.facnum(5);
		//palindrome
		PalindromeNumber.PalNum(86556);
		Fibinacci.fib(10);
		//ReverseNum obj=new ReverseNum(132);
*/		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers");
		for(int k=0;k<=n-1;k++)
		{
			a[k]=sc.nextInt();
		}
		
		FirstThirdLargest.firstthird(a);
	}

}
