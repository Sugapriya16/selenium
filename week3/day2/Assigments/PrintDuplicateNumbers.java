package week3.day2.Assigments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */
		Set<Integer> result = new HashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			 boolean duplicate =  result.add(data[i]);
			  if (duplicate==false){
				System.out.println(data[i]);
			}
		}
	
	}

}
