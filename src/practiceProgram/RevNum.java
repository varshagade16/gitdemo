package practiceProgram;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=4574;
		int rev=0;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
