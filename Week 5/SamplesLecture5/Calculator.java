/**
 * Example of using exception handling. 
 * It uses the fact that division by zero is undefined.
 * 
 * @author David Weston
 * @version Autumn 2013
 */
public class Calculator
{
    public static void main(String[] args) {      
        DivideIntegers(6,1);
        System.out.println("Next Calculation");
        DivideIntegers(6,0);
    }

    private static void DivideIntegers(int a, int b) {      
        try {
            System.out.println("a / b = " + a/b); 
            System.out.println("Success!");
        }   
         catch (ArithmeticException exception){
            System.out.println("Division Failed"); 
        }

    }
}
