package Practice_prog;

import java.util.Scanner;

public class arayyy2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("the size is "+size);
	System.out.println("enter the values");
	for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	}
	System.out.println("The values are:");
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
	
}

}
