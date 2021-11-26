package java_practice;

public class segregation {

	public static void main(String[] args) {
		String s="aBc@123$%xYz24";
		int len = s.length();
		
		String alpha="";
		String numeric="";
		String character="";
		for (int i=0;i<len;i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='A'&& s.charAt(i)<='Z' )
			{
				alpha+=s.charAt(i);
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				numeric+=s.charAt(i);
			}
			else
			{
				character+=s.charAt(i);
			}
		}
		
		System.out.println("alphabetics are "+alpha);
		System.out.println("numbers are "+numeric);
		System.out.println("characters are "+character);

	}

}
