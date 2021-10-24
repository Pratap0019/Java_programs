package java_practice;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		long a=scn.nextLong();
		long temp=0;
		long rev=0;
	
		while(a>0)
		{
		
		long rem=a%10;
		temp+=rem;
		rev=(rev*10)+rem;
		a=a/10;
		
		}
		
		
		
		System.out.println(temp);
		//System.out.println(rev);
	}

}
