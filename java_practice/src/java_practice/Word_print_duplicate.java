package java_practice;

import java.util.LinkedHashSet;

public class Word_print_duplicate {

	public static void main(String[] args) {
		String word="i am bhanu i am from testYantra";
		String[] st = word.split(" ");
		int len = st.length;
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<len;i++)
		{
			set.add(st[i]);
		}
		
		for(String el:set)
		{
			int count=0;
			for(int j=0;j<len;j++)
			{
				if(el.equals(st[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(el+" is duplicate");
			}
		}

	}

}
