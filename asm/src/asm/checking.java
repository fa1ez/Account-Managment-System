package asm;

public class checking extends accounts{
	int record_of_trans=2;
	
	public checking(customer a) {
		c=a;
	}
	public void makedeposit(int value) {
		if(record_of_trans==0) {
			balance=balance-10;
			System.out.println("Transaction fee deducted");
		}
		else
			record_of_trans--;
		balance=balance+value;
		transactions++;
		System.out.println("Deposit of Rs. "+ value + " successful");
	}
	public void makewithdrawal(int value) {
		if(value<balance) {
			if(record_of_trans==0) {
				balance=balance-10;
				System.out.println("Transaction fee deducted");
			}
			else
				record_of_trans--;
			balance=balance-value;
			transactions++;
			System.out.println("Withdrawal of Rs. "+ value + " successful");
		}
	}
	
}
