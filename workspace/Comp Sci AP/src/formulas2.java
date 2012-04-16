import java.util.Scanner;
// class for math functions
class mathformulas
{
		public double Square(double input_x)
		{
		double output_x = input_x * input_x;
		return output_x;
		
		}

		public double Multiply(double input_x, double input_y)
		{
			
			double output_x = input_x * input_y;
			return output_x;

		}
		
		public double Divide(double input_x, double input_y)
		{
			
			double output_x = input_x / input_y;
			return output_x;

		}
		
		public double Cube(double input_x)
		{
			
			double output_x = java.lang.Math.pow (input_x, 3);
			return output_x;

		}
		//add two numbers
		public double Add2(double input_x, double input_y)
		{
			
			double sub_a = input_x+input_y; 
			return sub_a;

		}
}
class physicsformulas
{
		public double VelocityF(double Vi, double Time){
			
			double output_x = Vi - 9.81*Time;
			return output_x;
	
		}
	
		public double VelocityI(double Vf, double Time){
			
			double sub_a = -9.81*Time;
			double output_x = Vf-sub_a;
			return output_x;
	
		}
		
		public double Acceleration(double Vf, double Vi, double Time){
			
			double sub_a = Vf-Vi;
			double output_x = sub_a/Time;
			return output_x;
	
		}
		
		public double Weight(double Mass){
			
			double output_x = Mass*9.81;
			return output_x;
	
		}
		
		public double hAcc(double input_x){
			
			double output_x = 0;
			return output_x;
	
		}
		
		public double wat(double input_11){
			
			double output_meep = java.lang.Math.pow (input_11, 999999999);
			return output_meep;
			
		}
	  
}
public class formulas2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			
		Scanner in = new Scanner(System.in);
		System.out.println("Which library would you like to use? Type 1 for math or 2 for physics");
		int whichLibrary = in.nextInt();
		if(whichLibrary==1)
		{
			System.out.println("Which function would you like to use?");
			System.out.println("1. Find the square of a number.");
			System.out.println("2. Find the cube of a number");
			System.out.println("3. Multiply two numbers");
			System.out.println("4. Divide two numbers");
			System.out.println("5. Add two numbers");
		}

		if(whichLibrary==2)
		{
			System.out.println("All physics equations assume no air resistance!");
			System.out.println("Which function would you like to use?");
			System.out.println("1. Find the final velocity of an object using it's innitial velocity and time");
			System.out.println("2. Find the innitial velocity of an object using it's final velocity and time");
			System.out.println("3. Find the acceleration of an object using innitial and final velocity and time");
			System.out.println("4. Find the weight of an object using it's mass");
			System.out.println("5. Find the horizontal acceleration of any object");
		}
		       // probably not necessary but you could make this a new class to keep the program a bit more clean
		int which = in.nextInt();
		while(whichLibrary<6 && whichLibrary>0)
		{
			
			mathformulas f1 = new mathformulas ();
			if(which==1)
			{
				// Square
				System.out.println("Enter a number");
				double input_1 = in.nextDouble();
				//call square formula
				double output = f1.Square(input_1);
				System.out.println("The double is " + output);
				// comp
			}
			if(which==2)
			{
				// Cube
				System.out.println("Enter a number");
				double input_2 = in.nextDouble();
				//call cube formula
				double output = f1.Cube(input_2);
				System.out.println("The cube is " + output);
				// comp
			}
			if(which==3)
			{
				// X*Y
				System.out.println("Enter a number");
				double input_3a = in.nextDouble();
				System.out.println("Enter another number");
				double input_3b = in.nextDouble();
				//call multiply formula
				double output = f1.Multiply(input_3a, input_3b);
				System.out.println("The product is " + output);
				
			}
			if(which==4)
			{
				// X/Y
				System.out.println("Enter a number");
				double input_4a = in.nextDouble();
				System.out.println("Enter the number to divide by");
				double input_4b = in.nextDouble();
				//call division formula
				double output = f1.Divide(input_4a, input_4b);
				System.out.println("The quotient is " + output);
				
			}
			if(which==5)
			{
				// Addition
				System.out.println("Enter a number");
				double input_5a = in.nextDouble();
				System.out.println("Enter another number");
				double input_5b = in.nextDouble();
				//call add 2 formula
				double output = f1.Add2(input_5a, input_5b);
				System.out.println("The answer is " + output);
				
			}
			
			else
			{

				System.out.println("I Liek Chocolate Milk");
				
			}
			System.out.println("Would you like to use the same formula again?");
			System.out.println("1.Yes");
			System.out.println("2.No");
			int x = in.nextInt();
			if (x==2)
			{
				break;
			}
		}
		//physics
		
		while(whichLibrary>5)
		{
			physicsformulas f2 = new physicsformulas();
			if(which==1)
			{
				// Vf
				System.out.println("Enter Vi");
				double input_6a = in.nextDouble();
				System.out.println("Enter time");
				double input_6b = in.nextDouble();
				double output = f2.VelocityF(input_6a, input_6b);
				System.out.println("The answer is " + output);
				
			}
			if(which==2)
			{
				// Vi
				System.out.println("Enter Vf");
				double input_7a = in.nextDouble();
				System.out.println("Enter time");
				double input_7b = in.nextDouble();
				double output = f2.VelocityI(input_7a, input_7b);
				System.out.println("The answer is " + output);
				
			}
			if(which==3)
			{
				// Acceleration
				System.out.println("Enter Vf");
				double input_8a = in.nextDouble();
				System.out.println("Enter Vi");
				double input_8b = in.nextDouble();
				System.out.println("Enter time");
				double input_8c = in.nextDouble();
				double output = f2.Acceleration(input_8a, input_8b, input_8c);
				System.out.println("The answer is " + output);
				
			}
			if(which==4)
			{
				// Weight
				System.out.println("Enter Mass");
				double input_9 = in.nextDouble();
				double output = f2.Weight(input_9);
				System.out.println("The answer is " + output);
				
			}
			if(which==5)
			{
				// Horizontal accel
				System.out.println("Enter a number");
				double input_10 = in.nextDouble();
				double output = f2.hAcc(input_10);
				System.out.println("The answer is always " + output);
				System.out.println("Without air resistance an object will never have horizontal acceleration");
				
			}
			
			else
			{

				System.out.println("I Liek Chocolate Milk");
				
			}
			System.out.println("Would you like to use the same formula again?");
			System.out.println("1.Yes");
			System.out.println("2.No");
			int x = in.nextInt();
			if (x==2)
			{
				break;
			}
		}
		}
	} // End Main
	                    
	
	
	
	
}  

