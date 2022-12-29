package lecture04.section04.classes;

public class Classes {
    public static void main(String[] args) {
        /* iphone11 & iphone12 are instance of class Iphone. instead of using set we use constructor to pass the value
         every class comes with default constructor "public Iphone(){}" if we mack it private we get error here */

        Iphone iphone11 = new Iphone(phoneModel.IPHONE_11_PLUS,
                999.99,
                false);

//        Iphone iphone12 = new Iphone("California");
//        IphoneModel.IPHONE_12.getClass().getMethods(). how to get License.

        // We can change the price in constructor with setter here.
        iphone11.setPrice(200.00);


//        System.out.println(iphone11.getModel());
//        System.out.println(iphone11.getPrice());
//        System.out.println(iphone11.isWaterResistant());
        // if we use toString class in Iphone class we do not need print method of the above.
        System.out.println(iphone11);
        System.out.println(iphone11.getModel());
        System.out.println(iphone11.getModel().getModelstr());

        System.out.println("**********************");
//        System.out.println(IPHONE_12.getModel());
//        System.out.println(iphone12.getPrice());
//       System.out.println(iphone12.isWaterResistant());
        // Create separate constructor and getter for Licence.
//        System.out.println(iphone12.getLicence());


//        System.out.println("*******************");
//        Iphone iphone12 = new Iphone();
//        iphone12.setModel("12+");
//        iphone12.setPrice(1200.99);
//        iphone12.setWaterResistant(true);
//        System.out.println(iphone12.getModel());
//        System.out.println(iphone12.getPrice());
//        System.out.println(iphone12.isWaterResistant());
    }
}
