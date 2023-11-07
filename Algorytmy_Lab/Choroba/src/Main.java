class Main {

    final static int MAX_LICZBA_OSOB = 100000; // Maksymalna liczba osób w populacji
    static int liczbaChorych = 10; // Początkowa liczba chorych osób
    static int liczbaZdrowych = MAX_LICZBA_OSOB - liczbaChorych; // Początkowa liczba zdrowych osób
    static int liczbaOdpornych = 0; // Początkowa liczba odpornych osób
    static int dzien = 0; // Licznik dni
    static int[] liczbaChorychDziennie = new int[50]; // Tablica przechowująca liczbę chorych osób każdego dnia
    static int[] liczbaOzdrowialychDziennie = new int[50]; // Tablica przechowująca liczbę osób, które wyzdrowiały każdego dnia

    // Metoda symulująca rozprzestrzenianie się choroby
    public static int rozprzestrzeniajChorobe(int liczbaChorych, int dzien) {
        liczbaChorychDziennie[dzien] = liczbaChorych;
        liczbaZdrowych -= liczbaChorychDziennie[dzien];

        // Uzupełniamy dane na kolejny dzień, ludzie zdrowieją po 7 dniach
        if (dzien > 6) {
            liczbaOzdrowialychDziennie[dzien] = liczbaChorychDziennie[dzien - 7];
            liczbaChorychDziennie[dzien] = liczbaChorychDziennie[dzien] - liczbaChorychDziennie[dzien - 7];
        }

        // Zliczamy ilość obecnie odpornych (maksymalnie 14 dni wstecz, bo wtedy znowu można zachorować)
        liczbaOdpornych = 0;
        if (dzien < 14) {
            for (int i = dzien; i >= 0; i--) {
                liczbaOdpornych += liczbaOzdrowialychDziennie[i];
            }
        }
        if (dzien >= 14) {
            for (int i = dzien; i >= dzien - 14; i--) {
                liczbaOdpornych += liczbaOzdrowialychDziennie[i];
            }
        }

        // Sprawdzamy, czy liczba chorych jest wystarczająco duża, aby zatrzymać symulację
        if (liczbaChorychDziennie[dzien] * 3 >= liczbaZdrowych + liczbaOdpornych) {
            System.out.println("Dzień: " + dzien + " Chorzy: " + liczbaChorych + " Ludzie: " + liczbaZdrowych + " Odporni: " + liczbaOdpornych);
            System.out.println("Liczba: " + (liczbaChorych + liczbaZdrowych + liczbaOdpornych));
            System.out.println("Ilość chorych w kolejnych dniach:");
            for (int i = 0; i < liczbaChorychDziennie.length; i++) {
                System.out.print("[" + liczbaChorychDziennie[i] + "] ");
            }
            System.out.println();
            return dzien; // Zakończenie symulacji i zwrócenie numeru dnia
        } else {
            return rozprzestrzeniajChorobe(liczbaChorychDziennie[dzien] * 3, dzien + 1); // Rekurencyjne wywołanie symulacji na kolejny dzień
        }
    }

    public static void main(String[] args) {
        rozprzestrzeniajChorobe(liczbaChorych, dzien); // Rozpoczęcie symulacji z początkową liczbą chorych i dniem równym 0
    }
}
