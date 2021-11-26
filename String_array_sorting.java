    package java_practice;

public class String_array_sorting {

	public static void main(String[] args) {
		String[]a= {"bhanu","dibyajyoti","sanjeeb","chetan","pawan"};
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
			if(a[i].length()>a[j].length())
			{
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		    }
		}
		for(String ar:a)
		{
			System.out.print(ar+" ");
		}
		
		System.out.println();
		System.out.println("element with maximum length "+a[len-1]);
		System.out.println("element with minimum length "+a[0]);
	}

}
