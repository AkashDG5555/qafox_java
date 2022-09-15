package srings_pactice;

public class reverse_string_wrt_sentace {

	public static void main(String[] args) {
		String s = "i am automation test engineer";
		String[]str=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++) {
			rev =str[i]+" "+rev;
			
		}
		System.out.println(rev);
	}
}
