package lecture01.hw01;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your String: ");
        String str = sc.nextLine().trim();
        for(int i = str.length() -1 ; i >= 0; i--)
            System.out.print(str.charAt(i));
    }
}