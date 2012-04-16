import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;
class ibug extends Bug
{
	int steps=0;
	public ibug()
	   {
	   	//face down
	   	setDirection(180);
	   }
	   public void act()
	   {
		   if( steps < 5 )
	   		{
	   			move();
	   			steps++;
	   		}  
	   }
}
class ibug2 extends Bug
{
	int steps=0;
	public ibug2()
	   {
	   	//face down
	   	setDirection(180);
	   }
	public void act()
	   {
		   if( steps < 0 )
	   		{
	   			move();
	   			steps++;
	   		}  
	   }
}	
class vbug extends Bug
{
	int steps=0;
	
	   /**
	    * Constructor
	    */
	   public vbug()
	   {
	   	//face down
	   	setDirection(135);
	   }
	   public void act()
	   {
	       //draw vertical line
	   		if( steps < 5 )
	   		{
	   			move();
	   			steps++;
	   		}
	   	//change direction
	   	   	if( steps == 5 )
	   	   	{
	   	   		setDirection(45);
	   	   	}
	   	 if( steps >= 5 && steps < 10)
	    	{
	    		move();
	    		steps++;
	    	}
	   }	
}
class xbug extends Bug
{
	int steps=0;
	
	   /**
	    * Constructor
	    */
	   public xbug()
	   {
	   	//face down
	   	setDirection(135);
	   }
	   public void act()
	   {
	       //draw vertical line
	   		if( steps < 5 )
	   		{
	   			move();
	   			steps++;
	   		}
	   
	   	 
	   }	
}
class xbug2 extends Bug
{
	int steps=0;
	
	   /**
	    * Constructor
	    */
	   public xbug2()
	   {
	   	//face down
	   	setDirection(225);
	   }
	   public void act()
	   {
	       //draw vertical line
	   		if( steps < 5 )
	   		{
	   			move();
	   			steps++;
	   		}
	   
	   	 
	   }	
}
class Lbug1 extends Bug
{

	int steps=0;
	
   /**
    * Constructor
    */
   public Lbug1()
   {
   	//face down
   	setDirection(180);
   }

   /**
    * Does something when step is pressed.
    */
   public void act()
   {
       //draw vertical line
   	if( steps < 5 )
   	{
   		move();
   		steps++;
   	}
   	
   	//change direction
   	if( steps == 5 )
   	{
   		setDirection(90);
   	}
   	
   	//draw bottom line
   	if( steps >= 5 && steps < 7)
   	{
   		move();
   		steps++;
   	}
   }
}
public class Proj_11_1 {
	public static void main(String[] args)
	{
		//setup vBug
		vbug bug1 = new vbug();
		bug1.setColor(Color.BLUE);
		Location bug1location = new Location(1, 1);
		//setup xbug
		xbug bug2 =new xbug();
		bug2.setColor(Color.RED);
		Location bug2location =new Location(10,1);
		//setup xbug
		xbug2 bug6 =new xbug2();
		bug6.setColor(Color.RED);
		Location bug6location =new Location(10,6);
		//set L bug
		Lbug1 bug3 = new Lbug1();
		bug3.setColor(Color.GREEN);
		Location bug3location = new Location(20, 1);
		//set i bug
		ibug bug4 = new ibug();
		bug4.setColor(Color.YELLOW);
		Location bug4location = new Location(32, 1);
		//set i bug2
		ibug2 bug5 = new ibug2();
		bug5.setColor(Color.YELLOW);
		Location bug5location = new Location(30, 1);
		
		
		//setup Grid
		UnboundedGrid myGrid = new UnboundedGrid();
		
		//setup World
		ActorWorld world = new ActorWorld(myGrid);
		world.add(bug1location, bug1);
		world.show();
		world.add(bug2location, bug2);
		world.add(bug3location, bug3);
		world.add(bug4location, bug4);
		world.add(bug5location, bug5);
		world.add(bug6location, bug6);
		
	}
}
