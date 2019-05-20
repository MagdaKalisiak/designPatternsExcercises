package singletonExcercise;

class Main {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = GuessGame.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == GuessGame.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
    }
