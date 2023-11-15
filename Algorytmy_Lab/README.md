# Treść zadań:

## A.1 Decyzyjny problem plecekowy :

any jest plecak o objętości v = 10 oraz 6 przedmiotów ponumerowanych od 0 do 5. Każdy
przedmiot ma określoną wartość Wi
i objętość Vi
. Należy zapakować plecak spośród przedmiotów
ponumerowanych od 0 do 5 w taki sposób, aby wartość przedmiotów w nim zgromadzonych była
największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:

| i    | 0 | 1 | 2 | 3 | 4  | 5 |
|------|---|---|---|---|----|---|
| v(i) | 6 | 2 | 3 | 2 | 3  | 1 |
| w(i) | 6 | 4 | 5 | 7 | 10 | 2 |

Odp: W plecaku o maksymalnej wartości znajdą się przedmioty 1,2,3,4 o wartości 26.

#### Przykład rowiązania tego problemu metodą programowania dynamicznego
```java
        // Definicja tablic z wagami i wartościami przedmiotów
        final int[] objetosci = {6, 2, 3, 2, 3, 1};
        final int[] wartosci = {6, 4, 5, 7, 10, 2};

        // Maksymalna pojemność plecaka
        final int MAX = 10;

        // Liczba dostępnych przedmiotów
        final int iloscPrzedmiotow = objetosci.length;

        // Tablica wyników przechowująca maksymalne wartości plecaka dla różnych kombinacji przedmiotów i pojemności plecaka
        int[][] tablicaWynikow = new int[iloscPrzedmiotow][MAX+1];

        // Wypełnianie tablicy wyników algorytmem rozwiązywania problemu plecaka
        for (int i=0; i<iloscPrzedmiotow; i++) {
            for (int j=0; j<MAX+1; j++) {
                if (i == 0 && objetosci[i] > j) {
                    // Jeśli to pierwszy przedmiot i jego waga jest większa niż pojemność plecaka, to nie możemy go umieścić w plecaku
                    tablicaWynikow[i][j] = 0;
                } else if (i == 0 && objetosci[i] <= j) {
                    // Jeśli to pierwszy przedmiot i jego waga jest mniejsza lub równa pojemności plecaka, to umieszczamy go w plecaku
                    tablicaWynikow[i][j] = wartosci[i];
                } else if (i > 0 && objetosci[i] > j) {
                    // Jeśli waga aktualnego przedmiotu jest większa niż pojemność plecaka, nie możemy go umieścić, więc bierzemy wynik z poprzedniego wiersza
                    tablicaWynikow[i][j] = tablicaWynikow[i-1][j];
                } else if (i > 0 && objetosci[i] <= j) {
                    // Jeśli możemy umieścić przedmiot w plecaku, wybieramy maksimum spośród dwóch możliwości: wzięcie przedmiotu lub pozostawienie go
                    tablicaWynikow[i][j] = Math.max(tablicaWynikow[i - 1][j], wartosci[i] + tablicaWynikow[i - 1][j - objetosci[i]]);
                }
            }
        }


```
- [Pełne rozwiązanie metodą programowania dynamicznego](https://github.com/Prawy126/Java/tree/main/Algorytmy_Lab/PlecakDynamicznie)  
- [Pełne rozwiązanie metodą algorytmu zachłannego](https://github.com/Prawy126/Java/tree/main/Algorytmy_Lab/Plecak_Zachlannie)  


# A.5 Problem wyprodukowania lodów wszystkich smaków
Fabryka lodów każdego dnia produkuje na tej samej maszynie lody o sześciu różnych smakach.
Zmiana produkcji ze smaku i na smak j wymaga przestrojenia maszyny, czyli przygotowania
(w tym umycia) do nowej produkcji, które trwa określony czas. Podana niżej tablica zawiera
informację o czasach przestrojenia maszyny.

| **j**/**i** | 1 | 2 | 3  | 4  | 5  | 6  |
|-------------|---|---|----|----|----|----|
| 1           | 0 | 7 | 20 | 21 | 12 | 23 |
| 2           | 27 | 0 | 13 | 16 | 46 | 5  |
| 3           | 53 | 15 | 0 | 25 | 27 | 6  |
| 4           | 16 | 2 | 35 | 0 | 47 | 10 |
| 5           | 31 | 29 | 5 | 18 | 0 | 4  |
| 6 |28 | 24 | 1 | 17 | 5 | 0|

#### Rozwiązanie zadania
```java
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
```

Znaleźć kolejność produkcji, przy której całkowity czas przestrojenia maszyny jest miniąmalny. Przyjąć, że na koniec dnia maszyna ma być przygotowana do produkcji w następnym dniu.


___Odp: Minimalny całkowity czas przestrojenia maszyny wynosi 63. Oto przykładowa kolejność
produkcji lodów, dla której całkowity czas przestrojenia maszyny jest minimalny: 1,2,6,5,3,4,1.___

- [Całe rowiązanie metodą generowania i testowania](https://github.com/Prawy126/Java/tree/main/Algorytmy_Lab/Lody)

# A.6 Problem odgadywania liczb
Jak odgadnąć liczbę pomyślaną przez rozmówcę z zakresu od 0 do 1000, zadając jak nająmniejszą liczbę pytań rozmówcy? Przy czym, pytania zadawane rozmówcy muszą być jedynie
typu: „Czy to jest liczba 546?”, na które rozmówca może odpowiadać na jeden z następujących
sposobów: „TAK”, „ZA MAŁA” lub „ZA DUŻA”.

```java
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

```
- [Rozwiązanie zadania metodą dziel i zwyciężaj](https://github.com/Prawy126/Java/blob/main/Algorytmy_Lab/Zgadywanie)

# A.20 Problem przewidywania liczebności królików
roku 1202 Leonardo Fibonacci sformułował następujący, obecnie bardzo popularny w informatyce problem, dotyczący rozmnażania się królików. Na początku mamy parę nowonarodzonych
królików i o każdej parze królików zakładamy, że:  
• nowa para staje się płodna po miesiącu życia,  
• każda płodna para rodzi jedną parę nowych królików w miesiącu,  
• króliki nigdy nie umierają.  
W oparciu o powyższe warunki, Fibonacci sformułował następujące pytanie: ile będzie par królików po upływie roku, które można uogólnić pytając o to: ile będzie par królików po upływie n
miesięcy? Liczbę tę zwykle oznacza się przez Fn, jest ona nazywana liczbą Fibonacciego. Przeprowadzić symulację mająca na celu stwierdzenie: po ilu miesiącach populacja królików osiągnie:
100, 1000, 10000, 100000 oraz 1 milion par.

```java
    static boolean przekroczonaSto, przekroczonaTysiac, przekroczonaDziesięćTysięcy, przekroczonyMilion;

    // Metoda rekurencyjna zliczająca ilość krolików w ciągu Fibonacciego
    public static int zliczajKroliki(int n) {
        if (n == 1 || n == 2) return 1; // Warunek kończący rekurencję

        int ilośćKrolików = zliczajKroliki(n - 1) + zliczajKroliki(n - 2);

        // Sprawdzenie, czy ilość krolików przekroczyła określone wartości i wypisanie odpowiednich komunikatów
        if (ilośćKrolików > 100 && !przekroczonaSto) {
            System.out.println("Przekroczono sto: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonaSto = true;
        }

        if (ilośćKrolików > 1000 && !przekroczonaTysiac) {
            System.out.println("Przekroczono tysiąc: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonaTysiac = true;
        }

        if (ilośćKrolików > 10000 && !przekroczonaDziesięćTysięcy) {
            System.out.println("Przekroczono dziesięć tysięcy: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonaDziesięćTysięcy = true;
        }

        if (ilośćKrolików > 1000000 && !przekroczonyMilion) {
            System.out.println("Przekroczono milion: " + n + " (Ilość krolików: " + ilośćKrolików + ")");
            przekroczonyMilion = true;
        }

        return ilośćKrolików; // Zwracanie ilości krolików dla danego n
    }
```
- [Rowziązanie zadania metodą dziel i zwyciężaj](https://github.com/Prawy126/Java/blob/main/Algorytmy_Lab/Kroliki)
