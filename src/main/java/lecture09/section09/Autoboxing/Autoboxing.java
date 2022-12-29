package lecture09.section09.Autoboxing;

import java.util.ArrayList;

//class IntClass {
//    private int myValue;
//
//    public IntClass(int myValue) {
//        this.myValue = myValue;
//    }
//
//    public int getMyValue() {
//        return myValue;
//    }
//
//    public void setMyValue(int myValue) {
//        this.myValue = myValue;
//    }
//}


public class Autoboxing {

    public static void main(String[] args) {
        String[] strArray = new String[5];
        int[] intArray = new int[5];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Ali");

        /* ArrayList<int> intArrayList = new ArrayList<int>();
        this is wrong we can not put primitive data type to Arraylist */

        /* ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        this is working but there is lots of work creating class and put constructor and setter and getter,
        so we do like the below we use Autoboxing like String because String is class it is like we creat class for
        string like the above. with the class IntClass we actually creat wrapper class we wrapped the into a class */

        // Autoboxing
        Integer integer = new Integer(7);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

//        for(int i=0; i<=10; i++) {
//            intArrayList.add(Integer.valueOf(i)); // This is Autoboxing we're converting int to Integer
//        }
//
//        for(int i=0; i<=10; i++) { // This is Unboxing we're converting Integer to int.
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }
        // * better way of doing Autoboxing and Unboxing is like below.

        Integer myIntValue = 5;
        // This is like we writing it like this -----> Integer.valueOf(56); --> Autoboxing

        int myInt = myIntValue.intValue();
        // This is like we writing it like this -----> myIntValue.intValue(); --> Unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=5.0; dbl += 0.75) {
            myDoubleValues.add(dbl);
            System.out.println("dbl ----> " + dbl + " ___ myDoubleValues ----> " + myDoubleValues);
//            myDoubleValues.add(Double.valueOf(dbl)); this is Autoboxing, but we can write this even shorter.
        }System.out.println();

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); // we can put .doubleValue(); but is not necessarily.
            System.out.println("i--> " + i + "  ---- " + value + " <-- value ---- " +
                    myDoubleValues + " <--- myDoubleValues");
        }
    }
}
