/**
 * Example of reading in a text file, one line at a time.
 * 
 * @author David Weston
 * @version Autumn 2013
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
   
    public static void main(String[] args) throws FileNotFoundException 
    {
        File inputFile = new File("input.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();
    }

}
