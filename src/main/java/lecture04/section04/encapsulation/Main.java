package lecture04.section04.encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Ali", 70);
        System.out.println("Initial health is " + player.getHealth()); /* We do not have access to hitPoints,
        so we use getter.
        If we didn't use encapsulation we have to set all values like player.name = "Ali"; */
    }
}