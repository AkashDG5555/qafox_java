package Naveen_Automation;

public class Swap_Two_Integer_Without_Using_Third_Variable {

	public static void main(String[] args) {
		
		
		int x=5;
		int y=10;
		
		//with Using third variable temp(t)
		
//		int t;
//		t=x;
//		x=y;
//		y=t;
		
		
		//Without Using Third Variable (Using + Operator)
		
//		x = x+y;
//		y = x-y;
//		x = x-y;
//		
		//Without Using Thrd Variable (Using * Operator)
		
//		x = x*y;
//		y = x/y;
//		x = x/y;
		
		//Using XOR (^)
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		
		
		
		System.out.println(x);
		System.out.println(y);
	}

}
