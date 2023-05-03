package practiceProgram;

public class PatternDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count=count+3;
			}
			System.out.println("");
		}

	}

}
