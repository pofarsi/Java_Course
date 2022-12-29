package lecture05.cw5.Bank;

public class  Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account(){ // This is constructor.
        this("0000",0.0,"xxxx","xxxx","xxxx");
        // we use this.(constructor) when we want default constructor IT should be first line.
        System.out.println("Empty constructor");
    }

    public Account(String number, double balance, String name, String email, String phone) {
        this.number = number; // we can use like setNumber(number) but is not recommended.
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Account(String number, double balance, String name) {
        this(number,balance,name,"default","default"); // for when we want some parameters to be default,
        //we can use it in Main
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You added " + depositAmount + " to your account now you have "+ this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("your balance is no money " + this.balance);
        }else  {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal " + withdrawalAmount + " your balance now is " + this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getPhone() {
        return phone;
    }

//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
}
