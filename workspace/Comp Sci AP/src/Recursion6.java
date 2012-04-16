import java.util.Scanner;

public class Recursion6 {

	public static void main(String[] args) {
		
		System.out.println("Choose how many digits of the Fibonacho sequaence you want to print.");
		Scanner in = new Scanner(System.in);
		int count=in.nextInt();     // request nums
		int x=1;
		int xp=0;
		Fibo(x,xp, count);   // call Fibo
	}	
	
	public static int Fibo(int x, int xp, int count){
		if(count==0){
			return 0;
		}	
		else{
			count=count-1;
			System.out.println(x);
			Fibo(x+xp, x, count);   // call back
		}
		return 0;
		
	}
}
