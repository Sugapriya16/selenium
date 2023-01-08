package week1.day1;

import java.util.Iterator;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secNum =1;
		System.out.println (firstNum);
		System.out.println (secNum);
		
		for (int i = 0; i <11; i++) {
			
			int sum = firstNum + secNum;
			System.out.println (sum);
			firstNum = secNum;
			secNum = sum;
					}

	}

}
