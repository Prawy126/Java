import java.util.Random;
//zadanie 1
public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica(100);
        tablica.losuj();
        tablica.sortuj();
        tablica.wypisz();

    }
}