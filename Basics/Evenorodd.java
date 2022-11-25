package Basics;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a;
        a= input.nextInt();
        if(a%2==0){
            System.out.println("It is an Even Number.");
        }else{
            System.out.println("It is an Odd Number.");
        }
    }
}
