package Basics;
import java.util.ArrayList;
//import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }*/
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(12);
        list1.add(14);
        list1.add(15);
        list1.add(16);
        list1.add(72);
        list1.add(132);
        list1.add(162);
        System.out.println(list1);
        System.out.println(list1.contains(23));
        list1.set(3,89);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
    }
}
