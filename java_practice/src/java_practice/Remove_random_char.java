package java_practice;

public class Remove_random_char {

	public static void main(String[] args) {
		String s="pratap";
		int temp=s.charAt(0);
		int len=s.length();
		String req=s.substring(0, 1);
		
		for(int i=1;i<len-1;i++)
		{
			int a=s.charAt(i);
			if(a>temp)
			{
				req+=s.charAt(i);
				temp=a;
			}	
		}
		System.out.println(req);

	}

}
