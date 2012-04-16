
//import java.io.*;
import java.util.*;

public class InputOutput
{
	public static void main(String[] args) throws Exception
	{
		
		//init library object
		//create variable for input/output
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if( x < y )
		{
			System.out.println("cat");
		}
		else
		{
			System.out.println("dog");
		}
			

	}
}