package week3.day2.Assigments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String input ="babu";
		char[] ch=input.toCharArray(); 
		Set<Character> output = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			boolean result = output.add(ch[i]);
			if (result==false) {
				output.remove(ch[i]);
			}
		}System.out.println(output);

	}

}
