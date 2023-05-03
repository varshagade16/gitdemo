package practiceProgram;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String s1="listentyu";
		String s2="silent";
		if(s1.length()!=s2.length())
		{
			System.out.println("string is not anagram");
		}
		else
		{
			char a[]=s1.toLowerCase().toCharArray();
			char b[]=s2.toLowerCase().toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			System.out.println(Arrays.equals(a, b));
		}

	}

}
