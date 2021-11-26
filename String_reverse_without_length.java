package java_practice;

public class String_reverse_without_length {

	public static void main(String[] args) {
		String s="kya haal hai";
		int count=0;
	 char[]	ch=s.toCharArray();
		
		for(Object obj:ch)
		{
			count++;
		}
		System.out.println(count);
		
		String rev="";
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));//without using 3rd variable	
			rev+=s.charAt(i);//by using 3rd variable
		}
		System.out.println();
		System.out.println(rev);

	}

}
