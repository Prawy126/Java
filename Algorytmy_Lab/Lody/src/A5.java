public class A5 {

    // Dwuwymiarowa tablica reprezentująca czasy przestrojenia pomiędzy maszynami.
    private static int[][] czasyPrzestrojenia = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    // Tablica określająca, które maszyny zostały już odwiedzone w danym momencie algorytmu.
    private static boolean[] odwiedzoneMaszyny = new boolean[6];

    // Aktualna trasa/kolejność maszyn.
    private static int[] aktualnaTrasa = new int[7];

    // Najlepsza (optymalna) trasa/kolejność maszyn.
    private static int[] najlepszaTrasa = new int[7];

    // Aktualnie znaleziony najkrótszy czas przestrojenia.
    private static int najlepszyCzas = Integer.MAX_VALUE;

    public static void main(String[] args) {
        aktualnaTrasa[0] = 0;
        aktualnaTrasa[6] = 0;

        // Rozpoczęcie procedury szukania optymalnej trasy.
        przeszukajOptymalnaTrase(1);

        System.out.println("Minimalny czas przestrojenia: " + najlepszyCzas);
        System.out.print("Najlepsza kolejność: 1 ");
        for (int i = 1; i <= 6; i++) {
            System.out.print((najlepszaTrasa[i] + 1) + " ");
        }
    }

    /**
     * Metoda przeszukiwania z nawrotami do znalezienia optymalnej trasy.
     * @param krok Aktualny krok w przeszukiwaniu.
     */
    private static void przeszukajOptymalnaTrase(int krok) {
        if (krok == 6) {
            int obecnyCzas = 0;

            // Obliczanie kosztu dla danej trasy.
            for (int i = 0; i < 6; i++) {
                obecnyCzas += czasyPrzestrojenia[aktualnaTrasa[i]][aktualnaTrasa[i + 1]];
                System.out.println("Czas po dodaniu elementu[" + i + "][" + (i + 1) + "]: " + obecnyCzas);
            }

            // Jeśli obliczony czas jest mniejszy niż najlepszyCzas, aktualizujemy wartość najlepszyCzas oraz kopjujemy aktualną trasę jako najlepszą.
            if (obecnyCzas < najlepszyCzas) {
                najlepszyCzas = obecnyCzas;
                System.arraycopy(aktualnaTrasa, 0, najlepszaTrasa, 0, 7);
            }

            // Wyświetlanie informacji o sprawdzanej trasie oraz jej czasie.
            System.out.print("\nSprawdzana kolejność: 1 ");
            for (int i = 1; i < 6; i++) {
                System.out.print((aktualnaTrasa[i] + 1) + " ");
            }
            System.out.println(", Czas: " + obecnyCzas + "\n");
            return;
        }

        // Iteracja przez wszystkie maszyny, próbując każdej kombinacji.
        for (int i = 1; i < 6; i++) {
            // Jeśli maszyna nie była jeszcze odwiedzona, dodajemy ją do trasy i oznaczamy jako odwiedzoną.
            if (!odwiedzoneMaszyny[i]) {
                System.out.printf("Aktualnie zamienione elementy: [" + i + "] [" + (i + 1) + "]\n");
                aktualnaTrasa[krok] = i;
                odwiedzoneMaszyny[i] = true;

                // Rekursywnie wywołujemy metodę dla następnego kroku.
                przeszukajOptymalnaTrase(krok + 1);

                // Po powrocie z rekursji, oznaczamy maszynę jako nieodwiedzoną, co pozwala na przeszukiwanie innych tras.
                odwiedzoneMaszyny[i] = false;
            }
        }
    }
}

