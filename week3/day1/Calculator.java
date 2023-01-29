package week3.day1;

public class Calculator {
	
	public void add (int a, int b) {
		System.out.println(a+b);
		
	}
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	public void multiply (double a, double b) {
		System.out.println(a*b);
		
	}
	public void multiply (double a, int b) {
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		Calculator input = new Calculator();
		input.add(2,4);
		input.add(2, 4, 6);
		input.multiply(2.987, 4.7);
		input.multiply(2.0987, 4);	

	}

}
