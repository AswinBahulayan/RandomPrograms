package com.tables.writer;

public class TablesWriter {
	public static void tableswriter(int i, int n)
	{
		int j;
		for(j=1;j<=n;j++) 
		{
			System.out.println(i+"x"+j+"="+(i*j));
		}
	}

}
