package Naveen_Automation;

public class reverse_an_Integer {

	public static void main(String[] args) {
		// Using Algorithm
		int num=12345;
		int rev=0;

		while(num!=0)
		{
			rev= rev*10 + num%10;
			num=num/10;
		}

		System.out.println("reverse is: "+rev);
		
		//Using StringBuffer
		
		int num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
}
