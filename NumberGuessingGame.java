/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

// Number guessing game with Unlimited Rounds and Score Tracking
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;     // Tracks how many rounds won
        int rounds = 0;    // Tracks number of rounds played
        int K = 5;         // Maximum attempts per round
        boolean playAgain = true;

        while (playAgain) {
            int number = rand.nextInt(100) + 1; // Random number 1–100
            int attempts = 0;
            boolean guessedCorrectly = false;
            rounds++;

            System.out.println("\nRound " + rounds);
            System.out.println("A number is chosen between 1 and 100.");
            System.out.println("You have " + K + " attempts to guess it.");

            for (int i = 0; i < K; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was: " + number);
            }

            // Ask user to play another round
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Final score
        System.out.println("\nGame Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Rounds won: " + score);
        sc.close();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}