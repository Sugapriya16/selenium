package week3.day1;


public class AxisBank extends BankInfo {
//	Assignment 4
//	==============
//
//	      Class: Students
//	      Methods: getStudentInfo()
//
//	Description: 
//	Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	
	@Override
	public void deposit() {
		System.out.println("Deposit Method in Axis Bank");
	}

	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
		

	}

}
