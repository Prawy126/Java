public class Main3 {

    public static void main() {
        // Start generowania optymalnej kombinacji smaków lodów
        generujOptymalnaKolejnoscSmakow(0);

        // Wydrukuj najlepszą kombinację smaków lodów
        System.out.println("Najlepsza kombinacja smakow to na przyklad: ");
        for (int indeks = 0; indeks < liczbaSmakow + 1; indeks++) {
            System.out.print(najlepszaKolejnoscSmakow[indeks] + " ");
        }
        System.out.println("\nCzas potrzebny do przestrojenia maszyn wynosi wtedy " + najlepszyCzasPrzestrojenia);
    }

    // Tablica przechowująca czasy przestrojenia maszyn dla różnych smaków lodów.
    static int[][] czasyPrzestrojeniaMaszyn = {
        {0, 7, 20, 21, 12, 23},
        {27, 0, 13, 16, 46, 5},
        {53, 15, 0, 25, 27, 6},
        {16, 2, 35, 0, 47, 10},
        {31, 29, 5, 18, 0, 4},
        {28, 24, 1, 17, 5, 0}
    };

    // Całkowita liczba dostępnych smaków lodów.
    final static int liczbaSmakow = czasyPrzestrojeniaMaszyn.length;
    static int[] aktualnaKolejnoscSmakow = new int[liczbaSmakow + 1];

    // Przechowuje najlepszy dotychczas znaleziony czas przestrojenia maszyn.
    static int najlepszyCzasPrzestrojenia = Integer.MAX_VALUE;
    // Przechowuje optymalną kolejność smaków lodów.
    static int[] najlepszaKolejnoscSmakow = new int[liczbaSmakow + 1];

    // Funkcja rekurencyjna do generowania optymalnej kombinacji smaków lodów.
    static void generujOptymalnaKolejnoscSmakow(int poziom) {
        int lokalnyCzasPrzestrojenia = 0;

        if (poziom == liczbaSmakow) {
            // Dopisz pierwszy smak na końcu, aby wrócić do pierwotnego stanu maszyny.
            aktualnaKolejnoscSmakow[liczbaSmakow] = aktualnaKolejnoscSmakow[0];

            for (int indeks = 0; indeks < liczbaSmakow; indeks++) {
                lokalnyCzasPrzestrojenia += czasyPrzestrojeniaMaszyn[aktualnaKolejnoscSmakow[indeks]-1][aktualnaKolejnoscSmakow[indeks+1]-1];
            }

            // Aktualizuj optymalną kolejność smaków lodów, jeśli znaleziono lepszy czas przestrojenia.
            if (lokalnyCzasPrzestrojenia < najlepszyCzasPrzestrojenia) {
                najlepszyCzasPrzestrojenia = lokalnyCzasPrzestrojenia;
                System.arraycopy(aktualnaKolejnoscSmakow, 0, najlepszaKolejnoscSmakow, 0, liczbaSmakow + 1);
            }

        } else {
            for (int indeksSmaku = 1; indeksSmaku <= liczbaSmakow; indeksSmaku++) {
                int tempIndeks;
                for (tempIndeks = 0; tempIndeks < poziom; tempIndeks++) {
                    if (aktualnaKolejnoscSmakow[tempIndeks] == indeksSmaku) break;
                }
                if (tempIndeks == poziom) {
                    aktualnaKolejnoscSmakow[tempIndeks] = indeksSmaku;
                    generujOptymalnaKolejnoscSmakow(poziom + 1);
                }
            }
        }
    }
}
