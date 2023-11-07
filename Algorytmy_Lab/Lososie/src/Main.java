public class Main {

    static boolean przekroczonaPolowa; // Zmienna do śledzenia, czy przekroczono połowę maksymalnej liczby łososi
    final static int MAX_LICZBA_LOSOSI = 1000000; // Maksymalna liczba łososi w ekosystemie

    // Metoda symulująca ekosystem łososi
    public static void ekosystemLososi(int liczbaLososi, int minuty) {
        if (liczbaLososi < MAX_LICZBA_LOSOSI / 2 && !przekroczonaPolowa) {
            System.out.println("Przekroczona połowa: po " + minuty + " minutach");
            przekroczonaPolowa = true; // Ustawienie flagi, że przekroczono połowę
        }
        if (liczbaLososi < 100) {
            System.out.println("Populacja wymrze po " + minuty + " minutach");
            return; // Zakończenie symulacji, gdy liczba łososi spadnie poniżej 100
        }

        // Aktualizacja liczby łososi w oparciu o wzrost i umieranie
        liczbaLososi = (int) (((liczbaLososi * Math.exp(0.003)) * 0.998) * 0.998);
        ekosystemLososi(liczbaLososi, minuty + 1); // Rekurencyjne wywołanie symulacji dla nowej liczby łososi
    }

    public static void main(String[] args) {
        ekosystemLososi(MAX_LICZBA_LOSOSI, 0); // Rozpoczęcie symulacji z maksymalną liczbą łososi
    }
}
