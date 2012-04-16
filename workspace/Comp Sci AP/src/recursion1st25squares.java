
public class recursion1st25squares {
	public static void main(String[] args) throws Exception
    {

        //print recursive from start to end
        print_recursive(1,25);
        
     
    }
    
    //print recursive from start to end
    public static void print_recursive(int start, int end)
    {
        if(end - start == 0)
        {
            //print last value
            System.out.println(end*end);
        }
        else
        {    
            //print current value
            System.out.println(start*start);
            
            //increase value by 1
            start=start+1;
            
            //print next value
            print_recursive(start, end);
        }
    }
}
