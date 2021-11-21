//*************************************************************************
// HiLoGuessingGame.java
// 
// Charles Luu T00703253
// COMP 1131 Assignment 3 Application 1
//
//*************************************************************************
import java.util.Scanner;
import java.util.Random;

public class HiLoGuessingGameDraft
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int RANDOM_NUMBER = rand.nextInt(100) + 1;

        int guess = -1;
        int tries = 0;
        boolean start = true;

        System.out.println("Welcome to the HiLo Guessing Game");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");

        while (start)
        {

            while (guess != RANDOM_NUMBER)
            {
                System.out.println("> ");
                guess = input.nextInt();
                tries++;

                if (guess < 1 || guess > 100)
                {
                    System.out.println("ERROR. Guess must be within 1 and 100. Try again.");
                }
                else if (guess < RANDOM_NUMBER)
                {
                    System.out.println("Your guess is too low. Try again.");
                }
                else if (guess > RANDOM_NUMBER)
                {
                    System.out.println("Your guess is too high. Try again.");
                }
                else if (guess == RANDOM_NUMBER)
                {
                    System.out.println("Correct! You win! It only took you " + tries + " tries.");
                }
            }
