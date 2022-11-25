package Basics;
public class Amstrong {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            if(isAmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isAmstrong(int n){
        int original=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return original==sum;
    }

}
