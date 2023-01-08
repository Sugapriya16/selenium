package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = scanner.nextInt();
		if ((no==1)||(no==2)) {
			System.out.println("Prime");
		}
		else {
			boolean prime = true;
			for (int i = 2; i < (no); i++) {
			if((no % i) == 0) {
				System.out.println("Not Prime");
				prime = false;
				break;
				}
			}
		if (prime == true)
			System.out.println("Prime");
	}

	}
}
