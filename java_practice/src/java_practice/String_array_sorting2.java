package java_practice;

public class String_array_sorting2 {

	public static void main(String[] args) {
		String[]a= {"bhanu","dibyajyoti","sanjeeb","chetan","pawan","bhanubhanu"};
		int len=a.length;
		String max=a[0];
		for(int i=1;i<len;i++)
		{
			if(max.length()<a[i].length())
			{
				max=a[i];
			}
		}
		System.out.println("elements with maximum lenghth are");
		for(int i=0;i<len;i++)
		{
			if(max.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
		}

	}

}
