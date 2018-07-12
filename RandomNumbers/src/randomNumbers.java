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
            RandomLettersGenny();
            RandomLettersWithNumbers();
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

        System.out.println(val);

        String descriptionAndTitle = " ";
        Random ranNumber = new Random();
        int digits = 100000 + (int) (ranNumber.nextFloat() * 899900);
        descriptionAndTitle += String.valueOf(digits);

        System.out.println(" -" + descriptionAndTitle);
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
        System.out.println(result);
    }

    private static void RandomLettersGenny()
    {
      String alphaBeta = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      Random Beta = new Random();
      StringBuilder result = new StringBuilder();
      //Adjusting i<(5) will lessen and increase your
      // length of letters when not using the current input type
      for(int i = 0; i < alphaBeta.length(); i++)
      {
        int RandAlphaBeta =Beta.nextInt(alphaBeta.length());
        result.append(alphaBeta.charAt(RandAlphaBeta));
      }
      System.out.println(result);
    }

    private static void RandomLettersWithNumbers()
    {
      String descriptionAndTitle = " ";
      Random ranNumber = new Random();
      int digits = 100000 + (int) (ranNumber.nextFloat() * 899900);
      descriptionAndTitle += String.valueOf(digits);

      String alphaBeta = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      Random Beta = new Random();
      StringBuilder result = new StringBuilder();

      //Adjusting i<(5) will lessen and increase your
      // length of letters when not using the current input type
      for(int i = 0; i < alphaBeta.length(); i++)
      {
        int RandAlphaBeta =Beta.nextInt(alphaBeta.length());
        result.append(alphaBeta.charAt(RandAlphaBeta));
      }
      System.out.println(result + " - " + descriptionAndTitle);
    }
    private static String RunAgain()
    {
        System.out.println("\n\nWould you like the application to run again?  ");
        String choice=scnr.next();
        return choice;
    }
}
