package Programowanie_Dynamiczne;

import java.util.Random;

public class A6_Losowanie_Liczby {
    public static void main(String[] args) {
        Random generatorLosowychLiczb = new Random();
        final int ZAKRES = 1000;
        int iloscProbek = 0;
        int potegaDwojki = 1;

        // Znajdowanie ilosci probek bez wykorzystania Math.log
        while (potegaDwojki < ZAKRES) {
            potegaDwojki *= 2;
            iloscProbek++;
        }

        int szukanaLiczba = generatorLosowychLiczb.nextInt(ZAKRES + 1);
        int[][] przedzialy = new int[3][iloscProbek];
        przedzialy[0][0] = 0;
        przedzialy[2][0] = ZAKRES;

        for (int i = 0; i < iloscProbek; i++) {
            przedzialy[1][i] = (przedzialy[0][i] + przedzialy[2][i]) / 2;

            if (przedzialy[1][i] == szukanaLiczba) {
                System.out.println("Zgadłeś, liczba to " + szukanaLiczba);
                break;
            } else if (przedzialy[1][i] > szukanaLiczba) {
                System.out.println(przedzialy[1][i] + " za duża");
                if (i < iloscProbek - 1) {
                    przedzialy[0][i + 1] = przedzialy[0][i];
                    przedzialy[2][i + 1] = przedzialy[1][i];
                }
            } else {
                System.out.println(przedzialy[1][i] + " za mała");
                if (i < iloscProbek - 1) {
                    przedzialy[0][i + 1] = przedzialy[1][i];
                    przedzialy[2][i + 1] = przedzialy[2][i];
                }
            }
        }
    }
}
