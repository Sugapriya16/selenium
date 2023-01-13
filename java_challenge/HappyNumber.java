package java_challenge;

public class HappyNumber {

	public static void main(String[] args) {
		int given = 134;
		int number = given;
		int sum =0;
		do  {
			sum =0;
		while(number != 0){  
	          int  rem = number%10;  
	            sum = sum + (rem*rem);  
	            number = number/10;  
	           } 
			number=sum;
		}while(sum >6); 
	
		 
		 if (sum == 1) {
	            System.out.println(given + " is a Happy Number");
	        }
	        else {
	            System.out.println(given + " is not a Happy Number");

	}

}
}
