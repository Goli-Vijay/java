package ArrayListEx;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        evenInArray();
    }
    public static void evenInArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        System.out.print("Enter the elements :");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int count = 0;
        for (int j : arr) {
            if (isEven(j)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isEven(int num){
        int digits = count(num);
        return digits % 2 == 0;
    }
    public static int count(int num){
        //Optimized solution for finding no.of digits in a number.....
//        return (int)(Math.log10(num)+1);
        int count=0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
