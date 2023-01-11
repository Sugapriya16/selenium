package java_challenge;

public class Palindrome {

	public static void main(String[] args) {
		String sentence = " race a car  ";
		//removing all non alpha character using replace and changing to lower case
		String replaceAll = sentence.replaceAll("[^a-zA-Z]","").toLowerCase();
		System.out.println(replaceAll);
		//getting length of sentence
		int lenOfWord = replaceAll.length();
		//checking the length should be odd number
		//if length is even
		if(lenOfWord%2 ==0){ 
			System.out.println("False");}
		//if empty string
		else if (lenOfWord == 0) {
			System.out.println("True");}
		//Not a empty string and length should be odd
		else {
			//StringBulider is used to append char
			StringBuilder firstHalf = new StringBuilder();
			StringBuilder secondHalf = new StringBuilder();
			//getting 1st half word
				for (int i = 0; i < lenOfWord/2; i++) {				
				    firstHalf.append(replaceAll.charAt(i));  
				}
				//converting StringBulider type to string
				String fh = firstHalf.toString();
				System.out.println(fh);
			//getting 2nd half word and eliminating middle word		
				for (int j = (lenOfWord -1); j > (lenOfWord/2) ; j--) {
					secondHalf.append(replaceAll.charAt(j));
					}
				 String sh = secondHalf.toString();
				System.out.println(sh);
			//checking 1st and 2nd half are equal string	
				if(fh.equals(sh)) {
					System.out.println("True");}
				else {System.out.println("False");}
				}
		       				
			}
		}

	

