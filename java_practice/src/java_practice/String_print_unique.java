package java_practice;

import java.util.LinkedHashSet;

public class String_print_unique {

	public static void main(String[] args) {
		String s="bhanupratapsahoo";
		int len = s.length();
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<len;i++)
		{
			set.add(s.charAt(i));
		}
		
		for(char obj:set)
		{
			int count=0;
			for(int j=0;j<len;j++)
			{
				if(obj==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			System.out.println(obj+" is unique");
		}


	}

}
