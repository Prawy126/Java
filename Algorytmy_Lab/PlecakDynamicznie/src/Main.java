public class Main {
    public static void main(String[] args) {
        final int[] objetosci = {6, 2, 3, 2, 3, 1};
        final int[] wartosci = {6, 4, 5, 7, 10, 2};
        final int MAX = 10;
        final int iloscPrzedmiotow = objetosci.length;
        int[][] tablicaWynikow = new int[iloscPrzedmiotow][MAX+1];

        for (int i=0; i<iloscPrzedmiotow; i++) {
            for (int j=0; j<MAX+1; j++) {
                if (i == 0 && objetosci[i] > j) {
                    tablicaWynikow[i][j] = 0;
                } else if (i == 0 && objetosci[i] <= j) {
                    tablicaWynikow[i][j] = wartosci[i];
                } else if (i > 0 && objetosci[i] > j) {
                    tablicaWynikow[i][j] = tablicaWynikow[i-1][j];
                } else if (i > 0 && objetosci[i] <= j) {
                    tablicaWynikow[i][j] = Math.max(tablicaWynikow[i - 1][j], wartosci[i] + tablicaWynikow[i - 1][j - objetosci[i]]);
                }
            }
        }

        System.out.println(tablicaWynikow[iloscPrzedmiotow-1][MAX]);
    }
}
