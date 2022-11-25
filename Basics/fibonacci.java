package Basics;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int firstNumber=0,secondNumber=1, nextNumber,i,n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Range:");
        n= input.nextInt();
        System.out.print(firstNumber+","+secondNumber+",");
        for(i=3;i<=n;i++){
            nextNumber=firstNumber+secondNumber;
            if(i<n) {
                System.out.print(nextNumber + ",");
            }
            else{
                System.out.println(nextNumber+".");
            }
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}

