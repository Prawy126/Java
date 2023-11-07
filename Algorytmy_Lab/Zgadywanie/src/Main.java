import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int proba = 1000;
        int liczba = Math.abs(random.nextInt() % proba);
        boolean zadanie = sprawdzenie(liczba, proba, 0);
        System.out.println("Czy liczba " + liczba + " została znaleziona? " + zadanie);
    }

    public static boolean sprawdzenie(int liczba, int proba, int strona) {
        int pomoc = proba / 2 + strona;
        System.out.println("Czy podana liczba to " + pomoc);

        if (liczba == pomoc) {
            System.out.println("Liczba " + pomoc + " jest liczbą wylosowaną wylosowaną" + liczba);
            return true;
        } else if (liczba < pomoc) {
            System.out.println("Liczba " + pomoc + " jest liczbą za dużą");
            return sprawdzenie(liczba, proba / 2, strona);
        } else {
            System.out.println("Liczba " + pomoc + " jest liczbą za małą" );
            return sprawdzenie(liczba, proba / 2, pomoc + 1);
        }
    }
}
