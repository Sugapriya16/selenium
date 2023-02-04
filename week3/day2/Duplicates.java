package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		String name ="google";
		char[] charArray = name.toCharArray();
		Set<Character> noduplicates = new LinkedHashSet<Character>();
	    Set<Character> duplicates = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = noduplicates.add(charArray[i]);
			if(add) {
				 System.out.print(charArray[i]);
			}else duplicates.add(charArray[i]);//to get duplicate list
			
		} 

	}

}
