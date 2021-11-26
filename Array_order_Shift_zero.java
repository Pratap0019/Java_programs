package java_practice;

public class Array_order_Shift_zero {

	public static void main(String[] args) {
		int a[]= {1,3,0,7,0,5,1,0,0,8};
		
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
			if(a[i]==0)
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

	}

}
