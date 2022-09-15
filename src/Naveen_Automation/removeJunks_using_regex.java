package Naveen_Automation;

public class removeJunks_using_regex {
	
	public static void main(String[] args) {
		
	
	String s= "akash!@#$%te^^()*&_+st!@#$%engineer9999";
	
	s=s.replaceAll("[^a-zA-Z-9]","");
	
	System.out.println(s);
	
}
}
