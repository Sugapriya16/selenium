package week3.day2.Assigments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		//Find the most duplicate number -> First most duplicate
		/*
		* input: abbaba
		* output: b
		*/

		/*
		 * Psuedocode
		 * 
		 * a) Map -> HashMap 
		 * b) String -> ch[] -> Get all the character -> occurance
		 * c) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		String s = "abbaba";
		char maxOccurance = s.charAt(0);
		int maxValue = 0;
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
//			if(occ.containsKey(charArray[i])) {
//				int existingCount = occ.get(charArray[i]);
//				occ.put(charArray[i], existingCount+1);
//			}else occ.put(charArray[i], 1);
			/*next line used instead of this above if loop
			The Java HashMap getOrDefault() method returns the 
			specified default value if the mapping for the specified key is not found in the hashmap.
			*/
			occ.put(charArray[i], occ.getOrDefault(charArray[i], 0)+1);
			if(occ.get(charArray[i]) > maxValue) {
				maxOccurance = charArray[i];
				maxValue = occ.get(charArray[i]);
			}
		} 
		System.out.println(maxOccurance);   
	}
}