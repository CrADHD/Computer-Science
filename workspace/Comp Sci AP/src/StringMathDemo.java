import java.util.*;

class MathDemo
{
	//constructor
	public MathDemo()
	{
	}
	Scanner in = new Scanner(System.in);
	//log method
	public void logarithm()
	{
		System.out.println("Enter a number");
		double x = in.nextDouble();
		x = Math.log10(x);
		System.out.println("log base 10 of that is " + x);
	}
	//absolute value method
	public void absvalue()
	{
		System.out.println("Enter a number");
		double x = in.nextDouble();
		x = Math.abs(x);
		System.out.println("The absolute value of that is " + x);
	}
	//power method
	public void power()
	{
		System.out.println("Enter the base");
		double a = in.nextDouble();
		System.out.println("Enter the exponent");
		double b = in.nextDouble();
		double x = Math.pow(a,b);
		System.out.println(a + " raised to the " + b + " power is " + x);
	}
	//square root method
	public void sqroot()
	{
		System.out.println("Enter a number");
		double x = in.nextDouble();
		x = Math.sqrt(x);
		System.out.println("The the square root of that is " + x);
	}
	//cube root method
	public void cubroot()
	{
		System.out.println("Enter a number");
		double x = in.nextDouble();
		x = Math.cbrt(x);
		System.out.println("The cube root of that is " + x);
	}
	//trig methods
	public void sine()
	{
		System.out.println("Enter an angle measure");
		double x = in.nextDouble();
		x = Math.sin(x);
		System.out.println("The sine ratio of that is " + x);
	}
	public void cosine()
	{
		System.out.println("Enter an angle measure");
		double x = in.nextDouble();
		x = Math.cos(x);
		System.out.println("The cosine ratio of that is " + x);
	}
	public void tangent()
	{
		System.out.println("Enter an angle measure");
		double x = in.nextDouble();
		x = Math.tan(x);
		System.out.println("The tangent ratio of that is " + x);
	}
	//natural log
	public void ln()
	{
		System.out.println("Enter a number");
		double x = in.nextDouble();
		x = Math.log(x);
		System.out.println("The natural log of that is " + x);
	}
	//determine the larger of two numbers
	public void compare()
	{
		System.out.println("Enter two numbers");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double x = Math.max(a,b);
		double y = Math.min(a,b);
		System.out.println(x + " is the larger than " + y);
	}
}
class StringDemo
{
	 //init variables
	Scanner in = new Scanner(System.in);
	//constructor
	public StringDemo()
	{
	}
	public void length()
	{
		//get a word
		System.out.println("Enter a word.");
		String x = in.nextLine();
		//print length of word
		System.out.println("The length of the word is " + x.length());
	}
	public void compare2()
	{
		//Get 2 words from users
		System.out.println("Enter 2 words:");
		String firstString = in.nextLine();
		String secondString = in.nextLine();
		
		//compare the 2 strings 
		int compareResult = firstString.compareTo(secondString);
	
		//print the result
		if( compareResult == 0 )
			System.out.println("They are the same word. HOW DID YOU NOT SEE THIS?");
		else if( compareResult < 0 )
			System.out.println("First word comes before the Second word.");	
		else if( compareResult > 0 )
			System.out.println("Second word comes before the First word.");	
	}
	public void makeplural()
	{
		//get a word
		System.out.println("Enter a noun.");
		String x = in.nextLine();
		//print 2 possibilities of plural
		System.out.println("The plural of the word is either " + x.concat("s") + " or " + x.concat("es") );
	}
	public void uppercase()
	{
		//get a word
		System.out.println("Enter a word.");
		String x = in.nextLine();
		//print word in all caps
		System.out.println("The word capitalized is " + x.toUpperCase() );
	}
	public void booltostring()
	{
		while(true)
		{
			//choose whether boolean is true or false
			System.out.println("Enter the number 1 or 2. (3.Exit)");
			boolean a = false;
			int x = in.nextInt();
			//set boolean to true or keep false
			if (x==1)
			{
				a = true;
			}
			if (x==3)
			{
				break;
			}
			//print true or false
			System.out.println("You just made the boolean " + String.valueOf(a) );
		}
	}
	public void substring()
	{
		//get a word
		System.out.println("Enter a word.");
		String a = in.nextLine();
		System.out.println("Enter two cell numbers to print all in between.");
		int x = in.nextInt();
		int y = in.nextInt();
		//print word in all caps
		System.out.println("The substring is " + a.substring(x, y+1) );
	}
	public void testplural()
	{
		//get a word
		System.out.println("Enter a word.");
		String x = in.nextLine();
		//determine if word is plural
		boolean a = x.endsWith("s");
		boolean b = x.endsWith("es");
		if (a == false && b == false)
			System.out.println("That word is not a regular plural");
		else
			System.out.println("That word is a plural");
	}
	public void vowelswitcha()
	{
		//get a word
		System.out.println("Enter a word.");
		String x = in.nextLine();
		x = x.replace("e", "i");
		x = x.replace("i", "o");
		x = x.replace("o", "u");
		x = x.replace("u", "a");
		//print with altered letters
		System.out.println("The altered word is now " + x);
	}
	public void objectname(Object a)
	{
		System.out.println("The name of this string object is " + String.valueOf(a));
	}
	public void lowercase()
	{
		//get a word
		System.out.println("Enter a word.");
		String x = in.nextLine();
		//print word in lower case
		System.out.println("The word capitalized is " + x.toLowerCase() );
	}
}
public class StringMathDemo {

	public static void main(String[] args) {
		     Scanner in = new Scanner(System.in);
			 while(true)
			 {
				 System.out.println("Welcome to the String and Math Java docs demo. Which library would you like to use?");
			   	 System.out.println("1. Math");
			   	 System.out.println("2. String");
			   	System.out.println("3. Exit");
			   	 int x = in.nextInt();
			   	 while (x == 1)
			   	 {   //object
			   		 MathDemo func = new MathDemo();
			   		 //menu
			   		 System.out.println("Which function would you like to use?");
				   	 System.out.println("1.Find a base 10 logarithm of a number");
				   	 System.out.println("2.Find absolute value of a number");
				   	 System.out.println("3.Raise a base to an exponent power");
				   	 System.out.println("4.Take the square root of a number");
		        	 System.out.println("5.Take the cube root of a number");
		        	 System.out.println("6.Find the sine value of an angle");
		        	 System.out.println("7.Find the cosine value of an angle");
		        	 System.out.println("8.Find the tangent value of an angle");
		        	 System.out.println("9.Find the natural logarithm of a number");
		        	 System.out.println("10.Find the larger of two numbers"); 
		        	 System.out.println("11.Main menu"); 
		        	 int y = in.nextInt();
		        	 //calling the math methods
		        	 if (y==1)
		        		 func.logarithm();
		        	 
		        	 if (y==2)
		        		 func.absvalue();
		        	 
		        	 if (y==3)
		        		 func.power();
		        	 
		        	 if (y==4)
		        		 func.sqroot();
		        	 
		        	 if (y==5)
		        		 func.cubroot();
		        	 
		        	 if (y==6)
		        		 func.sine();
		        	 
		        	 if (y==7)
		        		 func.cosine();
		        	 
		        	 if (y==8)
		        		 func.tangent();
		        	 
		        	 if (y==9)
		        		 func.ln();
		        	 
		        	 if (y==10)
		        		 func.compare();
		        	 
		        	 if (y==11)
		        		 break;
			   	 }
			   	while (x == 2)
			   	 {   //object
			   		 StringDemo func2 = new StringDemo();
			   		 //menu
			   		 System.out.println("Which function would you like to use?");
				   	 System.out.println("1.Tell the length of a string");
				   	 System.out.println("2.Find alphabetical order of two words");
				   	 System.out.println("3.Make a noun plural");
				   	 System.out.println("4.Capitalize a word");
		        	 System.out.println("5.Convert a boolean to a string");
		        	 System.out.println("6.Print a substring of a word");
		        	 System.out.println("7.Test to see if a word is plural");
		        	 System.out.println("8.Change up vowels of a sentence all to a");
		        	 System.out.println("9.See the type of this String object");
		        	 System.out.println("10.De-Capitalize a word"); 
		        	 System.out.println("11.Main menu"); 
		        	 int y = in.nextInt();
		        	 //calling the math methods
		        	 if (y==1)
		        		 func2.length();

		        	 if (y==2)
		        		 func2.compare2();

		        	 if (y==3)
		        		 func2.makeplural();

		        	 if (y==4)
		        		 func2.uppercase();
		        	 
		        	 if (y==5)
		        		 func2.booltostring();
		        	 
		        	 if (y==6)
		        		 func2.substring();
		        	 
		        	 if (y==7)
		        		 func2.testplural();
		        	 
		        	 if (y==8)
		        		 func2.vowelswitcha();
		        	 
		        	 if (y==9)
		        		 func2.objectname(func2);
		        	 
		        	 if (y==10)
		        		 func2.lowercase();
		        	 
		        	 if (y==11)
		        		 break;

			   	 }
			   	if (x==3)
			   		break;
	     }
	}
}