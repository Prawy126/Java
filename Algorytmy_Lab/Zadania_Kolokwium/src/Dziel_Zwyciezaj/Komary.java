package Dziel_Zwyciezaj;

public class Komary{

    private static void populacja(double liczbaSamców, double liczbaSamic, int tygodnie) {
        double wzrostSamców = 0.1 * 0.45 - 0.02;
        double wzrostSamic = 0.1 * 0.55 - 0.05;

        if (wzrostSamców <= wzrostSamic) {
            System.out.println("Nigdy liczba samców nie będzie większa niż liczba samic.");
            return;
        }

        double populacjaOgólna = liczbaSamców + liczbaSamic;
        liczbaSamców += (0.45 * 0.1 * populacjaOgólna) - liczbaSamców * 0.02;
        liczbaSamic += (0.55 * 0.1 * populacjaOgólna) - liczbaSamic * 0.05;
        populacjaOgólna = liczbaSamców + liczbaSamic;
        tygodnie++;

        if (Math.floor(liczbaSamców) >= Math.floor(liczbaSamic)) {
            System.out.println("Po " + tygodnie + " tygodniach liczba samców jest równa lub wyższa niż liczba samic.");
            System.out.println("Liczba osobników:\t" + (Math.floor(liczbaSamców) + Math.floor(liczbaSamic)));
            System.out.println("Samce:\t" + Math.floor(liczbaSamców));
            System.out.println("Samice:\t" + Math.floor(liczbaSamic));
            return;
        }

        populacja(liczbaSamców, liczbaSamic, tygodnie);
    }

    public static void main(String[] args) {
        populacja(450.0, 550.0, 0);
    }
}

