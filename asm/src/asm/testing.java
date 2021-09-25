package asm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testing {
	
	customer faiez;
	checking a;
	savings b;
	
	@Before
	public void setup() {
		faiez=new customer(1,"faiez","ICT","2255089");
		a=new checking(faiez);
		b=new savings(faiez);
	}
	
	@Test
	public void test01() {//checking deposit
		System.out.print("Test 1: ");
		a.makedeposit(50000);
		assertEquals(50000,a.balance);
	}
	
	@Test
	public void test02() {//checking withdrawal
		System.out.print("Test 2: ");
		a.balance=50000;
		a.makewithdrawal(10000);
		assertEquals(40000,a.balance);
	}
	@Test
	public void test03() {//checking deposit of savings
		System.out.print("Test 3: ");
		b.makedeposit(40000);
		assertEquals(40000,b.balance);
	}
	@Test
	public void test04() {//checking withdrawal of savings
		System.out.print("Test 4: ");
		b.balance=40000;
		b.makewithdrawal(10000);
		assertEquals(30000,b.balance);
	}
	@Test
	public void test05() {//checking savings interest
		System.out.print("Test 5: ");
		b.setInterest(0.045);
		double c=b.getInterest();
		assertEquals(0.045,c,0);
		System.out.println("Checking interets rate ");
	}
	@Test
	public void test06() {//checking savings Interest
		System.out.print("Test 6: ");
		b.setInterest(0.05);
		b.balance=50000;
		assertEquals(2500.0,b.calculateInterest(),0);
	}
	@Test
	public void test07() {//checking savings Zakat
		System.out.print("Test 7: ");
		b.balance=50000;
		b.calculateZakat();
		assertEquals(48750,b.balance);
	}
	
	//Negative Test cases
	@Test
	public void test08() {//checking savings Zakat
		System.out.print("Test 8: ");
		b.balance=10000;
		b.calculateZakat();
		assertEquals(10000,b.balance);
	}
	
	@Test
	public void test09() {//checking transaction deductions
		System.out.println("Test 9: ");
		a.makedeposit(5000);
		a.makedeposit(5000);
		a.makedeposit(5000);
		assertEquals(14990,a.balance);
	}
	@Test
	public void test10() {
		System.out.println("Test10: ");
		a.balance=50000;
		a.makewithdrawal(5000);
		a.makewithdrawal(5000);
		a.makewithdrawal(5000);
		assertEquals(34990,a.balance);
	}
	@Test
	public void test11() {//withdrawing greater amount from savings
		System.out.print("Test11: ");
		a.balance=10000;
		a.makewithdrawal(15000);
		assertEquals(10000,a.balance);
		System.out.println("Balance not deducted");
	}
	
	@Test
	public void test12() {//withdrawing greater amount from checkings
		System.out.print("Test12: ");
		b.balance=10000;
		b.makewithdrawal(15000);
		assertEquals(10000,b.balance);
		System.out.println("Balance not deducted");
	}
}
