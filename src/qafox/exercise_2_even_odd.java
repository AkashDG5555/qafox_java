package qafox;

import java.util.Scanner;

public class exercise_2_even_odd {
	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc1.nextInt();
		sc1.close();
		if(num%2==0) {
			System.out.println("the number entered is Even");
		}else {
			System.out.println("the number entered is Odd");
		}
		
	}

}
