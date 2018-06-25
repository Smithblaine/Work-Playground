import java.util.Random;
import java.util.Scanner;
public class randomNumbers
{
    public static void main(String[] args)
    {
        Greeting();
        do
        {
            String Alpha=Name();
            RandomNumGenny();
            RandomLetterGenny(Alpha);
        }while(("yes").equalsIgnoreCase(RunAgain()));
    }

    public static Scanner scnr = new Scanner(System.in);
    private static void Greeting()
    {
        System.out.println("Generate 6 digit random numbers\nSelect a number of ho many time you want the app to run to see the different numbers.\n");
    }

    private static String Name()
    {
        System.out.print("Enter your name with out spaces:  ");
        String Alpha = scnr.next();
        System.out.println();
        return Alpha;
    }

    private static void RandomNumGenny()
    {
        String val=" ";
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

        //Adjusting i<(5) will lessen and increase your
        // length of letters when not using the current input type
        for(int i = 0; i < Alpha.length(); i++)
        {
            int RandAlphaBeta =Beta.nextInt(Alpha.length());
            result.append(Alpha.charAt(RandAlphaBeta));
        }
        System.out.print(result);
    }

    private static String RunAgain()
    {
        System.out.println("\n\nWould you like the application to run again?  ");
        String choice =scnr.next();
        return choice;
    }
}
