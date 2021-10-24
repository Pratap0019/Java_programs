package java_practice;

public class Sentence_swapping_first_with_last {

	public static void main(String[] args) {
		String sen="25 din mein paisa double";
		String[] str = sen.split(" ");
		int len = str.length;
		
		String temp="";
		temp=str[0];
		str[0]=str[len-1];
		str[len-1]=temp;
		String rev="";
		for(int i=0;i<len;i++)
		{
			rev+=str[i]+" ";
		}
		String swapped = rev.trim();
		System.out.println(swapped);

	}
}
