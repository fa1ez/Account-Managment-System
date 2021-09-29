package moiz;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated= new java.util.Date();
	}
	public Account(int i,double b) {
		id=i;
		balance=b;
		dateCreated= new java.util.Date();
	}
	public int getid() {
		return id;
	}
	public void setid(int a) {
		id=a;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double a) {
		balance=a;
	}
	public double getannualInterestRate() {
		return this.annualInterestRate;
	}
	public void setannualInterestRate(double a) {
		this.annualInterestRate=a;
	}
	public double getmonthlyinterest() {
		return (balance*this.annualInterestRate)/12;
	}
	public Date getdate() {
		return this.dateCreated;
	}
	public void withdraw(int amount) {
		if(balance > amount)
			balance -= amount;
		else
			System.out.println("Withdraw greater than balance");
	}
	public void deposit(int amount) {
		balance += amount;
	}
}