import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import java.awt.Color;

class Lbug extends Bug
{

	int steps=0;
	
   /**
    * Constructor
    */
   public Lbug()
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

public class test
{
	public static void main(String[] args)
	{
		//setup LBug
		Lbug bug1 = new Lbug();
		bug1.setColor(Color.BLUE);
		Location bug1location = new Location(1, 1);
		
		//setup Grid
		BoundedGrid myGrid = new BoundedGrid(10, 20);
		
		//setup World
		ActorWorld world = new ActorWorld(myGrid);
		world.add(bug1location, bug1);
		world.show();
	}
}