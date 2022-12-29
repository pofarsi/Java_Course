package lecture09.cw9.Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("JP Morgan");

        if (bank.addBranch("New York")) {
            System.out.println("New York branch created");
        }

        bank.addCustomer("New York", "Pouria", 2545629.45);
        bank.addCustomer("New York", "Amir", 2529.45);

        bank.addBranch("California");
        bank.addCustomer("California", "Ali", 194520.59);
        bank.addCustomer("California", "David", 19498520.59);
        bank.addCustomer("California", "Pouria", 2545629.45);

        bank.addCustomerTransaction("New York", "Pouria", 795345.26);
        bank.addCustomerTransaction("California", "Pouria", 63453456.48);
        bank.addCustomerTransaction("California", "Ali", 153454.65);
        bank.addCustomerTransaction("New York", "Amir", 55415.65);
        bank.addCustomerTransaction("California", "David", 17435.65);

        bank.listCustomers("New York", true);
        System.out.println("*****************************************");
        bank.listCustomers("California", true);

        bank.addBranch("Texas");

        if (!bank.addCustomer("Texas", "Donald", 5.53)) {
            System.out.println("Error Texas branch does not exist");
        }

        if (!bank.addBranch("New York")) {
            System.out.println("New York branch already exists");
        }

        if (!bank.addCustomerTransaction("New York", "Smith", 89.37)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("New York", "John", 36.24)) {
            System.out.println("Customer Tim already exists");
        }
    }
}