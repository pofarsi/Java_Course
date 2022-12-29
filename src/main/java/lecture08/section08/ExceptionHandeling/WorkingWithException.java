package lecture08.section08.ExceptionHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* In java Throwable is the root of all exception. for example
 Throwable --> Exception --> NullPointerException */
public class WorkingWithException {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        String string = null;

        try {
            System.out.println(string.length());

        } catch (Exception e) { // instead of Exception we can use Throwable.
            System.out.println(e);
        }

        // in java, we have two type of exceptions, 1- Checked Exceptions, 2- Unchecked Exceptions.

        // Checked Exceptions needs to handle at compile time. use try catch or throws key word.

        /* Before handling exception FileInputStream gives an error Unhandled exception. it has to be checked
          at compile time because the file might not be there. so we add exception in method signature
          throws FileNotFoundException*/

        try {
            FileInputStream inputStream =
                    new FileInputStream("src/exam.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Unchecked Exceptions won't give us completion error.
        // ArithmeticException. does not have red line.
        try {
            var result = 10 / 0;
            System.out.println(result);
            // we can use more than one catch but writing it like below is better but is expensive.
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            System.out.println(e);
            // finally runs anyway with exception or without.
        } finally {
            System.out.println("cleaning up .....");
        }

        performDivision(1, 0);

    }

    static double performDivision(double a, double b) {
        if (b == 0) {
            throw new MyException("*********** MyException ***********");
        }
        return a / b;
    }

    // Custom exception.
    static class MyException extends RuntimeException {
        public MyException(String massage) {
            super(massage);
        }
    }
}
