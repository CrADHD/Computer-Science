import java.util.ArrayList;
import java.util.Scanner;

class value
{
	int newvalue;
	/**
	 * Constructor
	 * @param define value
	 */
	public value(int newvalue)
	{
		//define variable
		this.newvalue = newvalue;

}}
class sort
{	
	//declare variables
	public ArrayList<value> numbers;
	public sort(ArrayList<value> numbers)
	{
		this.numbers = numbers;
	}
	
	/**
	 * Prints the numbers
	 */
	public void printmath()
	{
		for(value avalue: this.numbers)
		{
			System.out.println(avalue.newvalue);
}}
	
	/**
	 * bubble sort, least to greatest
	 */
	public void bubblesort()
	{
		for(int i=0; i < (this.numbers.size()-1); i++)
		{
			//if next element is less than current then swap
			if( this.numbers.get(i+1).newvalue < this.numbers.get(i).newvalue)
			{
				//swap
				value hold = this.numbers.get(i);
				this.numbers.set(i, this.numbers.get(i+1));
				this.numbers.set(i+1, hold);
				
				//if a swap happens subtract i by 1
				i=-1;
}}
		System.out.println("\nSort\n");
}
	
	/**
	 * selection sort, least to greatest
	 */
	public void selectionsort()
	{
		for(int i=0; i < (this.numbers.size()); i++)
		{
			for (int j=i+1; j <this.numbers.size(); j++)
			{
				//if next value is less, make first value
				if( this.numbers.get(j).newvalue < this.numbers.get(i).newvalue)
				{
					//swap
					value hold = this.numbers.get(i);
					this.numbers.set(i, this.numbers.get(j));
					this.numbers.set(j, hold);
					
}}}
		System.out.println("\nSort\n");
}
	
	/**
	 * selection sort, least to greatest
	 */
	public void insertionsort()
	{
		for(int i=0; i < (this.numbers.size()); i++)
		{
			for (int j=0; j < i; j++)
			{
				//if next j value is greater than i, put i before j
				if( this.numbers.get(j).newvalue > this.numbers.get(i).newvalue)
				{
					//swap, push all values forward
					for (int k=j; k<i; k++)
					{
						value hold = this.numbers.get(i);
						this.numbers.set(i, this.numbers.get(k));
						this.numbers.set(k, hold);
}}}}
		System.out.println("\nSort\n");
}
	
	/**
	 * merge sort, least to greatest
	 */
	public void mergesort()
	{
			//split into groups,
			int a = this.numbers.size()/2;
			int b = this.numbers.size() - a;
			int c = b + 1;
			int d = this.numbers.size();
			//sort
			if (this.numbers.get(a).newvalue > this.numbers.get(0).newvalue)
			{
				value hold = this.numbers.get(0);
				this.numbers.set(0, this.numbers.get(a));
				this.numbers.set(0, hold);
			}
			if (this.numbers.get(b).newvalue > this.numbers.get(b).newvalue)
			{
				value hold = this.numbers.get(b);
				this.numbers.set(b, this.numbers.get(b));
				this.numbers.set(b, hold);
			}
			if (this.numbers.get(c).newvalue > this.numbers.get(d).newvalue)
			{
				value hold = this.numbers.get(d);
				this.numbers.set(d, this.numbers.get(c));
				this.numbers.set(c, hold);
}}}

public class ArraySortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<value> numbers = new ArrayList<value>();
		for (int i = 1; i < 11; i++)
   	    {
   	    	numbers.add(new value((int)(Math.random()*100)));
   	    }
		System.out.println("Which sorting method would you like to use?");
	   	System.out.println("1.Bubble Sort");
	   	System.out.println("2.Selection Sort");
	   	System.out.println("3.Insertion Sort");
	   	System.out.println("4.Merge sort");
   	    System.out.println("5.Create an ArrayList of 10 random integers from 1 to 100");
   	    sort num = new sort(numbers);
   	    int x = in.nextInt();
   	    if (x==1)
   	    {
   	    	num.printmath();
   	    	num.bubblesort();
   	    	num.printmath();
   	    }
   	    if (x==2)
   	    {
   	    	num.printmath();
   	    	num.selectionsort();
   	    	num.printmath();
   	    }
   	    if (x==3)
	    {
	    	num.printmath();
	    	num.insertionsort();
	    	num.printmath();
	    }
   	    if (x==4)
   	    {
   	    	num.printmath();
	    	num.mergesort();
	    	num.printmath();
}}}