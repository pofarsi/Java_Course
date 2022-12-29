package lecture02.section02;

public class StringPractice {
    public static void main(String[] args) {
        String str = "apple";
        str.replace("a", "A");
        String replaced = str.replace("a", "A");
        System.out.println(str + ", " + replaced);

    }
}
