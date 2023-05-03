package practiceProgram;

public class ArmstrongDemo {

	public static void main(String[] args) {
		
		int num=153;
		int rem=0;
		int cube=0;
	    int temp=num;
	    while(temp!=0)
	    {
	    	rem=temp%10;
	    	cube=cube+rem*rem*rem;
	    	temp=temp/10;
	    }
	    if(cube==num)
	    {
	    	System.out.println("num is armstrong");
	    }
	    else
	    	System.out.println("num is not armstrong");
		

	}

}
