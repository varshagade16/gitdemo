package practiceProgram;

public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=10;
		int temp=no;
		int count=0;
		for(int i=1;i<=temp;i++)
		{
			if(temp%i==0)
			{
				count=count+1;
			}
		}
		if(count==2)
			System.out.println("givem no is prime");
		else
			System.out.println("given no is not prime");

	}

}
