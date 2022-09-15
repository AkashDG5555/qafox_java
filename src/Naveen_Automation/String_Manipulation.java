package Naveen_Automation;

public class String_Manipulation {

	public static void main(String[] args) {

		String str= "The rain has Started";
		String str1= "The rain has Started";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.indexOf("has"));
		
		//String Comparision 
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(0, 3));
		
		// Trims
		
		String s = "   Hello World   ";
		
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date="11-10-2022"; 
		
		System.out.println(date.replace("-", "/"));
		
		// Split
		
		String test = "Hello_world_test_selenium";
		
		String testval []=test.split("_");
		for (int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		String s2= "cares";
		System.out.println(s2.concat("s"));
		
		String x="Hello";
		String y="world";
		
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
				
		

	}
}
