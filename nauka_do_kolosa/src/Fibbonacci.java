import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres: ");
        int a = scanner.nextInt();
        int wynik = fibbonacci(a);
        System.out.println(wynik);

    }
    static int fibbonacci(int a){
        if(a==1) return 1;
        if(a>1){
            return fibbonacci(a-1)+fibbonacci(a-2);
        }
        return 0;

    }
}
