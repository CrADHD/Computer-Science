import java.util.*;

public class Binary2Base10{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);

		//get new last name
		System.out.print("Enter a Binary Number: ");     // request
		
		String BinNumString = in.nextLine();
		char[] BinNumChar = BinNumString.toCharArray();  // input chars into array
		int PosNums = BinNumChar.length-1;  // Possible Numbers
		double Total = 0;     				  // hold for base 10 nums
		int Exponent = -1;
		char Char=BinNumChar[PosNums];    // request character from array
/*here*/Total=AddBinary(Total, PosNums, Char, Exponent, BinNumChar);
		//int Total=AddArray(Total, PosNums, CharNum, Exponent);
		System.out.println(Total);
		
	}
	
	public static int AddBinary(double Total, int PosNums, char Char, int Exponent, char[] BinNumChar){
		
		if(PosNums<0){
			return 0;
		}
		Char=BinNumChar[PosNums];
		PosNums--;
		Exponent++;
		if(Char=='0'){
			Total=0.0;
			return (int) (Total+AddBinary(Total, PosNums, Char, Exponent, BinNumChar));
		}
		if(Char=='1'){
			Total=Math.pow(2.0, Exponent);
			return (int) (Total+AddBinary(Total, PosNums, Char, Exponent, BinNumChar));
		}
		else{
			return 0;
		}
	}

	
public static int AddArray(int total, int PosNums, int CharNum, int Exponent){
		
	//	CharNum=BinNumChar.getNumericValue(PosNums);
		Exponent++;
		PosNums--;
		CharNum--;
		
		if(PosNums<0){
			return 0;
		}
		if(CharNum==0){;
			return total+AddArray(1, PosNums, CharNum, Exponent);
		}
		if(CharNum==1){
			total=CharNum^Exponent;
			return total+AddArray(1, PosNums, CharNum, Exponent);
		}
		else{
			return total;
		}
		
	}
	
}