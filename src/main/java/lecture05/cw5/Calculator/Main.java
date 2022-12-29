package lecture05.cw5.Calculator;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(3.5);
        calculator.setSecondNumber(4);
        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
        System.out.println(calculator.getDivisionResult());
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());

    }
}
