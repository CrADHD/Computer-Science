import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import java.awt.Color;
import java.util.ArrayList;

class myBug12 extends Bug
{

  private boolean found = false;

  /**
   * Create a Bug
   * @param bugColor Color of the bug
   */
  public myBug12(Color bugColor)
  {
	   super(bugColor);
  }

  /**
   * Does something when step is pressed.
   */
  public void act()
  {

	   //get the grid of this object
	   Grid<Actor> grid = this.getGrid();
	   Location currentLocation = this.getLocation();
	   //get a list of adjacent objects
	   ArrayList<Actor> adjObjects = grid.getNeighbors(currentLocation);
	   //go through adjacent actors
	   for(Actor x : adjObjects)
	   {
		   //get object description
		   String objectDescription = x.toString();
		   //see if it contains the string for yellow
		   if( objectDescription.contains("r=255,g=255,b=0") )
		   {
			   found = true;
		   }
	   }
	   
	   
	   //if found is false, move to a random valid location
	   if( found == false )
	   {
		   //Find and move to random, available location
		   ArrayList<Location> validLocations = grid.getEmptyAdjacentLocations(currentLocation);
		   int randLocation = (int) (Math.random() * validLocations.size());
		   moveTo(validLocations.get(randLocation));
	   }
	   if( found = true )
	   {
		   
	   }
}}

public class Proj_12_1
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//setup myBug
		myBug12 bug1 = new myBug12(Color.BLUE);
		Location bug1location = new Location(0, 5);
		
		myBug12 bug2 = new myBug12(Color.RED);
		Location bug2location = new Location(9, 5);
		
		//setup a rock
		Rock rock1 = new Rock();
		Rock rock2 = new Rock();
		Rock rock3 = new Rock();
		Rock rock4 = new Rock(Color.YELLOW);
		
		//setup Grid
		BoundedGrid myGrid = new BoundedGrid(10, 10);
		
		//setup World
		ActorWorld world = new ActorWorld(myGrid);
		
		//add rocks and bugs
		world.add(bug1location, bug1);
		world.add(bug2location, bug2);
		world.add(rock1);
		world.add(rock2);
		world.add(rock3);
		world.add(rock4);
		
		world.show();
	}
}