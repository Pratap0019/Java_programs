package java_practice;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the range");
		int range=scn.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}

}
