package lecture05.section05.Interfaces;

import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int stamina;


    public Player(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.stamina);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.stamina = Integer.parseInt(savedValues.get(1));
        }
    }
}