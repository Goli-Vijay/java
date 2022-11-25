package Basics;

import java.util.Scanner;

public class Fibofun {
    public static void main(String[] args) {
        fibo();
    }
    public static void fibo() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c=0;
        System.out.println("enter the Range:");
        int n = input.nextInt();
        System.out.print(a+",");
        System.out.print(b+",");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            if (i < n) {
                System.out.print(c + ",");
            }
            else {
                System.out.print(c + ".");
            }
            a = b;
            b = c;
        }

    }
}
