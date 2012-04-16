import java.util.*;

class bankAccount1{                      // I've done 2, 3, 4 and 5. Have fun with 1 and 6!
	Scanner in = new Scanner(System.in);
	
	public double balance;
	public String name;
	
	public static String bankName = "Totally Not Corrupt Bank";  // Wonderful name, isn't it?
	
	public bankAccount1(){                    // Bank info constructors
		balance = 0;
		name = "Anonymous";
	}
	
	public bankAccount1(Double newBalance, String newName){
		balance = newBalance;
		name = newName;
	}
	
	public void printInfo(){                  // Acquirement and reading of account info
		System.out.println(bankName);
		System.out.println(name);
		System.out.println(balance);
	}
	
	public void printName(){                  // Acquirement and reading of account info
		System.out.println(name);
	}
	
	public void printInfo(String words){
		System.out.println(words);
		this.printInfo();
	}
	
	public void bankAdd(Double newBalance){       // Addition and subtraction of funds
		System.out.println("Enter amount to add");
		int amount = in.nextInt();
		balance += amount;
	}
	public void bankSub(Double newBalance){
		System.out.println("Enter amount to add");
		int amount = in.nextInt();
		balance += amount;
	}
	
}

public class BankAccount{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		bankAccount1[] customers = new bankAccount1[3];
		customers[0] = new bankAccount1(10.00, "Cameron Smith");
		customers[1] = new bankAccount1(10.00, "Kyle Gonsalves");
		customers[2] = new bankAccount1(10.00, "Mike Young");

		System.out.println("Which customer would you like to view?");
		
		for(bankAccount1 custObj : customers   )
		{
			custObj.printName();
		}
		
		int Which = in.nextInt();
		int CustNum;
		
		switch (Which) {
        case 1:  CustNum = 0;  // sets var to array num for reference in individual menu
                 break;
        case 2:  CustNum = 1;
                 break;
        case 3:  CustNum = 2;
                 break;
        default: CustNum = 3;
        System.out.println(CustNum);
	}
  }
}