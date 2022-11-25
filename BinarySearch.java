package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in a sorted order:");
        for(int i = 0 ; i < n ; i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target= in.nextInt();
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int  target){

        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
               start=mid+1;
            }
        }
        return -1;
    }
}
