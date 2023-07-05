import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = x.nextInt();
        System.out.println(fibonacci(n));
    }
}
