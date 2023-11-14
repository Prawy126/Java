public class Main {

    final static int[] objetosci = {6, 2, 3, 2, 3, 1}; // Tablica zawierająca objętości przedmiotów
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};  // Tablica zawierająca wartości przedmiotów
    final static int MAX = 10;  // Maksymalna pojemność plecaka
    final static int liczbaPrzedmiotow = objetosci.length;  // Liczba dostępnych przedmiotów

    public static void main(String[] args) {
        plecakPoObjetosci();   // Wywołanie funkcji rozwiązującej problem plecakowy po objętości
        plecakPoWartosci();    // Wywołanie funkcji rozwiązującej problem plecakowy po wartościach
        plecakPoWspolczynniku(); // Wywołanie funkcji rozwiązującej problem plecakowy po współczynniku wartości do objętości
    }

    public static void plecakPoObjetosci() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow];
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false;
        }

        int objetoscWlozona = 0;
        int wartoscWlozona = 0;

        while (true) {
            int najmniejszaObjetosc = Integer.MAX_VALUE;
            int pozycja = -1;

            // Szukaj przedmiotu o najmniejszej objętości, który można włożyć do plecaka.
            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && objetoscWlozona + objetosci[i] <= MAX && objetosci[i] < najmniejszaObjetosc) {
                    najmniejszaObjetosc = objetosci[i];
                    pozycja = i;
                }
            }

            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break;
            }
        }

        System.out.print("Najmniejsza objętość\t\t\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona);
    }

    public static void plecakPoWartosci() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow];
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false;
        }

        int objetoscWlozona = 0;
        int wartoscWlozona = 0;

        while (true) {
            int pozycja = -1;
            int maksymalnaWartosc = Integer.MIN_VALUE;

            // Szukaj przedmiotu o największej wartości, który można włożyć do plecaka.
            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && wartosci[i] > maksymalnaWartosc && objetosci[i] + objetoscWlozona <= MAX) {
                    maksymalnaWartosc = wartosci[i];
                    pozycja = i;
                }
            }

            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break;
            }
        }

        System.out.print("Najwyższa wartość\t\t\t\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona);
    }

    public static void plecakPoWspolczynniku() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow];
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false;
        }

        double[] wspolczynniki = new double[liczbaPrzedmiotow];
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            wspolczynniki[i] = (double) wartosci[i] / objetosci[i];
        }

        int wartoscWlozona = 0;
        int objetoscWlozona = 0;

        while (true) {
            int pozycja = -1;
            double najwyzszyWspolczynnik = Double.MIN_VALUE;

            // Szukaj przedmiotu o najwyższym współczynniku wartości do objętości, który można włożyć do plecaka.
            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && najwyzszyWspolczynnik < wspolczynniki[i] && objetoscWlozona + objetosci[i] <= MAX) {
                    pozycja = i;
                    najwyzszyWspolczynnik = wspolczynniki[i];
                }
            }

            if (pozycja > -1) {
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
                wybranePrzedmioty[pozycja] = true;
            } else {
                break;
            }
        }

        System.out.print("Najwyższy wpółczynnki wartości\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona);
    }
}
