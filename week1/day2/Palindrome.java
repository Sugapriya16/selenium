package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String word = "Madam";
		String rev ="";
		for (int i = word.length()-1; i >=0; i--) {
			//charAt(index)--string method to get char value 
			 rev = rev + word.charAt(i);
		}
		// to compare string use equals and without case sensitive use equalsIgnoreCase
			if(rev.equalsIgnoreCase(word)) {
				System.out.println(word +" is a palindrome word");
			}else System.out.println(word +" is not a palindrome word");
			
		}

	}


