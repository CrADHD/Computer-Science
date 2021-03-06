import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;
import java.util.Scanner;

class waveBugtest extends Bug
{

	int degree = 90;
	int updown; //up = 1 down = 0
	int increment;
	
   /**
    * Constructor
    */
   public waveBugtest(int increment)
   {
   	//set increment
   	this.increment = increment;
   	
   	//set initial degree
   	setDirection(degree);    	
   }

   /**
    * Does something when step is pressed.
    */
   public void act()
   {
   	//move bug forward
       move();
       
       //set updown flag
       if( degree >= 270 )
       {
       	updown = 1;
       }
       
       if( degree <= 90 )
       {
       	updown = 0;
       }
       
       //change direction depending on updown flag
       if( updown == 0)
       {
       	degree += increment;
       }
       else
       {
       	degree -= increment;
       }
       
       //set new degree
       setDirection(degree);
   }
}


public class GridWorldTest2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//setup LBug
		waveBugtest bug1 = new waveBugtest(30);
		bug1.setColor(Color.BLUE);
		Location bug1location = new Location(0, 2);
		
		waveBugtest bug2 = new waveBugtest(20);
		bug2.setColor(Color.RED);
		Location bug2location = new Location(0, 6);
		
		waveBugtest bug3 = new waveBugtest(20);
		bug3.setColor(Color.BLACK);
		Location bug3location = new Location(0, 13);

		waveBugtest bug4 = new waveBugtest(20);
		bug4.setColor(Color.GREEN);
		Location bug4location = new Location(0, 20);
		
		//setup Grid
		UnboundedGrid myGrid = new UnboundedGrid();
		
		//setup World
		ActorWorld world = new ActorWorld(myGrid);
		
		System.out.println("Which bug would you like to use?");
		System.out.println("1. Verticle Wave");
		System.out.println("2. Horizontal Zig Zag");
		System.out.println("3. Circular Spiral");
		System.out.println("4. Square Spiral");
		int BugNum = in.nextInt();
		if(BugNum==1){
			world.add(bug1location, bug1);
		}
		if(BugNum==2){
			world.add(bug2location, bug2);
		}
		if(BugNum==3){
			world.add(bug3location, bug3);
		}
		if(BugNum==4){
			world.add(bug4location, bug4);
		}
	//	world.add(bug2location, bug2);
		world.show();
	}
}