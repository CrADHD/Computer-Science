
public class recursion99to3 {
	public static void main(String[] args) throws Exception
    {

        //print recursive from start to end
        print_recursive(99,3);
        
     
    }
    
    //print recursive from start to end
    public static void print_recursive(int start, int end)
    {
        if(start-end == 0)
        {
            //print last value
            System.out.println(end);
        }
        else
        {    
            //print current value
            System.out.println(start);
            
            //increase value by 1
            start=start-3;
            
            //print next value
            print_recursive(start, end);
        }
    }
}
