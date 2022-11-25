package ArrayListEx;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        searchInStirng();
    }
    public static void searchInStirng(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= in.nextLine();
        System.out.println("Enter the target element:");
        char ch=in.next().charAt(0);
        int flag=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
               flag=1;
                System.out.println("The given character is found at "+(i+1)+" position");
               break;
            }
        }
        if(flag==0){
            System.out.println("The character is not found!!");
        }
    }
}
