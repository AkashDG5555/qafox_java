package srings_pactice;

public class remove_duplicates {
public static void main(String[] args) {
	String s="aaabccddeeeffggg";
	String s1="";
	for (int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if (s.indexOf(ch)==-1) {
			s1=s1+ch;
		}
	}
	System.out.println(s1);
}
}
