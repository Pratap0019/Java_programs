package java_practice;

public class String_design {

	public static void main(String[] args) {
		
		String s="INDIA";
		int len = s.length();
		
	String temp="";
	
	for(int i=0;i<len;i++)
	{		
		temp+=s.charAt(i);
		System.out.println(temp);
	}
	System.out.println();
	for(int i=0;i<len;i++)
	{		
		System.out.println(s.subSequence(0, i+1));
	}
	System.out.println();
	for(int i=0;i<len;i++)
	{		
		System.out.println(s.substring(0, i+1));
	}

	}
}
