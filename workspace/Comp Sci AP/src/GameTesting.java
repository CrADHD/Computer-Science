//import libraries for graphics
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

//card class
class cardnew3
{
	
	//declare variables
	public int value;
	public String name;
	public Font Timesfont;
	
	//constructor
	public cardnew3(int value, String name)
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
		
		//draw top line
		g.drawLine(posx, posy, posx+100, posy);
		
		//draw left side
		g.drawLine(posx, posy, posx, posy+200);
		
		//draw right side
		g.drawLine(posx+100, posy, posx+100, posy+200);
		
		//draw bottom line
		g.drawLine(posx, posy+200, posx+100, posy+200);
		
		//draw card
		g.drawString(Integer.toString(value), posx+40, posy+80);
		g.drawString(name, posx+40, posy+120);	
	}
	
	
}

class myCanvas1 extends Canvas
{

   public void paint(Graphics g)
   {
   	
	//create card deck
   	card[] deck = new card[13];
		
	//init each object in the array
	deck[0] = new card(1,"Ace");
	deck[1] = new card(2,"Two");
	deck[2] = new card(3,"Three");
	deck[3] = new card(4,"Four");
	deck[4] = new card(5,"Five");
	deck[5] = new card(6,"Six");
	deck[6] = new card(7,"Seven");
	deck[7] = new card(8,"Eight");
	deck[8] = new card(9,"Nine");
	deck[9] = new card(10,"Ten");
	deck[10] = new card(10,"Jack");
	deck[11] = new card(10,"Queen");
	deck[12] = new card(10,"King");
	
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

public class GameTesting
{
   public static void main(String[] argS)
   {
	 //create objects for Canvas and Frame
   	 myCanvas canvasObject= new myCanvas();  
       Frame frameObject = new Frame();
    
	 //define settings for frameobject
       frameObject.setSize(400, 400);
       frameObject.setBackground(Color.white);
	 frameObject.setVisible(true);

	 //add canvasobject to frame object
       frameObject.add(canvasObject);
   }
}