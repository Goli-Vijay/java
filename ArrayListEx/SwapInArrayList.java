package ArrayListEx;

import java.util.Arrays;
import java.util.Scanner;

public class SwapInArrayList {
    private final static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        swap();
    }
    public static void swap(){

        System.out.print("Enter the size of the array: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i]= in.nextInt();
        }
        System.out.print("Enter the two indices: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
