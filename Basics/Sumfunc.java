package Basics;
import java.util.Scanner;
public class Sumfunc {
    public static void main(String[] args) {
       int sum1=sum();
       System.out.println(sum1);
    }
    public static int sum(){
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        a=input.nextInt();
        System.out.println("Enter a number:");
        b=input.nextInt();
        return a+b;
    }
}
