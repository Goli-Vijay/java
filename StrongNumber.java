package NumberCrunching;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        int fact=1;
        while (n>0){
            int rem=n%10;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum+=fact;
            n/=10;
            fact = 1;
        }
        if(temp==sum){
            System.out.println("It is Strong Number..");
        }
        else {
            System.out.println("It is not a Strong Number..");
        }
    }
}
