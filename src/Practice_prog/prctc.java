package Practice_prog;

import java.util.Scanner;

public class prctc {
	  public static void main(String[] args){
	         boolean flag = false;
	         System.out.println("Enter input number");
	         Scanner sc = new Scanner(System.in);
	         int num = sc.nextInt();
	         for(int i=2;i<=num/2;i++){
	             if(num%i==0){
	                 flag = true;
	                 break;
	             }
	         }
	         if(!flag){
	                 System.out.println(num + " is a prime number");
	             } else{
	                 System.out.println(num + " is not a prime number");
	             }
	     }
	
	

}
