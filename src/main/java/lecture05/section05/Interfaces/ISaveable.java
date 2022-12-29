package lecture05.section05.Interfaces;

import java.util.ArrayList;

public interface ISaveable {
    ArrayList<String> write();

    void read(ArrayList<String> values);
}