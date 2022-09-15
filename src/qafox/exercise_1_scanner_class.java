package qafox;

import java.util.Scanner;

public class exercise_1_scanner_class {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter first number");
		int FN = sc1.nextInt();
		sc1.close();
		
		System.out.println("Enter second number");
		int SN = sc1.nextInt();
		
		System.out.println("The sum of first numer and second number is :"+(FN+SN));
	}

}
