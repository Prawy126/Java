import java.util.Scanner;

public class Liczby {
    private int[] tab;
    Liczby(int i){
        tab = new int[i];
    }
    private int a = 0;
    public void uzupelnij(){
        for(int i : tab){
            System.out.println("Podaj liczbę dla indeksu: " + a);
            Scanner podaj = new Scanner(System.in);
            tab[a]=podaj.nextInt();
            a++;
        }
    }
    public void wyswietl(){
        for(int i :tab) {
            System.out.println(i + ") " + i);
        }
    }
    public int suma(){
        int suma = 0;
        for(int i : tab) {
            suma += i;
        }
        return suma;

    }
}
