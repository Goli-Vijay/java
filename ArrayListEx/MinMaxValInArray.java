package ArrayListEx;

//import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValInArray {
    private final static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        minMaxVal();
    }
    public static void minMaxVal(){
        System.out.print("enter the size of the array:");
        int n=in.nextInt();
        System.out.print("Enter the Elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Value is "+min);
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Value is "+max);
    }
}
