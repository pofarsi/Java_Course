package lecture05.cw5.Bank;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
public class Main {
    public static void main(String[] args) {
//        Account davidAccount = new Account(); // if we run this we get default constructor
        Account davidAccount = new Account("1234",300.50,"David"
                ,"@gmail.com","0912"); // instead of doing below
//        davidAccount.setName("David");
//        davidAccount.setNumber("1234");
//        davidAccount.setEmail("@gmail.com");
//        davidAccount.setPhone("+9812");

        System.out.println(davidAccount.getEmail());
        System.out.println(davidAccount.getNumber());

        davidAccount.withdrawal(100.00);

        davidAccount.deposit(3000);
        davidAccount.withdrawal(1000);

        davidAccount.withdrawal(4000);

        Account bobAccount = new Account("123",100.00,"Bob");
        System.out.println(bobAccount.getNumber() + " " + bobAccount.getName() + " " + bobAccount.getPhone());

        VipPerson person1 = new VipPerson("Jack",2000000.00);
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Mona", 2000000.00,"Mona@gmail.com");
        System.out.println(person2.getName());
        System.out.println(person2.getCredit());
        System.out.println(person2.getEmail());

        VipPerson person3 = new VipPerson();
        System.out.println(person3.getName());


    }
}
