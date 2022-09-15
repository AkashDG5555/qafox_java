package Naveen_Automation;

public class FindLargestandSmallestNumber {

	public static void main(String[] args) {
		
		int[] Numbers= {-10, 20, 50, 70, 100, -50, 200};
		
		int largest =  Numbers[0];
		int smallest = Numbers[0];
		
		for(int i=1;i<Numbers.length;i++) {
			if (Numbers[i]>largest) {
				largest=Numbers[i];
				
			}
			
			else if (Numbers[i]<smallest) {
				smallest=Numbers[i];
		}
			
		}
		System.out.println("Largest Number is: "+largest);
		System.out.println("Largest Number is: "+smallest);
	}
}
