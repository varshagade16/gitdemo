package practiceProgram;

public class JunkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="$%%^$^varshagade";
		
		String str=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
	}

}
