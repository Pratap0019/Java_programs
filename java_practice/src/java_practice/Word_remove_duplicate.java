package java_practice;

import java.util.LinkedHashSet;

public class Word_remove_duplicate {

	public static void main(String[] args) {
		String word="i am bhanu i am from testYantra";
		String[] st = word.split(" ");
		int len = st.length;
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<len;i++)
		{
			set.add(st[i]);
		}
		String unique="";
		for(String str:set)
		{
			unique+=str+" ";
		}		
		unique=unique.trim();
		System.out.println(unique);
	}
}
