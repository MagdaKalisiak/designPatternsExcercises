package singletonExcercise;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static final GuessGame instance = new GuessGame();
    private static int score = 0;
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    private GuessGame() {
    }

    public static GuessGame getInstance() {

            

        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }


    public void play() {
        for (int i = 0; i < 10; i++) {
            int toGuess = random.nextInt(10);
            System.out.printf("Guessthe number from 0 to 9%n");
            int in;
            in = scanner.nextInt();
            if (in == toGuess) {
                score++;
                System.out.println("Good guess! Your scores: " + getScore());
            } else
                System.out.println("Bad guess - try again. Your scores: " + getScore());
        }


    }

    public static int getScore() {
        return score;
    }
}
