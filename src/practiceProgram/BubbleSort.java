package practiceProgram;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,7,8,1};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>=a[j+1])
					
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
							
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
