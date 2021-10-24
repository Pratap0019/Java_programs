package java_practice;

import java.util.LinkedHashSet;

public class String_duplicate_remove {

	public static void main(String[] args) {
		String s="bhanupratapsahoo";
		int len = s.length();
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<len;i++)
		{
			set.add(s.charAt(i));
		}
		String dup="";
		for(char obj:set)
		{
			dup+=obj;
		}
		System.out.println(dup);

	}

}
