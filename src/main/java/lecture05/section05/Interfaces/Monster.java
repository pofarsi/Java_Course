package lecture05.section05.Interfaces;

import java.util.ArrayList;

public class Monster implements ISaveable {
    private String name;
    private int strength;

    public Monster(String name, int strength) {
        this.name = name;

        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.strength);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.strength = Integer.parseInt(savedValues.get(1));
        }
    }
}