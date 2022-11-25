package ArrayListEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversing {
    public static void main(String[] args) {
        reverse();
    }
    public static void reverse(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

        System.out.print(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int  start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
