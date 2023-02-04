package week3.day2.Assigments;

import java.util.Arrays;


public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		String[] input = {"Google","Microsoft","TestLeaf","Maverick","Wipro","HCL","CTS","Aspire Systems"};
		int length = input.length;
	    Arrays.sort(input);
	    System.out.println(Arrays.toString(input));
	    for (int i = length-1; i >=0; i--) {
			System.out.println(input[i]);
		}
		

	}

}