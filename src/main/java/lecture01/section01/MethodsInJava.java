package lecture01.section01;

// There are two model that we can pass parameter to the method
public class MethodsInJava {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 10000, 8, 200);

    }
    // Methods should be outside another method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1; // -1 used for indicating the error in searching algorithms -1 indicate invalid value

    }
}