

import java.util.Scanner;

public class BankArray {
	private static double[] YoMonays= {100.50,100.50,100.50,100.50,100.50};
	private static int[] pins= new int[5];
	public static void main(String[] args) { // have array 0-4 = pins
	
		Scanner in = new Scanner(System.in);
		
		
		//set each cell ta contain pin #
		   pins[0] = 1212;
	       pins[1] = 2323;
	       pins[2] = 3434;
	       pins[3] = 4545;
	       pins[4] = 5656;
	       System.out.println("GIMME YO PIN.");
	       System.out.println("AND TYPE IT RITE: ");
	       //search for num
	      int numtry = 0;
	       while(numtry<3){
	       
	       int num = in.nextInt();
	    
	       //change flag ta 1 if num exists
	       int flag = -1;
	   
	       //loops through array ta search
			for(int i=0; i < pins.length; i= i+1)
			{
				//if array at i be equal ta da numba
				if( pins[i] == num )
				{
					//set flag ta 1 if found
					flag = i;
				}
			}
			
			if(flag>=0 && flag<5){
				YoMonays[flag]=bank(YoMonays[flag]);
			}
			if(flag<0 && flag>=5){
				
			System.out.println("WRONG PIN DAWG.");
			numtry = numtry + 1;
			
			}
	    }
	       System.out.println("GAME OVER..... DAWG");
	}
	
public static double bank(double YoMonay){	
		Scanner in = new Scanner(System.in);
		int chc;
		//double YoMonay = 10.06;
		boolean quit = false;
		do { 
			System.out.println("1. Check Yo Monay");
			System.out.println("2. Withdraw Yo Money");      // options
			System.out.println("3. Deposit Yo Money");
			System.out.println("Yo choice, 0 ta exit: ");
			chc = in.nextInt();
			switch (chc) {   // bunch o cases!
				case 1:
					System.out.println("YoMonay be: "+ YoMonay);
					;
					break;
				case 2:
					System.out.println("Enta amount ta withdraw: ");
					YoMonay = withdraw(YoMonay);
					;
					break;
		
				case 3:
					System.out.println("Enta amount ta deposit: ");
					YoMonay = deposit(YoMonay);
					break;
				case 0: 
					quit = true;
					break;
			default:
				System.out.println("Processin Input...");
				for (int i=0; i>-4; i++)
					System.out.println("Attemptin number: " + i);
				break;
			}
			System.out.println();
		} while (!quit);
		System.out.println("Terminating...");
		return YoMonay;
	}
	public static double withdraw(double YoMonay){   // withdraw process
		Scanner in = new Scanner(System.in);
		double out;
		out = in.nextDouble();
		if(out<=YoMonay)
		 YoMonay = YoMonay - out;
		else
		 System.out.println("You Are TOO POOR YA HOBO");
		return YoMonay;
		
	}
	public static double deposit(double YoMonay){      // deposit process
		Scanner in = new Scanner(System.in);
		double cash;
		cash = in.nextDouble();
		System.out.println("Did ya eva wonda whea all da monays come from?");
		YoMonay = YoMonay + cash;
		return YoMonay;
	}
	
}
	
		


	
