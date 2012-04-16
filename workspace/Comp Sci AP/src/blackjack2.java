
import java.util.*;
import java.awt.*;
import javax.swing.*;

class cardnew1{
	
	//declare variables
	public int value;
	public String name;
	public String suit;
	public Font Timesfont;
	public boolean discard;
	public String title = "Blackjack";
	
	
	
	//constructor
	public cardnew1(int value, String name, String suit, boolean discard)
	{
		//define variables
		this.value = value;
		this.name = name;
		this.Timesfont = new Font("Times New Roman", Font.PLAIN,  18);
		
	}
	
	//draw card
	public void drawCard(Graphics g, int posx, int posy, int x)
	{	
		//set font
		g.setFont(Timesfont);
		
		g.drawString(title,175 , 10);
		
		//draw top line
		g.drawString(Integer.toString(x), posx+10, posy+20);
		g.drawRect(posx, posy, posx+100, posy+200);
		//draw card
		g.drawString(Integer.toString(value), posx+40, posy+80);
		g.drawString(name, posx+40, posy+120);	
	}
		
}
public class blackjack2 {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, 1300, 500);
		window.setVisible(true);
		int select;
		int x; 
		int money = 100;
		int d;
		System.out.println("Would you like to play a game of blackjack? Type 1 for yes, 2 for no");
		select=in.nextInt();
		while(1<2){
			
				if(select == 1){
					//create array of objects
					//card[] =  name of the class
					//deck = name of the object 
					//new card[52] = size of the array is 52
					cardnew1[] deck = new cardnew1[52];
					//init each object in the array
					deck[0] = new cardnew1(1,"Ace","diamonds", false);
					deck[1] = new cardnew1(2,"Two","diamonds", false);
					deck[2] = new cardnew1(3,"Three","diamonds", false);
					deck[3] = new cardnew1(4,"Four","diamonds", false);
					deck[4] = new cardnew1(5,"Five","diamonds", false);
					deck[5] = new cardnew1(6,"Six","diamonds", false);
					deck[6] = new cardnew1(7,"Seven","diamonds", false);
					deck[7] = new cardnew1(8,"Eight","diamonds", false);
					deck[8] = new cardnew1(9,"Nine","diamonds", false);
					deck[9] = new cardnew1(10,"Ten","diamonds", false);
					deck[10] = new cardnew1(10,"Jack","diamonds", false);
					deck[11] = new cardnew1(10,"Queen","diamonds", false);
					deck[12] = new cardnew1(10,"King","diamonds", false);
					deck[13] = new cardnew1(1,"Ace","spades", false);
					deck[14] = new cardnew1(2,"Two","spades", false);
					deck[15] = new cardnew1(3,"Three","spades", false);
					deck[16] = new cardnew1(4,"Four","spades", false);
					deck[17] = new cardnew1(5,"Five","spades", false);
					deck[18] = new cardnew1(6,"Six","spades", false);
					deck[19] = new cardnew1(7,"Seven","spades", false);
					deck[20] = new cardnew1(8,"Eight","spades", false);
					deck[21] = new cardnew1(9,"Nine","spades", false);
					deck[22] = new cardnew1(10,"Ten","spades", false);
					deck[23] = new cardnew1(10,"Jack","spades", false);
					deck[24] = new cardnew1(10,"Queen","spades", false);
					deck[25] = new cardnew1(10,"King","spades", false);
					deck[26] = new cardnew1(1,"Ace","clubs", false);
					deck[27] = new cardnew1(2,"Two","clubs", false);
					deck[28] = new cardnew1(3,"Three","clubs", false);
					deck[29] = new cardnew1(4,"Four","clubs", false);
					deck[30] = new cardnew1(5,"Five","clubs", false);
					deck[31] = new cardnew1(6,"Six","clubs", false);
					deck[32] = new cardnew1(7,"Seven","clubs", false);
					deck[33] = new cardnew1(8,"Eight","clubs", false);
					deck[34] = new cardnew1(9,"Nine","clubs", false);
					deck[35] = new cardnew1(10,"Ten","clubs", false);
					deck[36] = new cardnew1(10,"Jack","clubs", false);
					deck[37] = new cardnew1(10,"Queen","clubs", false);
					deck[38] = new cardnew1(10,"King","clubs", false);
					deck[39] = new cardnew1(1,"Ace","hearts", false);
					deck[40] = new cardnew1(2,"Two","hearts", false);
					deck[41] = new cardnew1(3,"Three","hearts", false);
					deck[42] = new cardnew1(4,"Four","hearts", false);
					deck[43] = new cardnew1(5,"Five","hearts", false);
					deck[44] = new cardnew1(6,"Six","hearts", false);
					deck[45] = new cardnew1(7,"Seven","hearts", false);
					deck[46] = new cardnew1(8,"Eight","hearts", false);
					deck[47] = new cardnew1(9,"Nine","hearts", false);
					deck[48] = new cardnew1(10,"Ten","hearts", false);
					deck[49] = new cardnew1(10,"Jack","hearts", false);
					deck[50] = new cardnew1(10,"Queen","hearts", false);
					deck[51] = new cardnew1(10,"King","hearts", false);
					
						
					//first two cards
					int random_number1 = (int) (Math.random() * 52);
					//find a card that hasn't been used
					while (deck[random_number1].discard == true)
					{
						random_number1 = (int) (Math.random() * 52);
					}
					int random_number2= (int) (Math.random() * 52);
					//find a card that hasn't been used
					while (deck[random_number2].discard == true)
					{
						random_number2 = (int) (Math.random() * 52);
					}
					int random_number4 = (int) (Math.random() * 52);
					//find a card that hasn't been used
					while (deck[random_number4].discard == true)
					{
						random_number4 = (int) (Math.random() * 52);
					}
					int random_number5 = (int) (Math.random() * 52);
					//find a card that hasn't been used
					while (deck[random_number5].discard == true)
					{
						random_number5 = (int) (Math.random() * 52);
					}
					
					
					
					System.out.println("Your card is a "+ deck[random_number1].name + " of " + deck[random_number1].suit);
					System.out.println("Your card is a " + deck[random_number2].name + " of " + deck[random_number2].suit);
					System.out.println("Dealers first card is a " + deck[random_number4].name + " of " + deck[random_number4].suit);
					x = deck[random_number1].value + deck[random_number2].value;
					System.out.println("Your total card value is "+ x);
					waiting(1);
					d = deck[random_number4].value + deck[random_number5].value;
					deck[random_number1].discard = true;
					deck[random_number2].discard = true;
					deck[random_number4].discard = true;
					deck[random_number5].discard = true;
					
					System.out.println("Would you like to hit? Type 1 to hit, 2 to stay");
					int c;
					c=in.nextInt();
					waiting(1);
					//hitting
					while(c == 1){
						
						int random_number3 = (int) (Math.random() * 52);
						System.out.println("Your card is a " +deck[random_number3].value +"-"+ deck[random_number3].name+"of" +deck[random_number3].suit);
						x = x + deck[random_number3].value;
						System.out.println("card value"+ x);
						
						while (deck[random_number3].discard == true){
							random_number3 = (int) (Math.random() * 52);
						}
						deck[random_number3].discard = true;
						//bust
						if(x>21){
							money=money-5;
							System.out.println("Bust. Gameover.");
							System.out.println("Dealer card value=" + d);
							break;
						}
						if(x<=21){
							System.out.println("Would you like to hit? 1=Hit,2=Stay");
							c=in.nextInt();
							waiting(1);
						}	
						while(d < 17){
							int random_number6 = (int) (Math.random() * 52);
							
							d = d + deck[random_number6].value;
							while (deck[random_number6].discard == true)
							{
								random_number6 = (int) (Math.random() * 52);
							}
							deck[random_number6].discard = true;
							waiting(2);
							//bust
							if(d>21)
							{
								System.out.println("Dealer is Bust");
								
								break;
							}
						}	
					}
					if(c==2){
						System.out.println("Dealer card value=" + d);
						
							//points
							if(x<=21)
							{
							if(d==x)
							{
								System.out.println("You tied dealer");
							}
							if(d>x)
							{
								money=money-5;
								System.out.println("you lost har har dealer beat you");
							}
							if(d == 22)
							{
								money=money+5;
								System.out.println("you beat dealer  he was bust");
							}
							if(x>d)
							{
								money=money+5;
								System.out.println("You beat dealer");
							}
							if(x ==21)
							{
								System.out.println("you got blackjack you get 10  money");
							}
							waiting(1);
							
								System.out.println("You now have " + money + "moneys");
							}
					}
					//count amount of used cards
					int counter = 0;
					for (int i = 0; i < 52; i++)
					{
						if (deck[i].discard == true)
						{
							counter++;
						}
					}
					//shuffle if all have been used
					if (counter == 52)
					{
						//shuffle
						for(int j = 0; j <= 100; j++)
						{
							int shuffle = (int) (Math.random() * 52);
							int shuffle2= (int) (Math.random() * 52);
							int hold = shuffle;
							deck[shuffle] = deck[shuffle2];
							deck[shuffle2] = deck[hold];
						}
					}	
				    System.out.println("Would you like to play again? 1=yes,2=no");
				    select=in.nextInt();	
				}
				

			
			
				if(select==2)
				{
					System.out.println("your ending balance �"+ money );
					System.out.println("bye");
					break;
				}
		}
	}
	public static void waiting (int n){
        
        long t0, t1;

        t0 =  System.currentTimeMillis();

        do{
            t1 = System.currentTimeMillis();
        }
        while ((t1 - t0) < (n * 3000));
      while (t1 - t0 < n);
    }
}