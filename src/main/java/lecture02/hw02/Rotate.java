package lecture02.hw02;

import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {1,2,3,4,5,6,7,8,9};
        System.out.println("input how many times you want to rotate: ");
        int rotate = sc.nextInt();
        System.out.println("Input Array : ");
        for(int i=0;i<number.length;i++)
            System.out.print(number[i]+" ");
        System.out.println("\nEnter how many times you want to rotate to left: ");
        for(int i=0;i<rotate;i++) {
            int first=number[0];
            for(int j=0;j<number.length-1;j++)
                number[j]=number[j+1];
            number[number.length-1] = first;
        }
        System.out.println("Output Array : ");
        for(int i=0;i<number.length;i++) {
            System.out.print(number[i]+" ");
        }
    }
}