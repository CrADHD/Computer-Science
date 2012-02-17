

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int chc;
		double balance;     // vars
		balance = 10.06;
		boolean quit = false;
		do { 
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw Money");      // options
			System.out.println("3. Deposit Money");
			System.out.println("your choice, 0 to quit: ");
			chc = in.nextInt();
			switch (chc) {   // bunch o cases!
				case 1:
					System.out.println("Balance is: "+ balance);
					;
					break;
				case 2:
					System.out.println("Enter amount to withdraw: ");
					balance = withdraw(balance);
					;
					break;
		
				case 3:
					System.out.println("Enter amount to deposit: ");
					balance = deposit(balance);
					break;
				case 0: 
					quit = true;
					break;
			default:
				System.out.println("Processing Input...");
				for (int i=0; i>-4; i++)
					System.out.println("attempt number: " + i);
				break;
			}
			System.out.println();
		} while (!quit);
		System.out.println("Terminating...");
	}
	public static double withdraw(double balance){   // withdraw procces
		Scanner in = new Scanner(System.in);
		double out;
		out = in.nextDouble();
		balance = balance - out;
		return balance;
		
	}
	public static double deposit(double balance){      // deposit procces
		Scanner in = new Scanner(System.in);
		double cash;
		cash = in.nextDouble();
		balance = balance + cash;
		return balance;
	}
	
}
	
		


	
