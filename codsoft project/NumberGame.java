
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playAgain = 1;
        int totalScore = 0;
        int totalRounds = 0;

        System.out.println("================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("================================");

        while (playAgain == 1) {

            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            int score = 0;
            boolean guessed = false;

            System.out.println("\nGuess a number between 1 and 100");
            System.out.println("You have 7 attempts!");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == number) {

                    System.out.println("\nCorrect Guess!");
                    System.out.println("Congratulations! You Won!");

                    score = 110 - (attempts * 10);

                    System.out.println("Attempts Used: " + attempts);
                    System.out.println("Your Score: " + score);

                    guessed = true;
                    break;
                }

                else if (guess < number) {
                    System.out.println("Too Low! Try Again.");
                }

                else {
                    System.out.println("Too High! Try Again.");
                }

                System.out.println("Attempts Left: "
                        + (maxAttempts - attempts));
            }

            if (!guessed) {

                System.out.println("\nGame Over!");
                System.out.println("Correct Number: " + number);
                System.out.println("Your Score: 0");
            }

            totalScore += score;
            totalRounds++;

            System.out.println("\n------------------------------");
            System.out.println("Round Score: " + score);
            System.out.println("Total Score: " + totalScore);
            System.out.println("------------------------------");

            System.out.print("\nDo you want to play again?");
            System.out.print("\nEnter 1 for Yes or 0 for No: ");

            playAgain = sc.nextInt();
        }

        System.out.println("\n================================");
        System.out.println("          GAME SUMMARY");
        System.out.println("================================");

        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Final Total Score: " + totalScore);

        System.out.println("\nThank You For Playing!");

        sc.close();
    }
}
