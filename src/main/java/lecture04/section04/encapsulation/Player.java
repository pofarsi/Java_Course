package lecture04.section04.encapsulation;

public class Player {
    private String name;
    private int hitPoints = 100; /*  at first the initialization was like public int health; , but we use encapsulation
     now we can use private and restrict access */

    public Player(String name, int health) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Game over");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}