package Basics;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        a= input.nextInt();
        System.out.println("Enter second number:");
        b= input.nextInt();
        System.out.println("Before Swapping: "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping: "+a+" "+b);
        System.out.println("\"By using third variable\"");
        int temp,c,d;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        c= input1.nextInt();
        System.out.println("Enter second number:");
        d= input1.nextInt();
        System.out.println("Before Swapping: "+c+" "+d);
        temp=c;
        c=d;
        d=temp;
        System.out.println("After Swapping : "+c+" "+d);
    }
}
