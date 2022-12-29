package lecture01.cw01;

public class MethodsChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 7;
        int levelCompleted = 3;
        int bonus = 2;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); // We can assign a variable to method
        // We take value that is return from method calculateScore and put it in variable called highScore.
        System.out.println("Your final score was " + highScore);

        // When we assign value in method

        score = 9;
        levelCompleted = 2;
        bonus = 1;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(3);
        displayHighScorePosition("Ali", highScorePosition);

        highScorePosition = calculateHighScorePosition(0);
        displayHighScorePosition("Jamal", highScorePosition);

        highScorePosition = calculateHighScorePosition(10);
        displayHighScorePosition("Kareem", highScorePosition);

        highScorePosition = calculateHighScorePosition(6);
        displayHighScorePosition("Tom", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " is now in position number "
                + highScorePosition + " on the high score table");
        // In the displayHighScorePosition method we do not return anything we simply just print.
    }

    public static int calculateHighScorePosition(int playerScore) {
        // We can also write this with conditional if statements. --> if(playerScore >= 10) return 1; and so on.

        int position = 4;  // assuming position 4 will be returned

        if (playerScore >= 10)
            position = 1;
        else if (playerScore >= 5)
            position = 2;
        else if (playerScore >= 1)
            position = 3;
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We use int instead of void here because we want to return a value,
        // void is use for when we do not want method return anything.

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;  /* --- > in here finalScore return in as value and is going to pass to the
            calculateScore and we put it in to variable called highScore.*/
        }

        return -1;

    }
}