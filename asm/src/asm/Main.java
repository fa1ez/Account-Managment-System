package asm;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		checking check[] = new checking[50];
		savings save[] = new savings[50];
		int input;
		do {
			System.out.println("Type 1 to Open a new account");
			System.out.println("Type 2 to Close an account");
			System.out.println("Type 3 to Perform an account operation");
			System.out.println("Type 4 to Specify interest rate");
			System.out.println("Type 5 to Display all account details");
			System.out.println("Type 0 to exit");
			System.out.print("Choice: ");
			input = myObj.nextInt(); // Read user input
			int acc=0;
			switch (input) {
			case 1:
				System.out.println("Enter details of customer");
				System.out.print("Name: ");
				String nam = myObj.nextLine();
				System.out.print("Address: ");
				String add = myObj.nextLine();
				System.out.print("Phone number: ");
				String ph = myObj.nextLine();
				System.out.println("Account type\n1.Checking \n2.Savings");
				int type = myObj.nextInt();
				if(type==1) {
					for (int i = 0; i < 50; i++) {
						if (check[i] == null) {
							customer faiez=new customer(i,nam, add, ph);
							check[i] = new checking(faiez);
							break;
						}
					}
				}
				else {
					for (int i = 0; i < 50; i++) {
						if (save[i] == null) {
							customer faiez=new customer(i,nam, add, ph);
							save[i] = new savings(faiez);
							break;
						}
					}
				}
				System.out.println("Account created");
				break;
			case 2:
				boolean a=true;
				System.out.println("Enter account number to be closed");
				acc = myObj.nextInt();
				for(int i=0;i<50;i++) {
					if(check[i].c.ID==acc) {
						check[i]=null;
						a=false;
						break;
					}
					if(save[i].c.ID==acc) {
						save[i]=null;
						a=false;
						break;
					}
				}
				System.out.println("Account closed");
				if(a)
					System.out.println("Account not found");
				break;
			case 3:
				System.out.println("Type 1 for savings\nType 2 for checking");
				int choice = myObj.nextInt();
				if(choice==1){
					System.out.println("Enter account number to make operation");
					acc = myObj.nextInt();
					for (int i = 0; i < 50; i++) {
						if (save[i] != null) {
							if (save[i].c.ID == acc) {
								System.out.println("Choose one of the following options by entering ");
								System.out.println("1.Make deposit");
								System.out.println("2.Make withdrawal");
								System.out.println("3.Check balance");
								System.out.println("4.print statement");
								System.out.println("5.Transfer amount");
								System.out.println("6.Calculate Zakat");
								int input2 = myObj.nextInt(); // Read user input
								int amount = 0;
								switch (input2) {
								case 1:
									System.out.println("Enter amount to be deposited");
									amount = myObj.nextInt(); // Read amount
									save[i].makedeposit(amount);
									break;
								case 2:
									System.out.println("Enter amount to be withdrwan");
									amount = myObj.nextInt(); // Read amount
									save[i].makedeposit(amount);
									break;
								case 3:
									save[i].checkbalance();
									break;
								case 4:
									save[i].printstatement();
									break;
								case 5:
									System.out.println("Enter amount to be transeferred");
									amount = myObj.nextInt(); // Read amount
									System.out.println("Enter account number to be transeferred to");
									acc = myObj.nextInt();
									for(int j=0;j<50;j++) {
										if(save[j]!=null) {
											if(save[j].c.ID==acc) {
												save[j].balance += amount;
												break;
											}
										}
									}
									save[i].makewithdrawal(amount);
									System.out.println("Amount transferred");
									break;
								case 6:
									save[i].calculateZakat();
								}
								break;
							}
						}
					}
				}
				//for checking
				if(choice==2){
					System.out.println("Enter account number to make operation");
					acc = myObj.nextInt();
					for (int i = 0; i < 50; i++) {
						if (check[i] != null) {
							if (check[i].c.ID == acc) {
								System.out.println("Choose one of the following options by entering ");
								System.out.println("1.Make deposit");
								System.out.println("2.Make withdrawal");
								System.out.println("3.Check balance");
								System.out.println("4.print statement");
								System.out.println("5.Transfer amount");
								int input2 = myObj.nextInt(); // Read user input
								int amount = 0;
								switch (input2) {
								case 1:
									System.out.println("Enter amount to be deposited");
									amount = myObj.nextInt(); // Read amount
									check[i].makedeposit(amount);
									break;
								case 2:
									System.out.println("Enter amount to be withdrwan");
									amount = myObj.nextInt(); // Read amount
									check[i].makedeposit(amount);
									break;
								case 3:
									check[i].checkbalance();
									break;
								case 4:
									check[i].printstatement();
									break;
								case 5:
									System.out.println("Enter amount to be transeferred");
									amount = myObj.nextInt(); // Read amount
									System.out.println("Enter account number to be transeferred to");
									acc = myObj.nextInt();
									for(int j=0;j<50;j++) {
										if(check[j]!=null)
										if(check[j].c.ID==acc) {
											check[j].balance += amount;
											break;
										}
									}
									check[i].makewithdrawal(amount);
									System.out.println("Amount transferred");
									break;
								}
								break;
							}
						}
					}
				}
				
				break;
			case 4:
				System.out.println("Enter Interest rate %");
				double rate=myObj.nextDouble();
				for(int j=0;j<50;j++) {
					save[j].setInterest(rate);
				}
				System.out.println("Interest rate changed");
				break;
			case 5:
				for (int i = 0; i < 50; i++) {
					if (save[i] != null) {
						save[i].printstatement();
					}
					if(check[i]!=null)
						check[i].printstatement();
				}
				break;
			}
		}while(input!=0);
	}
}
