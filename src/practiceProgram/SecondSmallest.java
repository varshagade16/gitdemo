package practiceProgram;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int firstlargest=Integer.MAX_VALUE;
		int secondlargets=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(firstlargest>=a[i])
			{
				secondlargets=firstlargest;
				firstlargest=a[i];
			}
			else
			{
				secondlargets=a[i];
			}
		}
		System.out.println(firstlargest);
		System.out.println(secondlargets);
	}

}
