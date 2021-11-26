package java_practice;

public class Sorting_array {

	public static void main(String[] args) {
		
		System.out.println("----------ascending order-----------");
		int []a= {30,50,10,40,20,7,15,24,99,45};
		
		
		
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		    }
		}
		for(int ar:a)
		{
			System.out.print(ar+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("First minimum element "+a[0]);
		System.out.println("Second minimum element "+a[1]);
		System.out.println("Third minimum element "+a[2]);
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of first three minimum element "+sum);
		
		System.out.println();
		System.out.println("-------------descending order------------");
		
int []b= {30,50,10,40,20,7,15,24,99,45};
		
		int len1=b.length;
		
		for(int i=0;i<len1;i++)
		{
			for(int j=i+1;j<len1;j++)
			{
			if(b[i]<b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		    }
		}
		for(int ar:b)
		{
			System.out.print(ar+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("First maximum element "+b[0]);
		System.out.println("Second maximum element "+b[1]);
		System.out.println("Third maximum element "+b[2]);
		
		int sum1=0;
		for(int i=0;i<3;i++)
		{
			sum1=sum1+b[i];
		}
		System.out.println("Sum of first three maximum element "+sum1);

	}
}
