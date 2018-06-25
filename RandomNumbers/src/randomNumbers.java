import java.util.Random;
import java.util.Scanner;
public class randomNumbers
{
    public static void main(String[] args)
    {
        Greeting();
        LoopControl();
    }

    public static Scanner scnr = new Scanner(System.in);
    private static void Greeting()
    {
        System.out.println("Generate 6 digit random numbers\nSelect a number of ho many time you want the app to run to see the different numbers.\n");
    }

    private static void LoopControl()
    {
        System.out.print("Select how many times you want a new random number:  ");
        int control = scnr.nextInt();
        System.out.print("Enter your name:  ");
        String Alpha = scnr.next();
        System.out.println();
        for(int i =1; i <= control; i++)
        {
           RandomNumGenny();
           RandomLetterGenny(Alpha);
           System.out.println();
        }
    }

    private static void RandomNumGenny()
    {
        String val =" ";
        Random ranInt = new Random();
        int numbers = 100000 + (int)(ranInt.nextFloat() * 899900);
        val += String.valueOf(numbers);

        System.out.print(val);
    }

    private static void RandomLetterGenny(String Alpha)
    {
//        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random Beta = new Random();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < 5; i++)      //Adjusting i<(5) will lessen and increase your length of letters
        {
            int RandAlphaBeta =Beta.nextInt(Alpha.length());
            result.append(Alpha.charAt(RandAlphaBeta));
        }
        System.out.print(result);
    }
}
