package Basics;
import java.util.Scanner;
public class LsearchInRange {
    public static void main(String[] args) {
        SearchInRange();
    }
    public static void SearchInRange(){
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the range:");
        int start=in.nextInt();
        if(start<0 || start>arr.length){
            System.out.println("The given range is not valid!!");
            return;
        }
        int end=in.nextInt();
        if(end>arr.length-1){
            System.out.println("The given range is crossed over the array");
            return;
        }
        System.out.println("Enter the target element:");
        int target=in.nextInt();
        for(i=start;i<=end;i++){
            if(arr[i]==target){
                System.out.println("The element is found at index:"+i);
                break;
            }
        }
        if(i==end+1){
            System.out.println("The element is not found in the given range");
        }
        if(i>arr.length){
            System.out.println("The target element is not present in the given array");
        }
    }
}
