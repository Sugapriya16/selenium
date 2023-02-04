package week3.day2.Assigments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] data = {1,2,10,4,6,7,9,2,8,3,6,7};
		Set<Integer> num = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
		}System.out.println(num);
		/*iteration of set
		for (Integer number : num) {
			System.out.println(number);
		}*/
		//converting set to array
		 // Creating the array and using toArray()
		Integer[] arr = num.toArray(new Integer[0]);
       // Object[] arr = num.toArray();
        for (int i = 1; i < arr.length; i++) {
           if (arr[i]!=(arr[i-1]+1)) {
				System.out.println("Missing Number :"+(arr[i-1]+1));
			}
		}
	}

}
