package java_practice;

public class String_array_sorting_Ascending {

	public static void main(String[] args) {
		
		String[]a= {"bhanu","dibyajyoti","sanjeeb","chetan","pawan","bhanubhanu"};
		int len=a.length;
		String min=a[0];
		for(int i=1;i<len;i++)
		{
			if(min.length()>a[i].length())
			{
				min=a[i];
			}
		}
		System.out.println("elements with minimum length are");
		for(int i=0;i<len;i++)
		{
			if(min.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
		}


	}

}
