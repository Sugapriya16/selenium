package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	//list is ordered collection
	//dynamic in nature
	//list is interface
	//allow duplicate values
	//syntax : List<String> mentors = new ArrayList<String>()
	//String---wraps class

	public static void main(String[] args) {
		List<String> mentors = new ArrayList<String>();
		
		mentors.add("Suga");
		mentors.add("priya");
		mentors.add("Ram");
		mentors.add("Ram");
		System.out.println(mentors.size());
		System.out.println(mentors.get(1));
		System.out.println(mentors);
		mentors.remove(2);
		System.out.println(mentors);
		System.out.println(mentors.contains("haja"));
		//convert list to array
		Object[] array = mentors.toArray();//object is superclass
		//to sort any collections
		Collections.sort(mentors);
		System.out.println(mentors);

	}

}
