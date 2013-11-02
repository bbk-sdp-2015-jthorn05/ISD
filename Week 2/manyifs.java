
import java.util.Scanner;
public class manyifs
{
    

    
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        
        int x=in.nextInt();
        if(x>10)
        {
          System.out.println("The number is greater than 10");  
            
        }
        else
        {
         System.out.println("The number is not greater than 10");   
            
        }
        
        
        if(x%2==1)
        {
          System.out.println("This is an odd number");  
            
        }
        else
        {
         System.out.println("This is an even number");   
            
        }
        
        if((x>10)&&(x<20))
        {
          System.out.println("The number is in the range");  
            
        }
        else
        {
         System.out.println("The number is not in the range");   
            
        }
            
            
            
          
        
    }
}
