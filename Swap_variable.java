package java_practice;

public class Swap_variable {

	public static void main(String[] args) {
		
		System.out.println("------using 3rd variable---------");
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
		System.out.println("-------without using 3rd variable--------");
		int c=30;
		int d=40;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c+" "+d);
		

	}

}
