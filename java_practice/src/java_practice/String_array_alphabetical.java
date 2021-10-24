package java_practice;

public class String_array_alphabetical {

	public static void main(String[] args) {
		String[]a= {"c","bbb","bb","cc","a","aaa","ccc","aa","b"};
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				int val = a[j].compareTo(a[i]);
				if(val==-1)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
	/*for(int i=0;i<len;i++)
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
		}*/
		for(String ar:a)
		{
			System.out.println(ar);
		}

	}

}
