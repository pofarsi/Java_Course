package lecture02.section02;

public class ParseValue {
    public static void main(String[] args) {
        String numberAsString = "2020.12";
        //System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        //System.out.println("number = " + number);

        int intVal = (int)number;

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number as double= " + number);
        System.out.println("number as int= " + intVal);
    }
}
