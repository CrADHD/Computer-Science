import java.util.*;

public class Recursion7 {

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int start = in.nextInt();
		System.out.println("Enter a higher number");     // request nums
		int end = in.nextInt();
		print_recursive(start,end);
		int sum = sumof(end);
		System.out.println("The sum is: " + sum);
	}
	
	//print recursive from start to end
	public static void print_recursive(int start, int end)
	{
		if(end - start == 0)
		{
			System.out.println(end);
		}
		else
		{	
			System.out.println(start);
			start++;
			print_recursive(start, end);   // call back
		}
	}
	
	//find the sum op
	public static int sumof(int end)
	{
		if(end == 1)
		{
			return 1;
		}
		else
		{
			int oneless = end-1;
			return end + sumof(oneless);   // call back
		}
	}	
	
}