package asm;

public class accounts{
	customer c; 
	int balance;
	String date;
	int transactions=0;
	
	
	public void checkbalance() {
		System.out.println("Name: " + c.name + "\nBalance: Rs." + balance);
	}
	public void printstatement() {
		System.out.println("Statement\nName: " + c.name + "\nAccount number: " + c.ID);
		System.out.println("Remaining balance " + balance + "\nTotal transactions: "+ transactions +"\nAccout created on " + date);
	}
	public void makedeposit(int value) {
		balance=balance+value;
		transactions++;
		System.out.println("Deposit of Rs. "+ value + " successful");
	}
	public void makewithdrawal(int value) {
		balance=balance-value;
		transactions++;
		System.out.println("Withdrawal of Rs. "+ value + " successful");
	}
	
}
