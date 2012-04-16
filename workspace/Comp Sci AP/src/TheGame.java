//import libraries for graphics
import java.awt.*;
import java.util.*;

//card class
class cardnew2
{
	
	//declare variables
	public int value;
	public String name;
	public String suit;
	boolean discard;
	public Font Timesfont;
	
	//constructor
	public cardnew2( int value,String name,String suit, boolean discard){

		this.value = value;
		this.name = name;
		this.suit = suit;
		this.Timesfont = new Font("Times New Roman", Font.PLAIN,  18);
		this.discard = discard;
	}
	
	//draw card
	public void drawMe2(Graphics g, int posx, int posy)
	{	
		
		//set font
		g.setFont(Timesfont);
		g.drawRect(posx, posy, posx+100, posy+200);
		//draw card
		g.drawString(Integer.toString(value), posx+40, posy+80);
		g.drawString(name, posx+40, posy+120);	
	}
	
	
}

class myCanvas extends Canvas {

Scanner in = new Scanner(System.in);
   public void paint(Graphics g)
   {
	   int money = 100;
	   g.drawString(Integer.toString(money), 300, 10);	 
	   cardnew2[] deck = new cardnew2[52];
		
		deck[0] = new cardnew2(1,"Ace","diamonds", false);
		deck[1] = new cardnew2(2,"Two","diamonds", false);
		deck[2] = new cardnew2(3,"Three","diamonds", false);
		deck[3] = new cardnew2(4,"Four","diamonds", false);
		deck[4] = new cardnew2(5,"Five","diamonds", false);
		deck[5] = new cardnew2(6,"Six","diamonds", false);
		deck[6] = new cardnew2(7,"Seven","diamonds", false);
		deck[7] = new cardnew2(8,"Eight","diamonds", false);
		deck[8] = new cardnew2(9,"Nine","diamonds", false);
		deck[9] = new cardnew2(10,"Ten","diamonds", false);
		deck[10] = new cardnew2(10,"Jack","diamonds", false);
		deck[11] = new cardnew2(10,"Queen","diamonds", false);
		deck[12] = new cardnew2(10,"King","diamonds", false);
		deck[13] = new cardnew2(1,"Ace","spades", false);
		deck[14] = new cardnew2(2,"Two","spades", false);
		deck[15] = new cardnew2(3,"Three","spades", false);
		deck[16] = new cardnew2(4,"Four","spades", false);
		deck[17] = new cardnew2(5,"Five","spades", false);
		deck[18] = new cardnew2(6,"Six","spades", false);
		deck[19] = new cardnew2(7,"Seven","spades", false);
		deck[20] = new cardnew2(8,"Eight","spades", false);
		deck[21] = new cardnew2(9,"Nine","spades", false);
		deck[22] = new cardnew2(10,"Ten","spades", false);
		deck[23] = new cardnew2(10,"Jack","spades", false);
		deck[24] = new cardnew2(10,"Queen","spades", false);
		deck[25] = new cardnew2(10,"King","spades", false);
		deck[26] = new cardnew2(1,"Ace","clubs", false);
		deck[27] = new cardnew2(2,"Two","clubs", false);
		deck[28] = new cardnew2(3,"Three","clubs", false);
		deck[29] = new cardnew2(4,"Four","clubs", false);
		deck[30] = new cardnew2(5,"Five","clubs", false);
		deck[31] = new cardnew2(6,"Six","clubs", false);
		deck[32] = new cardnew2(7,"Seven","clubs", false);
		deck[33] = new cardnew2(8,"Eight","clubs", false);
		deck[34] = new cardnew2(9,"Nine","clubs", false);
		deck[35] = new cardnew2(10,"Ten","clubs", false);
		deck[36] = new cardnew2(10,"Jack","clubs", false);
		deck[37] = new cardnew2(10,"Queen","clubs", false);
		deck[38] = new cardnew2(10,"King","clubs", false);
		deck[39] = new cardnew2(1,"Ace","hearts", false);
		deck[40] = new cardnew2(2,"Two","hearts", false);
		deck[41] = new cardnew2(3,"Three","hearts", false);
		deck[42] = new cardnew2(4,"Four","hearts", false);
		deck[43] = new cardnew2(5,"Five","hearts", false);
		deck[44] = new cardnew2(6,"Six","hearts", false);
		deck[45] = new cardnew2(7,"Seven","hearts", false);
		deck[46] = new cardnew2(8,"Eight","hearts", false);
		deck[47] = new cardnew2(9,"Nine","hearts", false);
		deck[48] = new cardnew2(10,"Ten","hearts", false);
		deck[49] = new cardnew2(10,"Jack","hearts", false);
		deck[50] = new cardnew2(10,"Queen","hearts", false);
		deck[51] = new cardnew2(10,"King","hearts", false);

//set color		
      g.setColor(Color.blue);
   
		int random_number = (int) (Math.random() * 52);
		//find a card that hasn't been used

		while (deck[random_number].discard == true){
			random_number = (int) (Math.random() * 52);
			}
		deck[random_number].drawMe2(g, 50, 50); //draw that card
		
		int random_number2= (int) (Math.random() * 52);
		//find a card that hasn't been used
		while (deck[random_number2].discard == true){
			random_number2 = (int) (Math.random() * 52);
}
		deck[random_number2].drawMe2(g, 160, 70);//draw next card
		
		int random_number4 = (int) (Math.random() * 52); //dealer cards
		//find a card that hasn't been used
		while (deck[random_number4].discard == true){
			random_number4 = (int) (Math.random() * 52);
}
		int random_number5 = (int) (Math.random() * 52);
		//find a card that hasn't been used
		while (deck[random_number5].discard == true){
			random_number5 = (int) (Math.random() * 52);
}       
		int x = deck[random_number].value + deck[random_number2].value;
		int d = deck[random_number4].value + deck[random_number5].value;
		String hit = "Would you like to hit? Type 1 to hit, 2 to stay";
		g.drawString(Integer.toString(x), 180, 40); //draw card total
		g.drawString(hit,200,100);   
		
		int c;    
		c=in.nextInt();
		waiting(1); //wait 1 second
		//hitting
		while(c == 1){ 
			int random_number3 = (int) (Math.random() * 52);
			x = x + deck[random_number3].value;
			g.setColor(Color.WHITE); 
			g.drawRect(160, 35, 20, 20);//cover old x
			g.drawRect(199, 99, 100, 10 ); //cover hit
			g.setColor(Color.PINK);
			g.drawString(Integer.toString(x), 180, 40); // draw new x
			while (deck[random_number3].discard == true){
				random_number3 = (int) (Math.random() * 52);
			}
			deck[random_number3].discard = true;
			deck[random_number3].drawMe2(g, 270, 50);
			//bust
			if(x>21){
				money=money-5;
				g.drawString("Bust. Gameover." ,175 ,175);
				g.drawString("Dealer card value=", 175,190);
				g.drawString(Integer.toString(d), 190, 190);
				break;
			}
		}
		
		if(x<=21){
			g.drawString("Would you like to hit? 1=Hit,2=Stay", 200, 101);
			int l;
			l=in.nextInt();
			waiting(1);
			while(l == 1){ 
				int random_number6 = (int) (Math.random() * 52);
				x = x + deck[random_number6].value;
				g.setColor(Color.WHITE); 
				g.drawRect(160, 35, 20, 20);//cover old x
				g.drawRect(199, 99, 100, 10 ); //cover hit
				g.setColor(Color.PINK);
				g.drawString(Integer.toString(x), 180, 40); // draw new x
				while (deck[random_number6].discard == true){
					random_number6 = (int) (Math.random() * 52);
				}
				deck[random_number6].discard = true;
				deck[random_number6].drawMe2(g, 380, 50);
				//bust
				if(x>21){
					money=money-5;
					g.drawString("Bust. Gameover." ,175 ,175);
					g.drawString("Dealer card value=", 175,190);
					g.drawString(Integer.toString(d), 190, 190);
					break;
				}
			}
			}

		if(x<=21){
			g.drawString("Would you like to hit? 1=Hit,2=Stay", 200, 101);
			int e;
			e=in.nextInt();
			waiting(1);
			while(e == 1){ 
				int random_number7 = (int) (Math.random() * 52);
				x = x + deck[random_number7].value;
				g.setColor(Color.WHITE); 
				g.drawRect(160, 35, 20, 20);//cover old x
				g.drawRect(199, 99, 100, 10 ); //cover hit
				g.setColor(Color.PINK);
				g.drawString(Integer.toString(x), 180, 40); // draw new x
				while (deck[random_number7].discard == true){
					random_number7 = (int) (Math.random() * 52);
				}
				deck[random_number7].discard = true;
				deck[random_number7].drawMe2(g, 490, 50);
				//bust
				if(x>21){
					money=money-5;
					g.drawString("Bust. Gameover." ,175 ,175);
					g.drawString("Dealer card value=", 175,190);
					g.drawString(Integer.toString(d), 190, 190);
					break;
				}
			}
			}
		
		while(d < 17){
			int random_number9 = (int) (Math.random() * 52);
			d = d + deck[random_number9].value;
			while (deck[random_number9].discard == true)
			{
				random_number9 = (int) (Math.random() * 52);
			}
			deck[random_number9].discard = true;
			waiting(2);
			//bust
			if(d>21){	
				g.drawString("Dealer is Bust", 200 ,200);
break;
			
 }
}

	if(c==2){
		g.drawString("Dealer card value=", 175,190);
		g.drawString(Integer.toString(d), 190, 190);
		//points
		if(x<=21){
			if(d==x){
				g.drawString("You tied Dealer", 175,190);
			}
			if(d>x){
			money=money-5;
			g.drawString("you lost", 175,190);
		}
			if(d >= 22){
				money=money+5;
				g.drawString("Dealer is bust", 175,190);
		}
			if(x>d){
				money=money+5;
				g.drawString("You beat dealer", 175,190);
		}
			if(x ==21){
				money=money+10;
				g.drawString("You got Blackjack", 175,190);
		}
			waiting(1);
			g.drawRect(298, 9, 350, 10);
			g.drawString(Integer.toString(money), 190, 190);

		}
}
	int counter = 0;
	for (int i = 0; i < 52; i++){
		if (deck[i].discard == true){
			counter++;
		}
}
	//shuffle if all have been used
	if (counter == 52){
		//shuffle
	for(int j = 0; j <= 100; j++){
		int shuffle = (int) (Math.random() * 52);
		int shuffle2= (int) (Math.random() * 52);
		int hold = shuffle;
		deck[shuffle] = deck[shuffle2];
		deck[shuffle2] = deck[hold];
	}
}
	g.drawString("Would you like to play again? 1=yes,2=no", 175, 20);
	int select=in.nextInt();


if(select==2){
//	break;
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

public class TheGame
{
   public static void main(String[] args){
	   
	 //create objects for Canvas and Frame
   	 myCanvas canvasObject= new myCanvas();  
       Frame frameObject = new Frame();
    
	 //define settings for frameobject
       frameObject.setSize(1300, 600);
       frameObject.setBackground(Color.white);
	 frameObject.setVisible(true);

	 //add canvasobject to frame object
       frameObject.add(canvasObject);
   }
}