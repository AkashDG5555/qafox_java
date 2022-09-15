package srings_pactice;

public class swap_without_thirs_variable {

	public static void main(String[] args) {
		String s="welcome";
		String s1="hydrabad";
		s=s+s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println(s+"\n"+s1);
	
	}
}
