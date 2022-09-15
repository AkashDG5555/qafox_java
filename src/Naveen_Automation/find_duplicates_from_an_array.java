package Naveen_Automation;

import java.util.HashSet;
import java.util.Set;

public class find_duplicates_from_an_array {

	public static void main(String[] args) {

		// Using for Loop (time complexity n2
		String names[]= {"java","python","ruby","python"};
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate element is: "+names[i]);
				}

			}
		}
		
		// Using hashset  #Recomended
		
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("duplicate element is: "+name);
			}
		}
	}
}
