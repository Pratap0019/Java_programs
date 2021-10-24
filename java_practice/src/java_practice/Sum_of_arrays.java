package java_practice;

public class Sum_of_arrays {

	public static void main(String[] args) {
		int []a= {10,20,30,56,56,79};
		int[]b= {20,30,50,60};
		
		int len=a.length;
		if(a.length<b.length)
		{
			len=b.length;
		}
		
		for(int i=0;i<len;i++)
		{
			try{
			System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				if(a.length>b.length)
				{
					System.out.print(a[i]+"  ");
				}
				else
					System.out.print(b[i]+" ");
			}
		}

	}

}
