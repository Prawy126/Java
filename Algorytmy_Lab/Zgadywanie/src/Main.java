import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int proba = 1000; // Zakres do poszukiwań
        int liczba = Math.abs(random.nextInt() % proba); // Losowanie liczby do odgadnięcia
        boolean zadanie = sprawdzenie(liczba, proba, 0); // Wywołanie funkcji sprawdzającej
        //System.out.println("Czy liczba " + liczba + " została znaleziona? " + zadanie);
    }

    // Metoda rekurencyjna sprawdzająca, czy podana liczba została znaleziona w danym zakresie
    public static boolean sprawdzenie(int liczba, int proba, int strona) {
        int pomoc = proba / 2 + strona;
        System.out.println("Czy podana liczba to " + pomoc);

        if (liczba == pomoc) {
            System.out.println("Liczba " + pomoc + " jest liczbą wylosowaną " + liczba);
            return true; // Znaleziono liczbę
        } else if (liczba < pomoc) {
            System.out.println("Liczba " + pomoc + " jest liczbą za dużą");
            return sprawdzenie(liczba, proba / 2, strona); // Wywołanie rekurencyjne dla mniejszej połowy zakresu
        } else {
            System.out.println("Liczba " + pomoc + " jest liczbą za małą" );
            return sprawdzenie(liczba, proba / 2, pomoc + 1); // Wywołanie rekurencyjne dla większej połowy zakresu
        }
    }
}
