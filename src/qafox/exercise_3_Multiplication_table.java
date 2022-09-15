package qafox;

import java.util.Scanner;

public class exercise_3_Multiplication_table {
public static void main(String[] args) {
	Scanner sc1= new Scanner(System.in);
	System.out.println("Enter any number");
	int num = sc1.nextInt();
	sc1.close();
	for(int i=1;i<=10;i++) {
		System.out.println(num+"x" +i+ "="+(i*num));
	}
}

	}


