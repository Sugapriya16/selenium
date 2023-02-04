package week3.day2.Assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 */
				Set<Integer> num = new TreeSet<Integer>();
				for (int i = 0; i < data.length; i++) {
					num.add(data[i]);
				}
				//convert set to list
				List<Integer> arr = new ArrayList<Integer>(num);
				System.out.println(arr.get(arr.size()-2));
	}

}
