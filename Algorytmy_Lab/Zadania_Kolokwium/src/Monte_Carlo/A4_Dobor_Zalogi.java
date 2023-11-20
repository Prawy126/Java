package Monte_Carlo;

import java.util.Random;

public class A4_Dobor_Zalogi {
    public static void main(String[] args) {
        final int[][] umiejetnosciKosmonautow = {
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        Random rand = new Random();
        String najlepszeRozwiazanie = "";
        int minAstronautow = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            int liczbaAstronautow = 0;
            String rozwiazanie = "";
            boolean[] wymaganeUmiejetnosci = new boolean[umiejetnosciKosmonautow[0].length];
            boolean[] wybraniKosmonauci = new boolean[umiejetnosciKosmonautow.length];

            while (true) {
                int wybranyKosmonaut = rand.nextInt(umiejetnosciKosmonautow.length);

                if (!wybraniKosmonauci[wybranyKosmonaut]) {
                    wybraniKosmonauci[wybranyKosmonaut] = true;
                    rozwiazanie += (wybranyKosmonaut + 1) + " ";
                    liczbaAstronautow++;

                    for (int j = 0; j < wymaganeUmiejetnosci.length; j++) {
                        if (umiejetnosciKosmonautow[wybranyKosmonaut][j] == 1) {
                            wymaganeUmiejetnosci[j] = true;
                        }
                    }
                }

                boolean wszystkieUmiejetnosciPokryte = true;
                for (int j = 0; j < wymaganeUmiejetnosci.length; j++) {
                    if (!wymaganeUmiejetnosci[j]) {
                        wszystkieUmiejetnosciPokryte = false;
                        break;
                    }
                }

                if (wszystkieUmiejetnosciPokryte) {
                    if (liczbaAstronautow < minAstronautow) {
                        minAstronautow = liczbaAstronautow;
                        najlepszeRozwiazanie = rozwiazanie;
                    }
                    break;
                }
            }
        }

        System.out.println("Mogą polecieć: " + najlepszeRozwiazanie);
    }
}
