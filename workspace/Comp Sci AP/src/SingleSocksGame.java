

import java.util.*;

public class SingleSocksGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
			boolean alive = true;
			System.out.println("Each room has 3 exits, one is correct," +
					" one is death, one is a setback. type 1, 2 or 3 to" +
					" chose a door. there are 5 rooms.");
			while (alive)
			{
				int room = 1;
				Scanner in = new Scanner(System.in);
				
				if( room == 1){
					System.out.println("You are in room " + room + ". Exit through door 1, 2, or 3");
					int door = in.nextInt();
					if(door==1){
						System.out.println("You Died");
						System.exit(0);
					}if(door==2){
						System.out.println("You enter another room");
						room = room + 1;
						
					}if(door==3){
						System.out.println("you feel a wrenching feeling in your gut");
						room = 1;
					}
			    }if(room==2){
					System.out.println("You are in room " + room);
					System.out.println("You see a button, Push it? ( yes = 1,  no = 2 )");
					int push = in.nextInt();
					if(push==1){
						int pressed = 1;
						while(pressed==1){
							System.out.println("Exit through door 1, 2, or 3");
							int door = in.nextInt();
							if(door==1){
								room = room + 1;
							}if(door==2){
								System.out.println("you feel a wrenching feeling in your gut");
								room = 1;
							}if(door==3){
								System.out.println("You Died");
								System.exit(0);
							}	
							pressed = 2;
						}
					}if(push==2)
					{
						int pressed=2;
						while(pressed==2){
							System.out.println("Exit through door 1, 2, or 3");
							int door = in.nextInt();
							if(door==1){
								System.out.println("You should have pushed the button! GAME OVER");
								System.exit(0);
							}if(door==2){
								System.out.println("You should have pushed the button! GAME OVER");
								System.exit(0);
							}if(door==3){
								System.out.println("You should have pushed the button! GAME OVER");
								System.exit(0);
							}
							pressed=2;
						}
					}
					
				}if(room==3){
					System.out.println("You are in room " + room + ". Exit through door 1, 2, or 3");
					int door = in.nextInt();
					if(door==1){
						System.out.println("You Died");
						System.exit(0);
					}if(door==2){
						System.out.println("You enter another room");
						room = room + 1;
						
					}if(door==3){
						System.out.println("you feel a wrenching feeling in your gut");
						room = 1;
					}
					
				}if (room==4){
					System.out.println("You are in room " + room + ". Exit through door 1, 2, or 3");
					int door = in.nextInt();
					if(door==1){
						System.out.println("you feel a wrenching feeling in your gut");
						room = 1;
					}if(door==2){
						System.out.println("You Died");
						System.exit(0);
					}if(door==3){
						System.out.println("Congratulations! You found the LAND OF THE SINGLE SOCKS!");
						System.exit(0);
					}
					
				}
			
			}
		}
	}
}

