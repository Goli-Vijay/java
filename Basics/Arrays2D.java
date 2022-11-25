package Basics;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr=new int[3][2];
        //Taking input..
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        //Printing output..
        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
