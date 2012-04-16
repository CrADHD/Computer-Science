
public class counting2to100 {
	public static void main(String[] args) throws Exception
    {

        //print recursive from start to end
        print_recursive(2,100);
        try
        {
               Thread.currentThread();
               //pause for 2000  = 2 seconds
               Thread.sleep(2000);
        }
        catch(InterruptedException ie){}
        
        System.out.print("\n");
        print_recursive2(3,99);
     
    }
    
    //print recursive from start to end
    public static void print_recursive(int start, int end)
    {
        if(end - start == 0)
        {
            //print last value
            System.out.println(end);
        }
        else
        {    
            //print current value
            System.out.println(start);
            
            //increase value by 1
            start=start+2;
            
            //print next value
            print_recursive(start, end);
        }
    }
    
    //find the sum 
    public static void print_recursive2(int start, int end)
    {
        if(start - end == 0)
        {
            //return last value
        	System.out.println(end);
        }
        else
        {    
        	 //print current value
            System.out.println(start);
            
            //increase value by 1
            start=start+3;
            
            //print next value
            print_recursive2(start, end);
        }
    }    
}
