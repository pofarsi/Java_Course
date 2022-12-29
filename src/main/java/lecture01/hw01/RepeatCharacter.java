package lecture01.hw01;

import java.util.Scanner;

// Write program that show the repeated number od character
public class RepeatCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a statement: ");
        String word = sc.nextLine();
        character(word); // in here we use method
    }

    static void character(String word) {
        String[] ch = word.split("");
        String temp = "";
        int counter = 1;
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i].equalsIgnoreCase(ch[j]) && !ch[i].equalsIgnoreCase("")) {
                    temp = ch[i];
                    ch[j] = "";
                    counter++;
                    flag = true;
                }
            }
            if (flag)
                System.out.println(temp + " : " + counter);
            flag = false;
            counter = 1;
        }
    }
}
