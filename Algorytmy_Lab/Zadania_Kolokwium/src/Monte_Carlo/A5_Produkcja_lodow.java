package Monte_Carlo;

import java.util.Random;

public class A5_Produkcja_lodow {
    public static void main(String[] args) {
        final int[][] koszty = {
                {0, 7, 20, 21, 12, 23},
                {27, 0, 13, 16, 46, 5},
                {53, 15, 0, 25, 27, 6},
                {16, 2, 35, 0, 47, 10},
                {31, 29, 5, 18, 0, 4},
                {28, 24, 1, 17, 5, 0}
        };

        Random rand = new Random();
        int minSumaKosztow = Integer.MAX_VALUE;
        String najlepszaKolejnosc = "";
        int start = -1;

        for (int i = 0; i < 100; i++) {
            int sumaKosztow = 0;
            String kolejnoscProdukcji = "";
            int wiersz = rand.nextInt(koszty.length);
            int globalnyWiersz = wiersz;
            kolejnoscProdukcji += (wiersz + 1) + " ";
            boolean[] juzZrobione = new boolean[koszty.length];
            juzZrobione[wiersz] = true;

            while (true) {
                int smak = rand.nextInt(juzZrobione.length);

                if (!juzZrobione[smak] && koszty[wiersz][smak] > 0) {
                    sumaKosztow += koszty[wiersz][smak];
                    juzZrobione[smak] = true;
                    wiersz = smak;
                    kolejnoscProdukcji += (smak + 1) + " ";
                }

                boolean wszystkieGotowe = true;
                for (int j = 0; j < juzZrobione.length; j++) {
                    if (!juzZrobione[j]) {
                        wszystkieGotowe = false;
                        break;
                    }
                }

                if (wszystkieGotowe) {
                    if (minSumaKosztow > sumaKosztow) {
                        minSumaKosztow = sumaKosztow + koszty[wiersz][globalnyWiersz];
                        najlepszaKolejnosc = kolejnoscProdukcji;
                        start = globalnyWiersz;
                    }
                    break;
                }
            }
        }

        System.out.print("Kolejność produkcji: " + najlepszaKolejnosc + "\nZaczęcie z: " + (start + 1) + "\n");
        System.out.println("O koszcie " + minSumaKosztow);
    }
}
