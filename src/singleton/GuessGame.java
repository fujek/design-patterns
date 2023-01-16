package singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private GuessGame() {
    }

    private static final GuessGame INSTANCE = new GuessGame();

    private int score = 0;

//    private static GuessGame instance;

    public static GuessGame getInstance() {
        return INSTANCE;
//        another implementation:
//        if (instance == null) {
//            synchronized (GuessGame.class) {
//                if (instance == null) {
//                    instance = new GuessGame();
//                }
//            }
//        }
    }

    public int getScore() {
        return score;
    }

    public void play() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int ROUNDS = 20;
        for (int i = 0; i < ROUNDS; i++) {
            int randomNumber = random.nextInt(0, 1);
            System.out.println("Try to guess a number (0-9): ");
            int guessedNumber = Integer.parseInt(in.nextLine());
            if (randomNumber == guessedNumber) {
                System.out.println("BRAVO!");
                score++;
            } else {
                System.out.println("Bad luck! It was " + randomNumber);
            }
        }
    }
}
