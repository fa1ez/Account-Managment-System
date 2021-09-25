package asm;

public class savings extends accounts {
	private double rate;
	
	public savings(customer a) {
		c=a;
	}
	void setInterest(double a) {
		rate=a;
	}
	double getInterest() {
		return rate;
	}
	public double calculateInterest() {
		double interest=balance*rate;
		System.out.println("Interets is "+interest);
		return interest;
	}
	
	public void calculateZakat() {
		double zakat;
		if(balance>=20000) {
			zakat=(balance*2.5)/100;
			System.out.println("Payable Zakat is Rs. "+ zakat);
			balance=(int) (balance - zakat);
		}
		else {
			System.out.println("Zakat is not applicable on amounts less than 20000");
		}
	}
}
