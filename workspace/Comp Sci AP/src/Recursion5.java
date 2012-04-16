public class Recursion5 {

	public static void main(String[] args) {
		
		int counter=1;
		while(counter<6){
			
			int sum=factorial(counter);
			System.out.println(sum);   // call function
			counter=counter+1;         // change counter
			
		}
	}	
	
	public static int factorial(int y){
		
		if(y==1){
			return 1;
		}
		else{
			int oneless=y-1;
			return y*factorial(oneless);   // call back
		}
		
	}
}
