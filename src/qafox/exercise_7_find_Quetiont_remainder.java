package qafox;

import java.util.Scanner;

public class exercise_7_find_Quetiont_remainder {
public static void main(String[] args) {
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the first Number");
	int FirstNumber = sc1.nextInt();
	System.out.println("Enter the second Number");
	int SecondNumber=sc1.nextInt();
	
	//Find quotient
	System.out.println("Quotient of the given number is: "+(FirstNumber/SecondNumber));
	
	//Find remainder
	System.out.println("Remainder of the given number is: "+(FirstNumber%SecondNumber));
}
}
