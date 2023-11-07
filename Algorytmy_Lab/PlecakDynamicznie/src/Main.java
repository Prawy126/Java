public class Main {
    public static void main(String[] args) {
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

        // Wyświetlenie maksymalnej wartości plecaka dla danej pojemności
        System.out.println(tablicaWynikow[iloscPrzedmiotow-1][MAX]);
    }
}
