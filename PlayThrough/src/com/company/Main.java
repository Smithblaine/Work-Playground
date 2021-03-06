package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Greeting();
        do
        {
            double numberOne =FirstNumber();
            double numberTwo =SecondNumber();
            String choice = Choice();
            double endNumber =Total(choice,numberOne,numberTwo);
            Results(endNumber);
            ForLoopMethod(endNumber);
        }while(End().equalsIgnoreCase("yes"));
        GoodBye();
    }

    private static Scanner scnr = new Scanner(System.in);

    private static void Greeting()
    {
        System.out.print("\nWelcome to math, Enter numbers when prompted.");
    }

    private static double FirstNumber()
    {
        System.out.print("\nEnter the First number:  ");
        double first = scnr.nextDouble();
        return first;
    }

    private static double SecondNumber()
    {
        System.out.print("\nEnter the Second number:  ");
        double second = scnr.nextDouble();
        return second;
    }

    private static String Choice()
    {
        System.out.print("\nType which operation you would like to use? Enter as shown:\n\nMultiplication\nDivision\nSubtraction\nAddition\n\nYour Choice:  ");
        scnr.nextLine();
        String choice = scnr.next();

        while(!"Multiplication".equalsIgnoreCase(choice) && !"Division".equalsIgnoreCase(choice) && !"Subtraction".equalsIgnoreCase(choice) && !"Addition".equalsIgnoreCase(choice))
        {
            System.out.println("Opps, Appears that you may spelled something wrong, Try Again:  ");
            choice = scnr.next();
        }
        return choice;
    }

    private static double Total(String userChoice,double numOne, double numTwo)
    {
        double total =0;

        switch(userChoice)
        {
            case "Multiplication":
            case "multiplication":
                total =numOne * numTwo;
                break;
            case "Division":
            case "division":
                total =numOne / numTwo;
                break;
            case "Subtraction":
            case "subtraction":
                total =numOne - numTwo;
                break;
            case "Addition":
            case "addition":
                total =numOne + numTwo;
            break;
        }
        return total;
    }

    private static void Results(double total)
    {
        System.out.printf("\nYour total was: %.2f",total);
    }

    private static void ForLoopMethod(double total)
    {
        //Testing a new merge feature
        //Replaced comment Addition
        for(int i=0; i < 2; i++)
        {
            System.out.printf("\nYour total was: %.2f",total);
        }

        System.out.println("\nNested For Loop");

        for(int i=0; i <= 3; i++)
        {
            System.out.printf("\nOuter for loop %d", i);

            for(int r=0; r <= i; r++)
            {
                System.out.printf("\nInner for loop %d", r);
            }
        }
    }


    private static void GoodBye()
    {
        System.out.println("Goodbye for now or is it the beginning?");
        System.out.println("Goodbye for now or is it the beginning?");
    }

    private static String End()
    {
        System.out.print("\nWould you like to continue? Type Yes or No  ");
        String stopping = scnr.next();

        if("yes".equals(stopping) || "no".equals(stopping))
        {
            //Tricks you more than you think
            System.out.println("Are you absolutely sure you want to end the application, Type your response:  ");
            stopping = scnr.next();
        }
        return stopping;
    }

}
