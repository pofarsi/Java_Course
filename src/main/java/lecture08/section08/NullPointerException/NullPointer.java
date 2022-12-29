package lecture08.section08.NullPointerException;

import java.util.Optional;

public class NullPointer {
    public static void main(String[] args) {
        var brand = "Dior";
//        int number = null; ---> is false
        Integer number = null;
        String brand1 = null;

        if (brand1 != null) {
            System.out.println(brand1.toUpperCase());
        }else {
            System.out.println("null");
        }

        // it is better to not use method below because is expensive to JVM.
        try {
            System.out.println(brand1.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // it is used when we sure the value is not going to be null.
        Optional.of(brand);

        // When we do not know value is going to be null or not
       String theBrand = Optional.ofNullable(brand1)
               .map(String::toUpperCase)
               .orElseGet(() -> {
                    // logic we can use lambda or other methods.
                   return "theBrand is null";
        });
               //.orElse("theBrand is null");
        System.out.println(theBrand);



    }

}
