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

        for(int i =1; i <= control; i++)
        {
            RandomGenny();
        }
    }

    private static void RandomGenny()
    {
        String val =" ";
        Random ranInt = new Random();
        int numbers = 100000 + (int)(ranInt.nextFloat() * 899900);
        val += String.valueOf(numbers);

        System.out.println("\n"+val);
    }
}
