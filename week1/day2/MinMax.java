package week1.day2;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample = {5,9,44,61,789,34,67,2,89,3};
		Arrays.sort(sample);
		for (int i = 0; i < sample.length; i++) {
			System.out.print(sample[i]+" ");
		}
		System.out.println("\nMin value is :" +sample[0]);
		System.out.println("Max Value is :"+sample[sample.length-1]);
	}

}
