package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Learnset {
	//not allow duplicates
	//for sort order according to ASCII value is TreeSet
	//for sort order according to insert values is LinkedHashSet faster than Hashset

	public static void main(String[] args) {
		Set<String> companies = new HashSet<String>();
		companies.add("wipro");
		companies.add("TCS");
		companies.add("zoho");
		boolean add = companies.add("TCS");
		System.out.println(companies);
		System.out.println(add);//not adding element in set so return false 
		//set to list
		List<String> list =  new ArrayList<String>(companies);
	}

}
