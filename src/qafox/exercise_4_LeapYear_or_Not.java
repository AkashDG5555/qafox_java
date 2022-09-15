package qafox;

import java.util.Scanner;

public class exercise_4_LeapYear_or_Not {
public static void main(String[] args) {
	Scanner sc1= new Scanner(System.in);
	System.out.println("Enter any year");
	int year = sc1.nextInt();
	sc1.close();
	
	
	boolean isLeapYear=false;
	
	if(year%4==0) {
		if(year%100==0) {
			if(year%400==0) {
				isLeapYear=true;
				
			}
			
		}else {
			isLeapYear=false;
			
		}
	}else {
		isLeapYear=true;
		
}
		
	
		
	

	}

}

