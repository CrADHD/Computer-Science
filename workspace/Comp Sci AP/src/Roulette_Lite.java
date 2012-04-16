
import java.util.*;

/**
 * @author bioboy28
 *
 */
public class Roulette_Lite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double money=10.00;
		double cost=1.00;
		double add1=11.00;       // Variables
		double add2=2.00;
		
		System.out.println("You start with $10.00 and each game costs $1");
		System.out.println("The payout for a single number bet is $11 while the payout for even or odd is $2");
		
		while(1<2){        //loop
			
			Scanner in = new Scanner(System.in);
			System.out.println("Would you like to play a game? If so type any number but 0");    // I can't let you do that Dave
			System.out.println("Type 1 to bet on a number, 2 to bet on odds or evens");
			System.out.println("Type any other number to exit");
			int Qplay= in.nextInt();
			
			if(Qplay==1){

				System.out.println("type the number you want to bet on");
				int BetNum= in.nextInt();
				int RoulNum=Rand(0);
				int RandT=Rand(0);
				int wintype=Anum(BetNum, RoulNum);
				lettertest(RoulNum, RandT);
				money=money-cost;
				
				if(wintype==1){
					money=money+add1;
				}
				
				System.out.println("$"+money);
				
			}
			
			if(Qplay==2){

				System.out.println("type 1 for odds or 2 for evens");
				int BetNum= in.nextInt();
				int RoulNum=Rand(0);
				int RandT=Rand(0);
				int wintype=evod(BetNum, RoulNum);
				lettertest(RoulNum, RandT);
				money=money-cost;  
				
				if(wintype==2){
					money=money+add2;
				}
				
				System.out.println("$"+money);
				
			}
			
			if(Qplay!=1 && Qplay!= 2){

				System.out.println(money);
				break;
				
			}
			
		}
		
		
	}
	
	public static int Rand(int n1){      // rand num generator

		double num = Math.random();
		double upone = Math.random();
		num = num * 10;	
		upone= upone*10;
		if(upone<1){
		 num = 10;
		}	
		int numrand = (int) num;
			
		return numrand;
		
	}
	
	public static int Anum(int num1, int num2){   // which +money use?
		
		int wintype=0;
		
		
		if(num1==num2){
			wintype=1;
		}
		
		return wintype;
		
	}
	
	public static int evod(int num1, int num2){   // which +money use?
		
		int wintype=0;
		
		
		if(num1%2==0 && num2%2==0){
			wintype=2;
		}
		
		if(num1%2==1 && num2%2==1){
			wintype=2;
		}
		
		return wintype;
		
	}
	
	public static int timewait(int times){     // print Rand number
		
		for(int i=0; i<times; i=i+1){
		try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {} 
		}
		return times;
	}
			
	public static int lettertest(int num, int time){     // print Rand number
		
		int time2 = time * 1000;
		try {
			Thread.sleep(time2);
			} catch(InterruptedException e) {
			} 
		if(num==0){
			
			System.out.println(" _____ ");
			System.out.println("|  _  |");
			System.out.println("| | | |");
			System.out.println("| |_| |");
			System.out.println("|_____|");
		}
		
		if(num==1){

			System.out.println(" _");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("|_|");
            
		}
		if(num==2){
			
			System.out.println(" _____ ");
			System.out.println("|___  | ");
			System.out.println(" ___| |");
			System.out.println("| ____| ");
			System.out.println("|_____|");
                                                                              
		}
		if(num==3){

			System.out.println(" _____");
			System.out.println("|___  |");
			System.out.println("  |_  | ");
			System.out.println(" ___| |");
			System.out.println("|_____|");
            
		}
		if(num==4){

			System.out.println(" _   _");
			System.out.println("| | | |");
			System.out.println("| |_| |_");
			System.out.println("|___   _|");
			System.out.println("    |_|");
            
		}
		if(num==5){

			System.out.println("_____");
			System.out.println("| ___| ");
			System.out.println("|___ | ");
			System.out.println(" ___) |");
			System.out.println("|____/ ");
            
		}
		if(num==6){

			System.out.println("  __   ");
			System.out.println(" / /   ");
			System.out.println("| |___");
			System.out.println("| ( ) |");
			System.out.println("|____/ ");
            
		}
		if(num==7){

			System.out.println(" _____ ");
			System.out.println("|___  |");
			System.out.println("   / / "); 
			System.out.println("  / / ");
			System.out.println(" /_/   ");
            
		}
		if(num==8){
			
			System.out.println("  ________ ");
			System.out.println(" |  ____  |");
			System.out.println(" | |____| |");
			System.out.println(" |  ____  |");
			System.out.println(" | |____| | ");
			System.out.println(" |________|  ");
            
		}
		if(num==9){

			System.out.println("  _______");
			System.out.println(" |  ___  |");
			System.out.println(" | |___| |");
			System.out.println(" |_____  |");
			System.out.println("      |  |");
			System.out.println("      |__|");
            
		}
		if(num==10){

			System.out.println(" _   ___");
			System.out.println("| | | _ |");
			System.out.println("| | || ||");
			System.out.println("| | ||_||");
			System.out.println("|_| |___|");
            
		}
		if(num==11){
			
			System.out.println(" _   _");
			System.out.println("| | | |");
			System.out.println("| | | |");
			System.out.println("| | | |");
			System.out.println("|_| |_|");
		}
		
		int letteruse = 0;
		return letteruse;
		
	}

}
