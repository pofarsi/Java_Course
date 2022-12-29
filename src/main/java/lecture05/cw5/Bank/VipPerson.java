package lecture05.cw5.Bank;

public class VipPerson {
    private String name;
    private double credit;
    private String email;

    public VipPerson(){
        this("name", 5000.00, "defult@email");
    }

    public VipPerson(String name, double credit) {
        this(name,credit,"unkown@email");
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }

    public VipPerson(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }
}
