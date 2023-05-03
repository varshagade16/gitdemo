package practiceProgram;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=28;
		int temp=no;
		int sum=0;
		for(int i=1;i<temp;i++)
		{
			if(temp%i==0)
			{
				sum=sum+i;
			}
		}
		if(no==sum)
		{
			System.out.println("given no is perfect");
		}
		else
			System.out.println("given no is not perfect");

	}

}
