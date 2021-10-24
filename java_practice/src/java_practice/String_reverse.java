package java_practice;

public class String_reverse {

	public static void main(String[] args) {
		System.out.println("----------------reverse string-------------------");
		String s="bhanu";
		int len = s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));//without using 3rd variable	
			rev+=s.charAt(i);//by using 3rd variable
		}
		System.out.println();
		System.out.println(rev);
	}

}
