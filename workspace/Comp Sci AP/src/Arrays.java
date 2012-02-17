import java.util.Scanner;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("How many numbers would you like to input?");
		Scanner in = new Scanner(System.in);
		int array_num = in.nextInt();
		int nums[];								// Vars
		nums = new int[array_num];
		
		
		for(int i=0; i<nums.length; i=i+1){
			
			System.out.println("Enter a number:");
			//request integer
			nums[i] = in.nextInt();

		}
		
	    	//print array
	    	System.out.println("Printing array:");
 		
	    	
	    for(int i=0; i < nums.length; i++)
 		{
 			System.out.println(nums[i]);
 		}
 		
 		boolean unsorted = true;
 		int hold;
 		
 		//start loop
 		while ( unsorted )
 		{
 			unsorted = false;
 			
		for(int i=0; i < (nums.length-1); i=i+1)
			{
				//if current is greater than next
				//then swap
				if(nums[i] > nums[i+1])
				{
					//swap current and next
					hold = nums[i];
			    		nums[i] = nums[i+1];
			    		nums[i+1] = hold;
			    	
			    		//we will set unsorted true
			    		//so we can do another check
			    		unsorted = true;
				}
				
			}
 		}
		System.out.println("Printing sorted array:");
 		for(int j=0; j < nums.length; j=j+1)
 		{
 			System.out.println(nums[j]);
 		}

			int numtotal = 0;
			int nummedian = 0;
			
 		for(int i=0; i < (nums.length-1); i=i+1){
 			
 			numtotal= numtotal + nums[i];
 			
 		}
 		int num0=0;
 		int num1=0;
 		int num2=0;
 		int num3=0;
 		int num4=0;
 		int num5=0;
 		int num6=0;
 		int num7=0;
 		int num8=0;
 		int num9=0;
 		
 		for(int i=0; i < (nums.length-1); i=i+1){

 			if(i==0){
 				num0 += 1;
 			}
 			if(i==1){
 				num1 += 1;
 			}
 			if(i==2){
 				num2 += 1;
 			}
 			if(i==3){
 				num3 += 1;
 			}
 			if(i==4){
 				num4 += 1;
 			}
 			if(i==5){
 				num5 += 1;
 			}
 			if(i==6){
 				num6 += 1;
 			}
 			if(i==7){
 				num7 += 1;
 			}
 			if(i==8){
 				num8 += 1;
 			}
 			if(i==9){
 				num9 += 1;
 			}
 			
 		}
 		
 			int numnum[]=new int[10];
 			while ( unsorted )
 	 		{
 	 			unsorted = false;
 	 			
 			for(int i=0; i < (numnum.length-1); i=i+1)
 				{
 					//if current is greater than next
 					//then swap
 					if(numnum[i] > numnum[i+1])
 					{
 						//swap current and next
 						int holdnum = numnum[i];
 				    		numnum[i] = numnum[i+1];
 				    		numnum[i+1] = holdnum;
 				    	
 				    		//we will set unsorted true
 				    		//so we can do another check
 				    		unsorted = true;
 					}
 					
 				}
 	 		}
 			int array_num_div = array_num / 2;
			int numave=  numtotal/ array_num;
			nummedian = nums[array_num_div];
			System.out.println("Printing array average");
			System.out.println(numave);
			System.out.println("Printing array median");
			System.out.println(nummedian);
			System.out.println("Printing array mode, if 0 then more than 1 mode");
			System.out.println(numnum[0]);
	}

}
