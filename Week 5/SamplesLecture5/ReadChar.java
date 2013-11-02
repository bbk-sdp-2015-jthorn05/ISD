/**
 * Example of processing text one character at a time.
 * First using Scanner, then using String.
 * @author David Weston
 * @version Autumn 2013
 */

import java.util.Scanner;

public class ReadChar
{
    public static void main(String[] args) 
    {
        int i;
        
        // Scanner version
        Scanner in = new Scanner("United States 303824646");
        in.useDelimiter("");
        
        i = 0;
        while (!Character.isDigit(in.next().charAt(0))) {
            i++; 
        }
        System.out.println(i);
        
        // String version
        String line = "United States 303824646";
        
        i = 0;
        while (!Character.isDigit(line.charAt(i))) {
            i++; 
        }
        System.out.println(i);
        
        // Split the String at location of first found numeric character
        System.out.println(line.substring(0,i));
        System.out.println(line.substring(i));
   }
}
