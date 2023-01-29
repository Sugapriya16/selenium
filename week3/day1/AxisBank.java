package week3.day1;


public class AxisBank extends BankInfo {
	
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
