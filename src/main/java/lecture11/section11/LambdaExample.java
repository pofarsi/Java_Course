package lecture11.section11;

import java.util.function.Function;

public class LambdaExample {
    // This method takes a lambda expression as a parameter. The lambda expression
    // must conform to the Function interface, which means it must take a single
    // argument of type T and return a value of type R.
    public static <T, R> R applyFunction(T input, Function<T, R> func) {
        // The lambda expression is passed to the method and is stored in the func
        // parameter. We can then use the lambda expression like any other object,
        // by calling the apply method on it and passing in the input value.
        return func.apply(input);
    }

    public static void main(String[] args) {
        // Here we are calling the applyFunction method and passing in a lambda
        // expression as the second argument. The lambda expression takes a String
        // as input and returns an integer (the length of the String).
        int result = applyFunction("Hello", (String s) -> s.length());
        System.out.println(result); // prints "5"
    }
}

