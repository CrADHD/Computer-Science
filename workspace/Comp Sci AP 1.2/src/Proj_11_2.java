import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;
import java.util.Scanner;

class waveBug extends Bug
{

	int degree;
	int updown; //up = 1 down = 0
	int increment;
	
   /**
    * Constructor
    */
   public waveBug(int increment, int degree, int angle1, int angle2)
   {
   	//set increment
   	this.increment = increment;
   	this.degree = degree;
   	
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

class zigBug extends Bug
{

	int degree;
	int updown; //up = 1 down = 0
	int increment;
	int var1;
	int var2;
	
   /**
    * Constructor
    */
   public zigBug(int increment, int degree, int var1, int var2)
   {
   	//set increment
   	this.increment = increment;
   	this.degree = degree;
	this.var1 = var1; // steps taken
	this.var2 = var1; //
   	
   	//set initial degree
   	setDirection(degree);
   }

   /**
    * Does something when step is pressed.
    */
   public void act()
   {
   	//move bug forward
       
       //set updown flag
       if( var1 == 5 )
       {
       	updown = 2;
       }
       
       if( var1 == 0 )
       {
       	updown = 0;
       }
       else{
    	updown = 1;
       }
       
       //change direction depending on updown flag
       if( updown == 0)
       {
           setDirection(45);
           move();
           var1++;
       }
       if( updown == 2)
       {
           setDirection(135);
           move();
           var1=0;
       }
       else{
    	   move();
           var1++;
       }
   }
}

class archBug extends Bug
{

	int degree;
	int moveInc;
	double angleInc;
	
   /**
    * Constructor
    */
   public archBug(int moveInc, int degree, double angleInc)
   {
   	//set increment
   	this.moveInc = moveInc;
   	this.degree = degree;
   	this.angleInc = angleInc;
   	
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
      angleInc=angleInc*(.97);
       
       //change direction depending on updown flag
       	degree -= angleInc;

       //set new degree
       setDirection(degree);
   }
}

class sqBug extends Bug
{

	int degree;
	int moveInc;
	int angleInc;
	
   /**
    * Constructor
    */
   public sqBug(int moveInc, int degree, int angleInc)
   {
   	//set increment
   	this.moveInc = moveInc;
   	this.degree = degree;
   	this.angleInc = angleInc;
   	
   	//set initial degree
   	setDirection(degree);
   }

   /**
    * Does something when step is pressed.
    */
   public void act()
   {
   	//move bug forward
      for(int i = 0; i<moveInc; i++){
	   move();
      }
      moveInc+=2;
       
       //change direction depending on updown flag
       	degree -= angleInc;

       //set new degree
       setDirection(degree);
   }
}

public class Proj_11_2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//setup LBug
		waveBug bug1 = new waveBug(30, 90, 270, 90);
		bug1.setColor(Color.BLUE);
		Location bug1location = new Location(0, 2);
		
		zigBug bug2 = new zigBug(90, 45, 0, 0);
		bug2.setColor(Color.RED);
		Location bug2location = new Location(5, 0);
		
		archBug bug3 = new archBug(1, 90, 30);
		bug3.setColor(Color.BLACK);
		Location bug3location = new Location(20, 20);

		sqBug bug4 = new sqBug(1, 90, 90);
		bug4.setColor(Color.GREEN);
		Location bug4location = new Location(20, 20);
		
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
		world.show();
}}