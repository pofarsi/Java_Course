package lecture04.hw4.simple_banking_with_oop;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("123456", 500.0);
        Account account = new Account("987654", creditCard);
        Customer customer = new Customer("Bob Menendez", account);
        Branch branch = new Branch("1","Tehran",1);

        System.out.println(customer.getName());
        System.out.println(customer.getAccount().getAccountNumber());
        System.out.println(customer.getAccount().calCustomerBalance());
        System.out.println(customer.getAccount().getCreditCard());
        System.out.println(branch.getCity() + " code " + branch.getCode()+ " rank " + branch.getRank());
    }
}
