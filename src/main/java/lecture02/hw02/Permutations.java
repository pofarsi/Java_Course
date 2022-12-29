package lecture02.hw02;

class Main {
    public static void permutations(String s, String remain) {
        if (remain == null)
            return;
        if (remain.length() == 0)
            System.out.println(s);

        for (int i = 0; i < remain.length(); i++) {
            String newS = s + remain.charAt(i);
            String newRemain = remain.substring(0, i) + remain.substring(i + 1);
            permutations(newS, newRemain);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permutations("", str);
    }
}