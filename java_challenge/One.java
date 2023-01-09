package java_challenge;

public class One {

	public static void main(String[] args) {
		String sentence = "  fly me to the moon ";
		sentence = sentence.trim();
		// without split
		int count =0;
		for (int i =  sentence.length()-1; i >=0; i--) {
			
			if(sentence.charAt(i) == ' ') {
				break;
				}
			count ++;
			}
		System.out.println("Length of last word:" + count);
		// with split
		String[] split = sentence.split(" ");
		int length = split.length;
		System.out.println("length of last word:"+split[length-1].length());
	
		
	}
	

}
