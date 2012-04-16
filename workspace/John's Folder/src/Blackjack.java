//import libraries for graphics
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.*;

//card class
class card
{
	
	//declare variables
	public int value;
	public String name;
	public Font Timesfont;
	public String suit;
	boolean discard;
	
	
	//constructor
	public card( int value,String name,String suit, boolean discard)
	{
		//define variables
		this.value = value;
		this.name = name;
		this.Timesfont = new Font("Times New Roman", Font.PLAIN,  18);
	}
	
	//draw card
	public void drawMe(Graphics g, int posx, int posy)
	{	
		//set font
		g.setFont(Timesfont);
		g.drawRect(posx,posy,posx+100,posy+200);
		//draw card
		g.drawString(Integer.toString(value), posx+40, posy+80);
		g.drawString(name, posx+40, posy+120);	
	}
	
	
}

class myCanvas extends Canvas
{

   public void paint(Graphics g)
   {
   	
	

class Blackjack
{
   public void main(String[] args) throws Exception 
   {
	 //create objects for Canvas and Frame
   	 myCanvas canvasObject= new myCanvas();  
       JFrame frameObject = new JFrame();
    
	 //define settings for frameobject
       frameObject.setSize(400, 400);
       frameObject.setBackground(Color.white);
	 frameObject.setVisible(true);

	 //add canvasobject to frame object
       frameObject.add(canvasObject);
   }
}

class Win extends JFrame
{
	public String FinalNum= ("");
   public Win init() throws Exception    // Creates canvas
   {
       //create canvas object
       Win mycanvas = new Win();
       
       //set size of canvas
       mycanvas.setSize(1300,500);
       
       //show canvas
       mycanvas.setVisible(true); 
       
       return mycanvas;
   }
   Color bkgd = Color.BLACK;
   Font num = new Font("Times New Roman", Font.PLAIN,  18);
   Font heading = new Font("Times New Roman", Font.BOLD,  22);
   
   public void paint(Graphics g){             //Paints on canvas 
	   g.setColor(bkgd);
	   g.fillRect(0, 0, 1300, 500);
	   g.setColor(Color.PINK);
	   
	 //create card deck			
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
		
	//set color		
	      g.setColor(Color.blue);
	       
		//declare variable
	      int random_number;
	      
	//get and draw random card selection
	      random_number = (int) (Math.random() * 13);
	      deck[random_number].drawMe(g, 50, 50);

	      random_number = (int) (Math.random() * 13);
	      deck[random_number].drawMe(g, 175, 100);       
	   }
	}
   }
}