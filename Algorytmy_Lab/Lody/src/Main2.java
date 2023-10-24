public class Main2 {

    // Tablica przechowująca czasy przestrojenia maszyny dla różnych smaków lodów.
    static int[][] tabelaCzasowPrzestrojenia = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    final static int LICZBA_SMAKOW = 6; // Stała określająca liczbę dostępnych smaków lodów.
    private static int[] aktualnyPorzadekSmakow = new int[LICZBA_SMAKOW];
    static String najlepszyPorzadekSmakow = "";
    static int najmniejszyCzasPrzestrojenia = Integer.MAX_VALUE;
    static String komunikatWynikowy = "";

    public static void main(String[] args) {
        znajdzNajlepszaKolejnoscSmakow(0);
        System.out.println(komunikatWynikowy);
    }

    // Funkcja rekurencyjna do generowania wszystkich permutacji kolejności smaków lodów.
    static void znajdzNajlepszaKolejnoscSmakow(int poziomRekursji) {
        komunikatWynikowy = "";
        int czasPowrotuNaStart = 0;
        int sumaCzasowPrzestrojenia = 0;
        String aktualnaKolejnosc = "";

        if (poziomRekursji == LICZBA_SMAKOW) {
            for (int indeks = 0; indeks < LICZBA_SMAKOW - 1; indeks++) {
                czasPowrotuNaStart = tabelaCzasowPrzestrojenia[aktualnyPorzadekSmakow[indeks + 1] - 1][aktualnyPorzadekSmakow[0] - 1];
                sumaCzasowPrzestrojenia += tabelaCzasowPrzestrojenia[aktualnyPorzadekSmakow[indeks] - 1][aktualnyPorzadekSmakow[indeks + 1] - 1];
            }

            for (int indeks = 0; indeks < LICZBA_SMAKOW; indeks++) {
                aktualnaKolejnosc += aktualnyPorzadekSmakow[indeks] + ", ";
            }
            aktualnaKolejnosc += aktualnyPorzadekSmakow[0];
            sumaCzasowPrzestrojenia += czasPowrotuNaStart;

            if (sumaCzasowPrzestrojenia < najmniejszyCzasPrzestrojenia) {
                najmniejszyCzasPrzestrojenia = sumaCzasowPrzestrojenia;
                najlepszyPorzadekSmakow = aktualnaKolejnosc;
            }

        } else {
            for (int indeksSmaku = 1; indeksSmaku <= LICZBA_SMAKOW; indeksSmaku++) {
                int k;
                for (k = 0; k < poziomRekursji; k++) {
                    if (aktualnyPorzadekSmakow[k] == indeksSmaku) {
                        break;
                    }
                }
                if (k == poziomRekursji) {
                    aktualnyPorzadekSmakow[k] = indeksSmaku;
                    znajdzNajlepszaKolejnoscSmakow(poziomRekursji + 1);
                }
            }
        }
        komunikatWynikowy = "Najlepszy czas zrobienia wszystkich smaków to: " + najmniejszyCzasPrzestrojenia + " i wychodzi na to, że najlepsza kolejność to np: " + najlepszyPorzadekSmakow;
    }
}
