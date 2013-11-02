
import java.util.Scanner;
public class arrays
{
    
    public static int LookUpElement(int[] A, int el)
    {
        
      for(int i=0;i<A.length;i++)
       {
         if (A[i]==el) return 1;
    
        }
        
        return 0;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main (String[] args)
    {
        Scanner in= new Scanner(System.in);
        
        /*getting input from the user*/
        System.out.println("Enter the array length ");
        int len=in.nextInt();
        
        /*declaration of an array and memory allocation*/
        int[] B= new int[len];
        
        /*Filling the array with numbers from the input*/
        System.out.println("Enter the "+len+" elements of the array");
        for(int i=0;i<len;i++)
         B[i]=in.nextInt();
         
         
        System.out.println("Enter the element you want to find in the array");
        int testEl=in.nextInt();
         
        /*finding the given number in the array without the use of function*/
        int flag=0; //indicator variable showing if the element has been found
        for(int i=0;i<len;i++)
        {
            
          if(B[i]==testEl)
          {
            flag=1;
            break;
              
            }
            
        }
        
        if(flag==1)
         System.out.println("Number "+testEl+" is in the array");
        else
         System.out.println("Number "+testEl+" is not in the array");
         
         
        /*the same task but with the use of a function*/
        flag=LookUpElement(B,testEl);
        if(flag==1)
         System.out.println("Number "+testEl+" is in the array");
        else
         System.out.println("Number "+testEl+" is not in the array");
        
        
    }
}
