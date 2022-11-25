package Basics;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        linearSearch();
    }
    public static void linearSearch(){
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        System.out.println("The array is :");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the target element:");
        int t=in.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==t){
                System.out.println("The target element is found at "+(i+1)+" Position in the array");
                break;
            }
        }
        if(i==n){
            System.out.println("The target element is not found in the given array");
        }
    }


}
