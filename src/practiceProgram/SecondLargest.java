package practiceProgram;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int firstlargest=Integer.MIN_VALUE;
		int secondlargets=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(firstlargest<=a[i])
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
