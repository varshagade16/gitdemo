package practiceProgram;

public class SmallestnumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{1,2,3,8},{4,5,0,9}};
		
		int smallest_num=a[0][0];
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i][j]<=smallest_num)
				{
					smallest_num=a[i][j];
				}
			}
			
		}
		System.out.println(smallest_num);
	}

}
