package qafox;

import java.util.Scanner;

public class exercise_9_Find_the_Power {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = sc1.nextInt();
		int initialNumber=number;
		
		System.out.println("Enter the Power");
		int power=sc1.nextInt();
		
		for(int i=1;i<power;i++) {
			number=initialNumber*number;
			
		}
		System.out.println(initialNumber+" power "+power+" is: "+number);
		
	}
}
