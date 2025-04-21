package java_practice;

public class Sentence_reverse {

	public static void main(String[] args) {
		String sen="i'm from banglore";
		String[] str = sen.split(" ");
		int len = str.length;
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev+=str[i]+" ";
		}
		String reverse = rev.trim();
		System.out.println(reverse);

	}

}
