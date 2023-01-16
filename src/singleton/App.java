package singleton;

public class App {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Singleton instances are the same!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("And points are the same!");
            }
        }
    }
}
