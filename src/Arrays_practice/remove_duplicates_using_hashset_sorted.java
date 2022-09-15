package Arrays_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remove_duplicates_using_hashset_sorted {

	public static void main(String[] args) {
		int[]a= {1,2,2,4,2,5,7,7,5,8,9,8,9,1};
		Set<Integer>set=new HashSet <Integer>();
		for (int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		Integer[]b=set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
	}
}
