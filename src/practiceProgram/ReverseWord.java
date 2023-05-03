package practiceProgram;

public class ReverseWord {

	public static void main(String[] args) {
		
		
		String str="Welcomr to Selenuim with java";
		String s1[]=str.split(" ");
		String reversestring="";
		for(String s2:s1)
		{
			String reverseword="";
			for(int i=s2.length()-1;i>=0;i--)
			{
				reverseword= reverseword+s2.charAt(i);
			}
			reversestring=reversestring+reverseword+" ";
		}
		System.out.println(reversestring);
		
	}

}
