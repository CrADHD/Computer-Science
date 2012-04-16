
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Roullete_Graphics {
public static int RoulNum=0;
public static Win MyWin; 

	public static void main(String[] args)throws Exception {

		MyWin = Win.init(); 
		
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
				int RandT=Rand(0) + 1;
				for(int i=0; i<RandT; i=i+1){
					Roullete_Graphics.RoulNum=Rand(0);
					timewait(Roullete_Graphics.RoulNum, RandT);
				}
				int wintype=evod(BetNum, Roullete_Graphics.RoulNum);
				money=money-cost;
				
				if(wintype==1){
					money=money+add1;
				}
				
				System.out.println("$"+money);
				
			}
			
			if(Qplay==2){

				System.out.println("type 1 for odds or 2 for evens");
				int BetNum= in.nextInt();
				int RandT=Rand(0) + 1;
				for(int i=0; i<RandT; i=i+1){
					Roullete_Graphics.RoulNum=Rand(0);
					timewait(Roullete_Graphics.RoulNum, RandT);
				}
				int wintype=evod(BetNum, Roullete_Graphics.RoulNum);
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
	
	public static int timewait(int num, int times){     // makes sys wait for 2 sec between nums
		
		try {
			Thread.sleep(2000);
			} catch(InterruptedException e) {} 
			
		lettertest(num);
		return num;
	}
			
	public static int lettertest(int num){     // print Rand number and sets FinalNum
		
		if(num==0){
			
			System.out.println(" _____ ");
			System.out.println("|  _  |");
			System.out.println("| | | |");
			System.out.println("| |_| |");
			System.out.println("|_____|");
			MyWin.FinalNum="0";
			MyWin.repaint();
		}
		
		if(num==1){

			System.out.println(" _ ");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("| |");
			System.out.println("|_|");
			MyWin.FinalNum="1";
			MyWin.repaint();
            
		}
		if(num==2){
			
			System.out.println(" _____ ");
			System.out.println("|___  |");
			System.out.println(" ___| |");
			System.out.println("| ____|");
			System.out.println("|_____|");
			MyWin.FinalNum="2";
			MyWin.repaint();
                                                                              
		}
		if(num==3){

			System.out.println(" _____  ");
			System.out.println("|___  | ");
			System.out.println("  |_  | ");
			System.out.println(" ___| | ");
			System.out.println("|_____| ");
			MyWin.FinalNum="3";
			MyWin.repaint();
            
		}
		if(num==4){

			System.out.println(" _   _   ");
			System.out.println("| | | |  ");
			System.out.println("| |_| |_ ");
			System.out.println("|___   _|");
			System.out.println("    |_|  ");
			MyWin.FinalNum="4";
			MyWin.repaint();
            
		}
		if(num==5){

			System.out.println("_____   ");
			System.out.println("| ___|  ");
			System.out.println("|___ |  ");
			System.out.println(" ___) | ");
			System.out.println("|____/  ");
			MyWin.FinalNum="5";
			MyWin.repaint();
            
		}
		if(num==6){

			System.out.println("  __   ");
			System.out.println(" / /   ");
			System.out.println("| |___ ");
			System.out.println("| ( ) |");
			System.out.println("|____/ ");
			MyWin.FinalNum="6";
			MyWin.repaint();
            
		}
		if(num==7){

			System.out.println(" _____ ");
			System.out.println("|___  |");
			System.out.println("   / / "); 
			System.out.println("  / /  ");
			System.out.println(" /_/   ");
			MyWin.FinalNum="7";
			MyWin.repaint();
            
		}
		if(num==8){
			
			System.out.println("  _______ ");
			System.out.println(" |  ___  |");
			System.out.println(" | |___| |");
			System.out.println(" |  ___  |");
			System.out.println(" | |___| |");
			System.out.println(" |_______|");
			MyWin.FinalNum="8";
			MyWin.repaint();
            
		}
		if(num==9){

			System.out.println("  ______ ");
			System.out.println(" |  __  |");
			System.out.println(" | |__| |");
			System.out.println(" |____  |");
			System.out.println("     |  |");
			System.out.println("     |__|");
			MyWin.FinalNum="9";
			MyWin.repaint();
            
		}
		if(num==10){

			System.out.println(" _   ___");
			System.out.println("| | | _ |");
			System.out.println("| | || ||");
			System.out.println("| | ||_||");
			System.out.println("|_| |___|");
			MyWin.FinalNum="10";
			MyWin.repaint();
            
		}
		if(num==11){
			
			System.out.println(" _   _");
			System.out.println("| | | |");
			System.out.println("| | | |");
			System.out.println("| | | |");
			System.out.println("|_| |_|");
			MyWin.FinalNum="11";
			MyWin.repaint();
		}
		
		int letteruse = 0;
		return letteruse;}
}

class Win extends JFrame
{
	public String FinalNum= ("");
   public static Win init() throws Exception    // Creates canvas
   {
       //create canvas object
       Win mycanvas = new Win();
       
       //set size of canvas
       mycanvas.setSize(1300,500);
       
       //show canvas
       mycanvas.setVisible(true); 
       
       return mycanvas;
   }
   Color bkgd = Color.GREEN;
   Font num = new Font("Serif", Font.PLAIN, 128);
   public void paint(Graphics g){             //Paints on canvas
	   
	   g.setColor(bkgd);
	   g.fillRect(0, 0, 1300, 500);
	   g.setColor(Color.black);
	   g.setFont(num);
	   
	   g.drawString(FinalNum, 600, 250);
	   
   }
}