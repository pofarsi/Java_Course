package lecture04.section04.oop_basic;

/* Method over loading is when we use same method name for another method with different parameters
 and calling it with the specific implementation of that methods. and another way of polymorphism is
 method overloading */

public class MethodsOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Sasha", 3);
        System.out.println("New score for Sasha is " + newScore);
        calculateScore(5);
        // int finalScore = calculateScore(5); System.out.println("Ali's new score is " + finalScore);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 2;
    }

    public static int calculateScore(int score) {
        System.out.println("Ali scored " + score + " points");
        return score * 7; // ----> ?? why is not 15? for doing that we should creat it in above method.
    }

    public static void calculateScore() {
        System.out.println("???.");
    }

//    public static int calculateScore() {
//        System.out.println("???.");
//        return 0;
//    }

}
