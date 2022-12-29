package lecture05.section05.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(20, true);
        System.out.println("Initial page count = " + printer.getPagePrinted());
        int pagesPrinted = printer.printPages(7);
        System.out.println("Pages printed " + pagesPrinted + " total print  = " + printer.getPagePrinted());
        System.out.println("Adding toner " + printer.addToner(50));
    }
}
