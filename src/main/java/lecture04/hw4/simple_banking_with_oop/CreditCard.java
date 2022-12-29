package lecture04.hw4.simple_banking_with_oop;

class CreditCard {
    private String cardNumber;
    private double credit;

    public CreditCard(String cardNumber, double credit) {
        this.cardNumber = cardNumber;
        this.credit = credit;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getCredit() {
        return this.credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Card number: " + this.cardNumber + ", credit: " + this.credit;
    }
}
