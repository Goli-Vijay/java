package Recursion;

import java.util.Scanner;

public class Binsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element :");
        int tar=in.nextInt();
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==tar){
                System.out.println("The element is found at "+(mid+1)+" positon");
                break;
            }
            else if(arr[mid]>tar){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
}
