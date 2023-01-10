package java_challenge;

public class SquareRoot {

	public static void main(String[] args) {
		
		int value = 111;
		double temp;
		double squrt=value/2;
		
		do { 
			temp=squrt;
			squrt = (temp+(value/temp))/2;
			}
		while((temp-squrt)!=0);
		// double was converted into int
		System.out.println((int)squrt);

	}

}
