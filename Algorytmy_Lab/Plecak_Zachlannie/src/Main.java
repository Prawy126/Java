public class Main {

    // Definicje tablic z objętościami i wartościami przedmiotów oraz maksymalną pojemnością plecaka
    final static int[] objetosci = {6, 2, 3, 2, 3, 1}; // Tablica zawierająca objętości przedmiotów
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};  // Tablica zawierająca wartości przedmiotów
    final static int MAX = 10;  // Maksymalna pojemność plecaka
    final static int liczbaPrzedmiotow = objetosci.length;  // Liczba dostępnych przedmiotów

    public static void main(String[] args) {
        // Wywołanie metod rozwiązujących problem plecakowy różnymi metodami
        plecakPoObjetosci();   // Metoda rozwiązująca problem plecakowy bazując na objętości
        plecakPoWartosci();    // Metoda rozwiązująca problem plecakowy bazując na wartości
        plecakPoWspolczynniku(); // Metoda rozwiązująca problem plecakowy bazując na stosunku wartości do objętości
    }

    // Metoda rozwiązująca problem plecakowy bazując na objętości
    public static void plecakPoObjetosci() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow]; // Tablica przechowująca informacje, które przedmioty zostały wybrane
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false; // Inicjalizacja tablicy wybranych przedmiotów wartościami false
        }

        int objetoscWlozona = 0; // Zmienna przechowująca łączną objętość przedmiotów w plecaku
        int wartoscWlozona = 0;  // Zmienna przechowująca łączną wartość przedmiotów w plecaku

        // Główna pętla algorytmu
        while (true) {
            int najmniejszaObjetosc = Integer.MAX_VALUE; // Zmienna przechowująca wartość najmniejszej objętości spośród dostępnych przedmiotów
            int pozycja = -1; // Zmienna przechowująca indeks aktualnie rozpatrywanego przedmiotu

            // Pętla wyszukująca przedmiot o najmniejszej objętości, który można dodać do plecaka
            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && objetoscWlozona + objetosci[i] <= MAX && objetosci[i] < najmniejszaObjetosc) {
                    najmniejszaObjetosc = objetosci[i];
                    pozycja = i;
                }
            }

            // Logika dodawania wybranego przedmiotu do plecaka
            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break; // Wyjście z pętli, gdy nie ma więcej przedmiotów do dodania
            }
        }

        // Wypisanie wyników
        System.out.print("Najmniejsza objętość\t\t\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " "); // Wypisanie indeksów wybranych przedmiotów
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona); // Wypisanie łącznej wartości przedmiotów w plecaku
    }

    // Metoda rozwiązująca problem plecakowy bazując na wartości przedmiotów
    public static void plecakPoWartosci() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow]; // Tablica przechowująca informacje, które przedmioty zostały wybrane
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false; // Inicjalizacja tablicy wybranych przedmiotów wartościami false
        }

        int objetoscWlozona = 0; // Zmienna przechowująca łączną objętość przedmiotów w plecaku
        int wartoscWlozona = 0;  // Zmienna przechowująca łączną wartość przedmiotów w plecaku

        // Główna pętla algorytmu
        while (true) {
            int pozycja = -1; // Zmienna przechowująca indeks aktualnie rozpatrywanego przedmiotu
            int maksymalnaWartosc = Integer.MIN_VALUE; // Zmienna przechowująca wartość największej wartości spośród dostępnych przedmiotów

            // Pętla wyszukująca przedmiot o największej wartości, który można dodać do plecaka
            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && wartosci[i] > maksymalnaWartosc && objetosci[i] + objetoscWlozona <= MAX) {
                    maksymalnaWartosc = wartosci[i];
                    pozycja = i;
                }
            }

            // Logika dodawania wybranego przedmiotu do plecaka
            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break; // Wyjście z pętli, gdy nie ma więcej przedmiotów do dodania
            }
        }

        // Wypisanie wyników
        System.out.print("Najwyższa wartość\t\t\t\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " "); // Wypisanie indeksów wybranych przedmiotów
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona); // Wypisanie łącznej wartości przedmiotów w plecaku
    }

    // Metoda rozwiązująca problem plecakowy bazując na współczynniku wartości do objętości
    public static void plecakPoWspolczynniku() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow]; // Tablica przechowująca informacje, które przedmioty zostały wybrane
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false; // Inicjalizacja tablicy wybranych przedmiotów wartościami false
        }

        double[] wspolczynniki = new double[liczbaPrzedmiotow]; // Tablica współczynników wartości do objętości przedmiotów
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            wspolczynniki[i] = (double) wartosci[i] / objetosci[i]; // Obliczenie współczynnika dla każdego przedmiotu
        }

        int wartoscWlozona = 0; // Zmienna przechowująca łączną wartość przedmiotów w plecaku
        int objetoscWlozona = 0; // Zmienna przechowująca łączną objętość przedmiotów w plecaku

        // Główna pętla algorytmu
        while (true) {
            int pozycja = -1; // Zmienna przechowująca indeks

            double najwyzszyWspolczynnik = Double.MIN_VALUE;

            // Sprawdzenie, czy dany przedmiot nie został jeszcze wybrany,
            // czy jego współczynnik jest większy niż najwyższy dotychczas znaleziony współczynnik,
            // oraz czy dodanie jego objętości nie przekroczy maksymalnej dopuszczalnej objętości.
            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && najwyzszyWspolczynnik < wspolczynniki[i] && objetoscWlozona + objetosci[i] <= MAX) {
                    // Zapisanie pozycji aktualnie rozpatrywanego przedmiotu,
                    // który spełnia warunki jako potencjalny kandydat do włożenia do plecaka.
                    pozycja = i;
                    // Aktualizacja wartości najwyższego współczynnika na wartość współczynnika bieżącego przedmiotu.
                    najwyzszyWspolczynnik = wspolczynniki[i];
                }
            }

            // Sprawdzenie, czy znaleziono przedmiot spełniający kryteria do włożenia do plecaka.
            if (pozycja > -1) {
                // Dodanie wartości wybranego przedmiotu do sumy wartości już włożonych przedmiotów.
                wartoscWlozona += wartosci[pozycja];
                // Dodanie objętości wybranego przedmiotu do sumy objętości już włożonych przedmiotów.
                objetoscWlozona += objetosci[pozycja];
                // Oznaczenie, że wybrany przedmiot został już włożony do plecaka.
                wybranePrzedmioty[pozycja] = true;
            } else {
                // Przerwanie pętli, jeśli nie znaleziono żadnego odpowiedniego przedmiotu do włożenia.
                break;
            }
        }

        // Wypisanie informacji o wybranych przedmiotach i sumarycznej wartości tych przedmiotów.
        System.out.print("Najwyższy wpółczynnki wartości\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            // Wypisanie indeksów przedmiotów, które zostały wybrane.
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        // Wypisanie sumarycznej wartości włożonych przedmiotów.
        System.out.println("\tWartość: " + wartoscWlozona);
    }
}
