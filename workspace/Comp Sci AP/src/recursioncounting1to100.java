

public class recursioncounting1to100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
    {
       
        //print recursive from start to end
        print_recursive(1,100);
        
    }
    
    //print recursive from start to end
    public static void print_recursive(int start, int end)
    {
        if(end - start == 0)
        {
            //print final value
            System.out.println(end);
        }
        else
        {    
            //print current value
            System.out.println(start);
            
            //increase value by 1
            start++;
            
            //print next value
            print_recursive(start, end);
        }
    }
        

}
