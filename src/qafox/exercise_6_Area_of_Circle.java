package qafox;

import java.util.Scanner;

public class exercise_6_Area_of_Circle {

	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		double radius = sc1.nextDouble();
		
		System.out.println("Area of circle having the radius" +radius+"is :"+(Math.PI*radius*radius));
		
	}
}
