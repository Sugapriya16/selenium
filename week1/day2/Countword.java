package week1.day2;

public class Countword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence ="a set of words that is complete in itself, ";
		System.out.println(sentence.length());
		System.out.println(sentence.charAt(3));
		//split method
		String[] split = sentence.split(" ");
		//no 0f words
		System.out.println("No of words:"+split.length);
		//no of char without space
		int count =0;
		for (int i = 0; i < sentence.length(); i++) {
			
			if(sentence.charAt(i) == ' ') {
				continue;
				}
			else {
					count ++;
				}
			}
		System.out.println("No of letters:" + count);
			}
			
		}
		

	


