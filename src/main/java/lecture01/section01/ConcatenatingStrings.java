package lecture01.section01;

public class ConcatenatingStrings {

    public static void main(String[] args) {
        String firstName = "Sasha";
        String lastName = "Lopez";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
    }
}
