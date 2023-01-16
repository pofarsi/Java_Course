package lecture08.section08.GenericsDataStracture.generics;

public class Main {
    public static void main(String[] args) {
        var list = new List<Integer>();
        list.add(1);
        int number = list.get(0);


        var list2 = new List<User>();
        list2.add(new User());
        User user  = list2.get(0);
    }
}
