package Basics;
public class PrimeFun {
    public static void main(String[] args) {
        isPrime(17);
    }
    public static void isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if(c==2){
            System.out.println("It is a Prime NUmber");
        }
        else {
            System.out.println("It is not a Prime number");
        }
    }
}
