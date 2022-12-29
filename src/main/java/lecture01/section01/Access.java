package lecture01.section01;

public class Access {
    private String name;
    public Access(String n) {
        name = n;
    }
    public void check(Access access) {
        access.name = name;
    }

    public static void main(String[] args) {
        Access a = new Access("Alin");
        Access b = new Access("bar");
        b.check(a);
        System.out.println(a.name);
        System.out.println(b.name);
    }
}