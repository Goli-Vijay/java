package ArrayListEx;

import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        searchIn2D();
    }

    public static void searchIn2D() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no.of rows:");
        int r = in.nextInt();
        System.out.print("Enter the no.of cols:");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.print("Enter the elements:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.print("Enter the target element:");
        int target = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                    break;
                }
            }
        }
    }
}
