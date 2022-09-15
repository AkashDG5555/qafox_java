package srings_pactice;

public class reverse_without_3rdVariable {

	public static void main(String[] args) {
		String s="automation";
		char[]charr=s.toCharArray();
		int count=0;
		for( char c:charr) {
			count++;
		}
		for(int i=count-1;i>0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
