package week3.day2.Assigments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	/*
	 * Pseudo Code
	 *input: int[] a={3,2,11,4,6,7};
	 *        int[] b={1,2,8,4,9,7};
	 *output:2,4,7
	 *
	 * a) Declare An Array for {3,2,11,4,6,7};	 
	 * b) Declare another Array for {1,2,8,4,9,7};
	 * c) create a two empty Lists - list1 & list2
	 * c) Declare for loop iterator from 0 to array a.length and add into list1
	 * d) Declare for loop iterator from 0 to array b.length and add into another list2
	 * e) Compare Both list1 & list2 using a nested for loop
	 *    1)Print the matching number
	 *  
	 */


	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		 int[] b={1,2,8,4,9,7};
		 List<Integer> c =new ArrayList<Integer>();
		 List<Integer> d =new ArrayList<Integer>();
		 for (int i = 0; i < a.length; i++) {
			 c.add(a[i]) ;
		 }
		 for (int j = 0; j < b.length; j++) {
				 d.add(b[j]) ;
				}
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < d.size(); j++) {
				
				if ((c.get(i)).equals(d.get(j))) {
					System.out.println(c.get(i));
				}
				
			}
			
		}
		 

	}

}
