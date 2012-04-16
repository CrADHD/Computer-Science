import java.util.*;



public class SAT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double points = 0;			// int for eventual points
		double total = 15;			// int for eventual points/total
		double percent = 0;			// int for eventual percentage
		
		System.out.println("Would you like to play a game? type 1 ");
		System.out.println("for yes. Of course no matter what you ");
		System.out.println(	"WILL take this test...");
		System.out.println(	"");
		System.out.println(	"If you answer a Q correctly you get 1 point");
		System.out.println(	"If you answer incorrectly you get -0.25 point");
		int WC = in.nextInt();		// WC = Who Cares / Does not matter
		
			int ans1 = Q1(WC);   // println requests
			int input1 = in.nextInt();	   // user answer
			points = AnsCheck(ans1, input1, points);
			
			int ans2 = Q2(WC);   // println requests
			int input2 = in.nextInt();	   // user answer
			points = AnsCheck(ans2, input2, points);
			System.out.println(points);
			
			int ans3 = Q3(WC);   // println requests
			int input3 = in.nextInt();	   // user answer
			points = AnsCheck(ans3, input3, points);
			
			
			int ans4 = Q4(WC);   // println requests
			int input4 = in.nextInt();	   // user answer
			points = AnsCheck(ans4, input4, points);
			
			
			int ans5 = Q5(WC);   // println requests
			int input5 = in.nextInt();	   // user answer
			points = AnsCheck(ans5, input5, points);
			
			
			int ans6 = Q6(WC);   // println requests
			int input6 = in.nextInt();	   // user answer
			points = AnsCheck(ans6, input6, points);

			
			int ans7 = Q7(WC);   // println requests
			int input7 = in.nextInt();	   // user answer
			points = AnsCheck(ans7, input7, points);
			
			
			int ans8 = Q8(WC);   // println requests
			int input8 = in.nextInt();	   // user answer
			points = AnsCheck(ans8, input8, points);
			
			
			int ans9 = Q9(WC);   // println requests
			int input9 = in.nextInt();	   // user answer
			points = AnsCheck(ans9, input9, points);
				
			
			int ans10 = Q10(WC);   // println requests
			int input10 = in.nextInt();	   // user answer
			points = AnsCheck(ans10, input10, points);
			
			
			int ans11 = Q11(WC);   // println requests
			int input11 = in.nextInt();	   // user answer
			points = AnsCheck(ans11, input11, points);
			
			
			int ans12 = Q12(WC);   // println requests
			int input12 = in.nextInt();	   // user answer
			points = AnsCheck(ans12, input12, points);
			
			
			int ans13 = Q13(WC);   // println requests
			int input13 = in.nextInt();	   // user answer
			points = AnsCheck(ans13, input13, points);
			
			
			int ans14 = Q14(WC);   // println requests
			int input14 = in.nextInt();	   // user answer
			points = AnsCheck(ans14, input14, points);
			
			
			int ans15 = Q15(WC);   // println requests
			int input15 = in.nextInt();	   // user answer
			points = AnsCheck(ans15, input15, points);
			
			
			percent = points/total;
			
			if(points==total){

				System.out.println("__        _____ _   _ _   _ _____ ____  _ ");
				System.out.println("L L      J J_ _| L | | L | | ____|  _ L| |");
				System.out.println(" L L JL J J | ||  L| |  L| |  _| | |_) | |");
				System.out.println("  L V  V J  | || |L  | |L  | |___|  _ <|_|");
				System.out.println("   L_JL_J  |___|_| L_|_| L_|_____|_| L_(_)");
				
			}
		
			if(points!=total){

				System.out.println("You got " + points + "out of" + total);
				System.out.println("your percentage is" + percent);
			}
	}	
	
	
	public static double AnsCheck(int ans, int input, double points){   // checks input vs ans
		
		if(ans==input){
			points = points + 1;						// for correct scores
		}
	
		if(ans!=input){
			points = points - 0.25;						// for incorrect scores
		}
		
		return points;
		
	}
		
	public static int Q1(int WC){
		
		System.out.println("Q1: Choose the word or set of words that,");		// Question 1
		System.out.println("when inserted in the sentence, best ");
		System.out.println("fits the meaning of the sentence as a whole.");
		System.out.println("Ms. Fergusson�s main criticism of the artist�s ");
		System.out.println("rendering of the ancient mammal�s physical ");
		System.out.println("appearance is that, unsupported by even a ------- ");
		System.out.println("of fossil evidence, the image is bound to be ------- .");
		System.out.println("");
		System.out.println("1. modicum . . speculative");
		System.out.println("2. particle . . supplemented");
		System.out.println("3. perusal . . substantiated");
		System.out.println("4. fabrication . . obsolete");
		System.out.println("5. recapitulation . . exhausted");
		
		int ans = 1;
		return ans;
		
	}

	public static int Q2(int WC){				// Question 2
		
		System.out.println("Q2: A woman drove to work at an average speed ");
		System.out.println("of  miles per hour and returned along the ");
		System.out.println("same route at  miles per hour. If her total ");
		System.out.println("traveling time was  hour, what was the total ");
		System.out.println("number of miles in the round trip?");
		System.out.println("");
		System.out.println("1. 30");
		System.out.println("2. 30 1/7");
		System.out.println("3. 34 2/7");
		System.out.println("4. 35");
		System.out.println("5. 40");
		
		int ans = 3;
		return ans;
		
	}
	
	public static int Q3(int WC){				// Question 3
		
		System.out.println("Q3: When, in 1864, a factory established by ");
		System.out.println("Alfred Nobel to manufacture nitroglycerin ");
		System.out.println("blew up, the scientist discovered that the ");
		System.out.println("explosive was as ------- as it was powerful,");
		System.out.println("------- to detonate without warning.");
		System.out.println("");
		System.out.println("1. dormant . . ready");
		System.out.println("2. fickle . . unlikely");
		System.out.println("3. volatile . . liable");
		System.out.println("4. unprecedented . . intended");
		System.out.println("5. inactive . . designed");
		
		int ans = 3;
		return ans;
		
	}
	
	
	public static int Q4(int WC){				// Question 4
		
		System.out.println("Q4: Refuting the claim that the surest way ");
		System.out.println("to reduce anger is to express it, the ");
		System.out.println("author asserts that ------- anger can ");
		System.out.println("actually increase its ------- .");
		System.out.println("");
		System.out.println("1. denying . . impact");
		System.out.println("2. understanding . . importance");
		System.out.println("3. overcoming . . likelihood");
		System.out.println("4. venting . . intensity");
		System.out.println("5. voicing . . benefits");

		int ans = 4;
		return ans;
		
	}
	
	public static int Q5(int WC){				// Question 5
		
		System.out.println("Q5: In the xy-plane, the graph of the equation ");
		System.out.println("above assumes its maximum value at . ");
		System.out.println("What is the value of b?");
		System.out.println("y=-2x^2+bx+5");
		System.out.println("");
		System.out.println("1. �8");
		System.out.println("2. -4");
		System.out.println("3. 4");
		System.out.println("4. 8");
		System.out.println("5. 10");

		int ans = 4;
		return ans;
		
	}
	
	public static int Q6(int WC){				// Question 6
		
		System.out.println("Q6: Because catching Alaskan snow crabs is such ");
		System.out.println("an ----- and dangerous process, they are sold in ");
		System.out.println("supermarkets at ----- prices.");
		System.out.println("");
		System.out.println("1. imaginative . . different");
		System.out.println("2. unpopular . . unpredictable");
		System.out.println("3. arduous . . exorbitant");
		System.out.println("4. amicable . . preposterous");
		System.out.println("5. unreliable . . reasonable");

		int ans = 3;
		return ans;
		
	}
	
	public static int Q7(int WC){				// Question 7
		
		System.out.println("Q7: His ----- nature allowed him to see the bright ");
		System.out.println("side of a situation, even when very few others could.");
		System.out.println("");
		System.out.println("1. pessimistic");    
		System.out.println("2. humane");
		System.out.println("3. original");
		System.out.println("4. biological");
		System.out.println("5. optimistic");

		int ans = 5;
		return ans;
		
	}
	
	public static int Q8(int WC){				// Question 8
		
		System.out.println("Q8:  Before they ----- for their camping trip on ");
		System.out.println("Friday, they went to the mall to purchase some ----- ");
		System.out.println("including insect repellent and a flint.");
		System.out.println("");
		System.out.println("1. arrived . . supplies");
		System.out.println("2. planned . . considerations");
		System.out.println("3. wished . . needs");
		System.out.println("4. departed . . provisions ");
		System.out.println("5.  agreed . . rights");

		int ans = 4;
		return ans;
		
	}
	
	public static int Q9(int WC){				// Question 9
		
		System.out.println("Q9: A piggy bank contains 300 pennies, 45 nickels, ");
		System.out.println("and 132 quarters. If the number of pennies is reduced ");
		System.out.println("by 50% and the number of quarters is increased by 25%, ");
		System.out.println("what is the probability that a randomly drawn coin");
		System.out.println("will be a nickel?");
		System.out.println("");
		System.out.println("1. 45 in 477");
		System.out.println("2. 1 in 8");
		System.out.println("3. 45 in 315");
		System.out.println("4. 1 in 4");
		System.out.println("5. 45 in 432");

		int ans = 2;
		return ans;
		
	}
	
	public static int Q10(int WC){				// Question 10
		
		System.out.println("Q10: Which of the following represents the greatest value?");
		System.out.println("");
		System.out.println("1.  2 more than the square root of 25");
		System.out.println("2. 15% of 60");
		System.out.println("3. 20/1.4");
		System.out.println("4. 3^2");
		System.out.println("5. 3 * the product of the smallest two odd numbers");

		int ans = 3;
		return ans;
		
	}
	
	public static int Q11(int WC){				// Question 11
		
		System.out.println("Q11: If 5x = 1 and y/2 = 3, 2x * y =");
		System.out.println("");
		System.out.println("1. 2");
		System.out.println("2. 2.4");
		System.out.println("3. 3.1");
		System.out.println("4. 4.3");
		System.out.println("5. 5.2");

		int ans = 2;
		return ans;
		
	}
	
	public static int Q12(int WC){				// Question 12
		
		System.out.println("Q12: |6 � 16y| =2");
		System.out.println("|14 � 8y|=10");
        System.out.println("Which value of y can satisfy both equations?");
		System.out.println("");
		System.out.println("1. 8");
		System.out.println("2. 12/5");
		System.out.println("3. 3/4");
		System.out.println("4. 1/2");
		System.out.println("5. 7/8");

		int ans = 4;
		return ans;
		
	}
	
	public static int Q13(int WC){				// Question 13
		
		System.out.println("Q13: If (a-b)^2 = (a+b)^2, what is the value of ab?");
		System.out.println("");
		System.out.println("1. -4");
		System.out.println("2. -2");
		System.out.println("3. 0");
		System.out.println("4. 1");
		System.out.println("5. 4");

		int ans = 3;
		return ans;
		
	}
	
	public static int Q14(int WC){				// Question 14
		
		System.out.println("Q14: How many numbers less than 1000 are divisble by 3?");
		System.out.println("");
		System.out.println("1. 300");
		System.out.println("2. 310");
		System.out.println("3. 311");
		System.out.println("4. 333");
		System.out.println("5. 500");

		int ans = 4;
		return ans;
		
	}
	
	public static int Q15(int WC){				// Question 15
		
		System.out.println("Q4: If a^b = c^d, which of the following is not necessarily true?");
		System.out.println("");
		System.out.println("1. a^b - c^d = 0");
		System.out.println("2. a^b + c^d = 2 * (a^b)");
		System.out.println("3. (a^b)/(c^d) = 1");
		System.out.println("4. a=c");
		System.out.println("5. a^b * c^d = a^(2*b)");

		int ans = 4;
		return ans;
		
	}
}
