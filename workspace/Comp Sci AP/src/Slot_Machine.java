
import java.util.*;

/**
 * @author bioboy28
 *
 */
public class Slot_Machine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double money=20.00;
		double cost=0.25;
		double add1=0.50;       // Variables
		double add2=3.00;
		double add3=10.00;
		int spins=0;
		System.out.println("You start with $20.00 and each game costs $0.25");
		System.out.println("A 2 of a kind wins $0.50  A 3 of a kind wins $3.00 A 777 wins $10.00");
		
		while(1<2){        //loop
			
			Scanner in = new Scanner(System.in);
			System.out.println("Would you like to play a game? If so type any key but 0");    // I can't let you do that
			System.out.println("To exit the game type '0' and your score will be displayed");
			int Qplay= in.nextInt();
			
			if(Qplay!=0){

				spins=spins+1;
				money=money-cost;
				int slotnum1 = Slots(1);
				int slotnum2 = Slots(1);    // rand nums
				int slotnum3 = Slots(1);
				System.out.println(slotnum1 +""+ slotnum2 +""+ slotnum3);
				int wintype=numtest(slotnum1, slotnum2, slotnum3);
				
				if(wintype==1){
					money=money+add1;
				}
				if(wintype==2){             // + money
					money=money+add2;
				}
				if(wintype==3){
					money=money+add3;
				}
				
				System.out.println(money);
				
			}
			
			if(Qplay==0){
				
				break;
				
			}
			
		}
		
		System.out.println("After " + spins + " spins you have " + money + " money");
		
	}
	
	public static int Slots(int n1){      // rand num generator

		double num = Math.random();
		num = num * 10;		
		int numrand = (int) num;
			
		return numrand;
		
	}
	
	public static int numtest(int num1, int num2, int num3){   // which +money use?
		
		int wintype=0;
		
		if(num1==num2){
			if(num1!=num3){
				wintype=1;
			}
		}
		
		if(num2==num3){
			if(num1!=num2){
				wintype=1;
			}
		}
		
		if(num1==num3){
			if(num1!=num2){
				wintype=1;
			}
		}
		
		if(num1==num2){
			if(num2==num3){
				if(num1!=7){
					wintype=2;
				}
				if(num1==7){
					wintype=3;
				}
			}
		}
		
		return wintype;
		
	}

}
