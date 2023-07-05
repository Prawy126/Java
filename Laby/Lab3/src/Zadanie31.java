import java.util.Scanner;


public class Zadanie31 {
    public static int silnia(int wartosc){
         if(wartosc == 0) return 1;
         else return wartosc * silnia(wartosc - 1);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");

        int liczba = sc.nextInt();

        System.out.println(liczba + "! = " + silnia(liczba));


    }
}
