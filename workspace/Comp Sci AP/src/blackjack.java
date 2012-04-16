import java.awt.Graphics;
import java.util.*;

class card
{
	
	int value;
	String name;
	String suit;
	boolean discard;
	
	//constructor
	public card( int value,String name,String suit, boolean discard)
	{
		this.value = value;
		this.name = name;
		this.suit = suit;
		this.discard = discard;
	}

	public card(int i, String string) {
	}

	public void drawMe(Graphics g, int i, int j) {
		
	}
}
public class blackjack 
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);	
		int select;
		int x; 
		int points = 0;
		System.out.println("Would you like to play a game of blackjack? 1=yes,2=no");
		select=in.nextInt();
		while(1<2)
		{
			
				if(select == 1)
				{
					
					card[] deck = new card[52];
					
					deck[0] = new card(1,"Ace","diamonds", false);
					deck[1] = new card(2,"Two","diamonds", false);
					deck[2] = new card(3,"Three","diamonds", false);
					deck[3] = new card(4,"Four","diamonds", false);
					deck[4] = new card(5,"Five","diamonds", false);
					deck[5] = new card(6,"Six","diamonds", false);
					deck[6] = new card(7,"Seven","diamonds", false);
					deck[7] = new card(8,"Eight","diamonds", false);
					deck[8] = new card(9,"Nine","diamonds", false);
					deck[9] = new card(10,"Ten","diamonds", false);
					deck[10] = new card(10,"Jack","diamonds", false);
					deck[11] = new card(10,"Queen","diamonds", false);
					deck[12] = new card(10,"King","diamonds", false);
					deck[13] = new card(1,"Ace","spades", false);
					deck[14] = new card(2,"Two","spades", false);
					deck[15] = new card(3,"Three","spades", false);
					deck[16] = new card(4,"Four","spades", false);
					deck[17] = new card(5,"Five","spades", false);
					deck[18] = new card(6,"Six","spades", false);
					deck[19] = new card(7,"Seven","spades", false);
					deck[20] = new card(8,"Eight","spades", false);
					deck[21] = new card(9,"Nine","spades", false);
					deck[22] = new card(10,"Ten","spades", false);
					deck[23] = new card(10,"Jack","spades", false);
					deck[24] = new card(10,"Queen","spades", false);
					deck[25] = new card(10,"King","spades", false);
					deck[26] = new card(1,"Ace","clubs", false);
					deck[27] = new card(2,"Two","clubs", false);
					deck[28] = new card(3,"Three","clubs", false);
					deck[29] = new card(4,"Four","clubs", false);
					deck[30] = new card(5,"Five","clubs", false);
					deck[31] = new card(6,"Six","clubs", false);
					deck[32] = new card(7,"Seven","clubs", false);
					deck[33] = new card(8,"Eight","clubs", false);
					deck[34] = new card(9,"Nine","clubs", false);
					deck[35] = new card(10,"Ten","clubs", false);
					deck[36] = new card(10,"Jack","clubs", false);
					deck[37] = new card(10,"Queen","clubs", false);
					deck[38] = new card(10,"King","clubs", false);
					deck[39] = new card(1,"Ace","hearts", false);
					deck[40] = new card(2,"Two","hearts", false);
					deck[41] = new card(3,"Three","hearts", false);
					deck[42] = new card(4,"Four","hearts", false);
					deck[43] = new card(5,"Five","hearts", false);
					deck[44] = new card(6,"Six","hearts", false);
					deck[45] = new card(7,"Seven","hearts", false);
					deck[46] = new card(8,"Eight","hearts", false);
					deck[47] = new card(9,"Nine","hearts", false);
					deck[48] = new card(10,"Ten","hearts", false);
					deck[49] = new card(10,"Jack","hearts", false);
					deck[50] = new card(10,"Queen","hearts", false);
					deck[51] = new card(10,"King","hearts", false);
					
						
					//first two cards
					int random_number = (int) (Math.random() * 52);
					//find a card that hasn't been used
					while (deck[random_number].discard == true)
					{
						random_number = (int) (Math.random() * 52);
					}
					int random_number2= (int) (Math.random() * 52);
					//find a card that hasn't been used
					while (deck[random_number2].discard == true)
					{
						random_number2 = (int) (Math.random() * 52);
					}
					System.out.println("Your card is a " + deck[random_number].name + " of " + deck[random_number].suit);
					System.out.println("Your card is a " + deck[random_number2].name + " of " + deck[random_number2].suit);
					x = deck[random_number].value + deck[random_number2].value;
					deck[random_number].discard = true;
					deck[random_number2].discard = true;
					System.out.println("Would you like to hit? 1=Hit,2=Stay");
					int c;
					c=in.nextInt();
					//hitting
					while(c == 1)
					{
						int random_number3 = (int) (Math.random() * 52);
						System.out.println("Your card is a " + deck[random_number3].name +deck[random_number3].suit);
						x = x + deck[random_number3].value;
						while (deck[random_number3].discard == true)
						{
							random_number3 = (int) (Math.random() * 52);
						}
						deck[random_number3].discard = true;
						//bust
						if(x>21)
						{
							System.out.println("Bust. Gameover.");
							break;
						}
						if(x<=21)
						{
							System.out.println("Would you like to hit? 1=Hit,2=Stay");
							c=in.nextInt();
						}	
						
					}
					if(c==2)
					{
						
							//points
							if(x<21)
							{
								//loss
								if (x < 17)
								{
									System.out.println("Sorry, you didn't get any points.");
								}
								//win
								if (x == 17)
								{
									System.out.println("You scored a 17! You get one point.");
									points++;	
								}
								if (x == 18)
								{
									System.out.println("You scored a 18! You get two points.");
									points+=2;
								}
								if (x == 19)
								{
									System.out.println("You scored a 19! You get three points.");
									points+=3;
								}
								if (x == 20)
								{
									System.out.println("You scored a 20! You get four points.");
									points+=4;
								}
								if (x == 21)
								{
									System.out.println("You scored a 21! You get five points.");
									points+=5;
								}
								System.out.println("You now have " + points + " points");
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
					System.out.println("bye");
					break;
				}
		}
	}
}
