package Basics;
import java.util.Scanner;

public class Numbersse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b,i;
        System.out.println("Enter the starting number:");
        a= input.nextInt();
        System.out.println("Enter the Ending number:");
        b= input.nextInt();
        for(i=a;i<b;i++){
            System.out.print(i+",");
        }
        if(i==b){
            System.out.print(i+".");
        }
    }
}
