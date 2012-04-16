import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import java.awt.Color;
import java.util.ArrayList;

class myBug extends Bug
{


  /**
   * Constructor
   */
  public myBug(Color bugColor)
  {
	   //calls constructor of the parent
	   super(bugColor);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {

	   //get the grid of this object
	   Grid<Actor> grid = this.getGrid();
	   
	   //get current location
	   Location currentLocation = this.getLocation();
	   
	   //move to a random adjacent location if rock is not found
	   //by check if there is no occupied adjacent objects
	   if(grid.getOccupiedAdjacentLocations(currentLocation).size() == 0 )
	   {
		   //get a list of available locations
		   ArrayList<Location> validLocations = grid.getValidAdjacentLocations(currentLocation );
		   
		   //pick a random location
		   int randLocation = (int) (Math.random() * validLocations.size());
		   
		   //move there
		   moveTo(validLocations.get(randLocation));
	   }
	   
  
  }

  
}

public class InClass12
{
	public static void main(String[] args)
	{
		//setup myBug
		myBug bug1 = new myBug(Color.BLUE);
		Location bug1location = new Location(1, 1);
		
		//setup a rock
		Rock rock1 = new Rock();
		
		//setup Grid
		BoundedGrid myGrid = new BoundedGrid(7, 7);
		
		//setup World
		ActorWorld world = new ActorWorld(myGrid);
		
		//add rocks and bugs
		world.add(bug1location, bug1);
		world.add(rock1);
		
		world.show();
	}
}