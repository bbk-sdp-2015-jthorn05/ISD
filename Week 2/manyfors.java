
import java.util.Scanner;
public class manyfors
{
    
   
    public static void main (String args[])
    {
        Scanner in= new Scanner(System.in);
        
        /*reading the number of elements*/
        int numel=in.nextInt();
        
        /*Initialization of the sum*/
        int S=0;
        for(int i=0;i<numel;i++)
        {
            
          int curel=in.nextInt();
          S=S+curel;
            
        }    
       
        System.out.println("The sum of element is "+S);
        
        
        String TeacherName="igor ";
        String TeacherSurname="razgon";
        String NameSurname=TeacherName+TeacherSurname;
        
        for(int i=0;i<NameSurname.length();i++)
        {
         char c;
         c=NameSurname.charAt(i);
         if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
            System.out.println(c);
            
        }
    }
}
