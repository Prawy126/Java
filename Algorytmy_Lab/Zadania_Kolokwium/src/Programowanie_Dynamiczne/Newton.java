package Programowanie_Dynamiczne;

public class Newton {

    public static int calculateNewtonSymbol(int n, int k) {
        int[][] table = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (i < j) {
                    table[i][j] = 0;
                } else if (i == j || j == 0) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = table[i - 1][j - 1] + table[i - 1][j];
                }
            }
        }

        return table[n][k];
    }

    public static void main(String[] args) {
        final int n = 5;
        final int k = 3;

        int result = calculateNewtonSymbol(n, k);
        System.out.println("Wynik: " + result);
    }
}

