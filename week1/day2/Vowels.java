package week1.day2;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="apple";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a'
					|| name.charAt(i) == 'e'
					|| name.charAt(i) == 'i'
					|| name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				System.out.println("Vowel: " + name.charAt(i));
			}

	}

	}
}
