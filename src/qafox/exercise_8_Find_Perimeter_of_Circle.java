package qafox;

import java.util.Scanner;

public class exercise_8_Find_Perimeter_of_Circle {

public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the Radius : ");
	double radius = sc1.nextDouble();
	
	//Logic to find perimeter
	
	System.out.println("Perimeter of the given radius is :"+(2*Math.PI*radius));
	
}
}
