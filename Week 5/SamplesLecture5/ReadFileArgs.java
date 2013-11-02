import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileArgs
{
   
    public static void main(String[] args) throws FileNotFoundException 
    {
        
        if (args.length>0) {
            File inputFile = new File(args[0]);
            Scanner in = new Scanner(inputFile);
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
            }
       
    }

}