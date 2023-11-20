package Algorytm_Zachlanny;

public class A4_Zaloga {
    public static void main(String[] args) {
        final int[][] kosmonauci = {
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        String najlepszeRozwiazanie = "";
        int minAstronautow = Integer.MAX_VALUE;
        boolean[] zajeteUmiejetnosci = new boolean[kosmonauci[0].length];
        boolean[] wybraniKosmonauci = new boolean[kosmonauci.length];
        int liczbaAstronautow = 0;
        String rozwiazanie = "";

        while (true) {
            int najlepszyWybor = -1;
            int maxPokryteUmiejetnosci = 0;

            for (int i = 0; i < kosmonauci.length; i++) {
                if (!wybraniKosmonauci[i]) {
                    int liczbaPokrytychUmiejetnosci = 0;
                    for (int j = 0; j < zajeteUmiejetnosci.length; j++) {
                        if (kosmonauci[i][j] == 1 && !zajeteUmiejetnosci[j]) {
                            liczbaPokrytychUmiejetnosci++;
                        }
                    }
                    if (liczbaPokrytychUmiejetnosci > maxPokryteUmiejetnosci) {
                        najlepszyWybor = i;
                        maxPokryteUmiejetnosci = liczbaPokrytychUmiejetnosci;
                    }
                }
            }

            if (najlepszyWybor == -1) {
                break; // Wszystkie wymagane umiejętności są już pokryte
            }

            wybraniKosmonauci[najlepszyWybor] = true;
            rozwiazanie += (najlepszyWybor + 1) + " ";
            liczbaAstronautow++;

            for (int j = 0; j < zajeteUmiejetnosci.length; j++) {
                if (kosmonauci[najlepszyWybor][j] == 1) {
                    zajeteUmiejetnosci[j] = true;
                }
            }

            boolean wszystkieUmiejetnosciPokryte = true;
            for (int j = 0; j < zajeteUmiejetnosci.length; j++) {
                if (!zajeteUmiejetnosci[j]) {
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

        System.out.println("Mogą polecieć: " + najlepszeRozwiazanie);
    }
}
