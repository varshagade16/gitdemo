package practiceProgram;

public class PrimeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		for(int i=2;i<100;i++)
		{
			 count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
				System.out.println(i);
			else
				System.out.println("no is not prime");
		}
		

	}

}
