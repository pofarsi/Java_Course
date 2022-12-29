package lecture11.section11;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaEx {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
//      In order to do more complex operations we use code block
        numbers.forEach( (n) -> { System.out.print(n + ", "); } );
        System.out.println();
        numbers.forEach(System.out::print);
        System.out.println();
        Consumer<Integer> method = System.out::print;
        numbers.forEach( method );
    }
}
