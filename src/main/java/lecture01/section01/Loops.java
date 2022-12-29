package lecture01.section01;

public class Loops {
    public static void main(String[] args) {
    /* conditional, statement
    Type value = condition ? value true : value false; */
        double area = 2 * 2 * 3.14;

        int value = area > 10 ? 1 : -1;
        System.out.println(value);
        // this is same as writing it like this.

        if (area > 10)
            value = 1;
        else
            value = -1;
        System.out.println(value);
        System.out.println("***************************");

        // if statement
        int x = 10, y = 5;
        if (x > y)
            System.out.println("X is grater than Y");
        else if (x == y)
            System.out.println("X is equal to Y");
        else
            System.out.println("X is less than Y");

        // we can also use boolean in our condition = x > y
        boolean condition = x > y;
        if (condition) {
            System.out.println("X is grater then Y and the condition is " + condition);
            /*
            in this form if condition is true we get this massage and
            if we print condition we get true also if we have two statement to print we use block {}
            */
            System.out.println("x is --> " + x + " and y is --> " + y);
        } else
            System.out.println("Y >= X");
        System.out.println("***************************");

        // while loop
        int counter = 1;
        while (counter < 10) // while this condition is true the body is going to get done.
        {
            System.out.print(counter);
            counter++;
        }
        System.out.println();
        System.out.println("***************************");

        /* do while loop is the same as while loop whit one condition
        and that is the condition is going to get done first.
         */
        int counter1 = 0; // we have to start from 0 if we start from 1 we are having 2,3,4,5,6,7,8,9,10.
        do {
            counter1++;
            System.out.print(counter1); // we have 10 in our answer because we are done the condition first.
        } while (counter1 < 10);
        System.out.println();
        System.out.println("***************************");

        /* for loop is the most common type of loops it is like
        for (one operation ; one condition ; one operation) {
            we are to have something here based on our condition;
            } */
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ",");
        }
        System.out.println("--> whit for loop");

        /* we can rewrite for loop with while loop
        for ( x; y; z) {
            body();
            }
        x;
        while(y) {
        body();
        z;
        } */

        for (int j = 1; j <= 10; j++) {
            System.out.print(j + ",");
        }
        System.out.println("--> whit for loop");

        int k = 1;
        while (k <= 10) {
            System.out.print(k + ",");
            k++;
        }
        System.out.println("--> whit while loop");
        System.out.println("***************************");

       /* methods
       double add "name of method" (double a, double b)"Parameter" {
           double result = a + b;
           return result;
       }
            double n = 3;
            double m = 4;
            double add = add(n, m); */

// In if statement of below we can use switch statement instead.
        int valueX = 3;
        if (valueX == 1) {
            System.out.println("Value is 1 --> wrote with if statement");
        } else if (valueX == 2) {
            System.out.println("Value is 2 --> wrote with if statement");
        } else {
            System.out.println("Was not 1 or 2 --> wrote with if statement");
        }
        System.out.println("***************************");

// Same if statement of above with switch case.
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1 --> wrote with switch statement");
                break;

            case 2:
                System.out.println("Value is 2 --> wrote with switch statement");
                break;

            case 3: case 4: case 5: // if same case have same exception we can write case like this.
                System.out.println("It was a " + switchValue + " --> wrote with switch statement");
                break;

            default:
                System.out.println("Was not 1,2,3, 4 or 5 --> wrote with switch statement");
                break;
        }

        System.out.println("***************************");
// Create a new switch statement using char
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A was found --> wrote with switch statement");
                break;
            case 'B':
                System.out.println("B was found --> wrote with switch statement");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue + " was found --> wrote with switch statement");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E --> wrote with switch statement");
                break;
        }
        System.out.println("***************************");
// Create a new switch statement using String
        String name = "Alex";
        switch (name.toUpperCase()) {
            case "Lisa":
                System.out.println("Lisa --> wrote with switch statement");
                break;
            case "Gabi":
                System.out.println("Gabi --> wrote with switch statement");
                break;
            default:
                System.out.println("!!!!! --> wrote with switch statement");
        }
    }

}
