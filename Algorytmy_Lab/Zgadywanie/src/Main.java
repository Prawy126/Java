import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int proba = 100;
        int liczba = 99;
        boolean zadanie = sprawdzenie(liczba, proba, 0);
        System.out.println("Czy liczba " + liczba + " została znaleziona? " + zadanie);
    }

    public static boolean sprawdzenie(int liczba, int proba, int strona) {
        int pomoc = proba / 2 + strona;
        System.out.println("Aktualnie sprawdzana liczba = " + pomoc);

        if (liczba == pomoc) {
            System.out.println("Liczba " + pomoc + " jest liczbą wylosowaną " + liczba);
            return true;
        } else if (liczba < pomoc) {
            System.out.println("Liczba " + pomoc + " nie jest liczbą wylosowaną " + liczba);
            return sprawdzenie(liczba, proba / 2, strona);
        } else {
            System.out.println("Liczba " + pomoc + " nie jest liczbą wylosowaną " + liczba);
            return sprawdzenie(liczba, proba / 2, pomoc+1);
        }
    }
}
