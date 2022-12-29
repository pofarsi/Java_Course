package lecture04.hw4.simple_banking_with_oop;

class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account)  {
    this.account = account;
    }
}