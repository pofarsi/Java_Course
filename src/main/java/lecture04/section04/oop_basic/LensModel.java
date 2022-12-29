package lecture04.section04.oop_basic;

public class LensModel {
    public static void main(String[] args) {
        // Classes and Object
        Lens lensOne = new Lens("Sony",
                85,
                true);

        Lens lensTwo = new Lens("Canon",
                45,
                false);
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength + "mm");
        System.out.println(lensOne.isPrime);

    }

    static class Lens {
        String brand;
        int focalLength;
        boolean isPrime;

        // this is a constructor.
        Lens(String brand, int focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
