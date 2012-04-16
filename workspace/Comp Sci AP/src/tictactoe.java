import java.util.*;

class numbertictactoe1
{
   int winner=0;
   int[][] test = new int[3][3];
   Scanner in = new Scanner(System.in);
   
   /**
	* Constructor setup grid
	*/
   public numbertictactoe1()
   {
  	 //set all columns and rows to 0
  	 for(int i=0; i < test.length; i++)
  	 {
  		 for(int j=0; j < test[i].length; j++)
  		 {
  			 test[i][j] = 0;
  		 }
  	 }
   }

   /**
	* print grid
	*/
   public void print_grid()
   {
  	 for(int i=0; i < test.length; i++)
  	 {
  		 for(int j=0; j < test[i].length; j++)
  		 {
  			 System.out.print(test[i][j]);
  		 }
  		 System.out.print("\n");
  	 }
   }
   public void winner(){
	   
	           //variables increment for X and 0 matches
	   
	           int matchx=0;
	   
	           int matcho=0;
	   
	           //We assign the int to i
	   
	           int i=0;
	   
	           //loop through indexes to check for X
	   
	           for(int j=0;j<3;j++){
	   
	               //if row has X
	   
	               if(test[i][j]=='1'||test[i][j]=='1'){
	   
	                   //increment ..X found
	   
	                   matchx++;
	   
	               }
	   
	               //if row has O
	   
	               else if(test[i][j]=='2'||test[i][j]=='2'){
	   
	                   //increment.. O found
	   
	                   matcho++;
	   
	    
	   
	               }
	   
	               //if any of these variables are equal to 3
	   
	               if(matchx==3||matcho==3){
	   
	                   //return true
	   
	                   winner =1;
	   
	               }
	   
	    
	   
	           }
	   
	           //if not return false
	   
	          winner =0;
	   
	       }

   		/**
	* player one move
	*/
   public void playerOneTurn()
   {
  	 System.out.print("Enter in your move player 1:");
  	 int move = in.nextInt();
  	 int row = move/10;
  	 int col = move%10;
  	 test[row][col] = 1;
   }
   
   /**
	* player two move
	*/
   public void playerTwoTurn(){
	 
	 System.out.print("Enter in your move player 2:");
  	 int move = in.nextInt();
  	 int row = move/10;
  	 int col = move%10;
  	 test[row][col] = 2;
}

   public void stuff(){
	   
	while(winner==0){	
	
	playerOneTurn();
	print_grid();
	playerTwoTurn();
  	print_grid();
}}}


public class tictactoe {
   public static void main(String[] args) throws Exception
   {
  	 //setup game object
  	 numbertictactoe1 myGame = new numbertictactoe1();
  	 
  	 //print grid
  	 myGame.print_grid();
  	 
  	 myGame.stuff();
}}