package lecture04.hw4.simple_banking_with_oop;

class Account {
    private String accountNumber;
    private CreditCard creditCard;

    public Account(String accountNumber, CreditCard creditCard) {
        this.accountNumber = accountNumber;
        this.creditCard = creditCard;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public double calCustomerBalance() {
        return this.creditCard.getCredit();
    }

    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + ", credit card: " + this.creditCard.toString();
    }
}