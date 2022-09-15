package Naveen_Automation;

public class reverse_string {

	public static void main(String[] args) {

		// Using For Loop

		String s = "AUTOMATION";
		int len=s.length();
		String rev = "";

		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);

		// Using String Buffer

		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
