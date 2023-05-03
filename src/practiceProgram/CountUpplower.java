package practiceProgram;

public class CountUpplower {

	public static void main(String[] args) {
		
		String s="VarshaNileshGADE";
		
		int uppcount =0;
		int lowercount=0;
      for(int i=0;i<s.length();i++)
      {
    	  if(s.charAt(i)>=65 && s.charAt(i)<=90)
    	  {
    		  uppcount++;
    	  }
    	  else
    	  {
    		  lowercount++;
    	  }
    	  
      }
      System.out.println(uppcount);
      System.out.println(lowercount);
	}

}
