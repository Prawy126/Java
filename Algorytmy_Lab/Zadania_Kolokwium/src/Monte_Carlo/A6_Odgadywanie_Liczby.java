package Monte_Carlo;

import java.util.Random;

public class A6_Odgadywanie_Liczby {
    public static void main(String[] args) {
        Random rand = new Random();
        String najlepszySposob = "";
        int minLiczbaRuchow = Integer.MAX_VALUE;

        for (int i = 0; i < 1000; i++) {
            int min = 0, max = 1000;
            int liczba = rand.nextInt(max + 1);
            String rozwiazanie = "Najlepszy sposób:";
            int ruchy = 0;

            while (true) {
                int strzal = rand.nextInt(min, max + 1);
                ruchy++;

                if (strzal > liczba) {
                    rozwiazanie += "\n" + strzal + " za dużo";
                    max = strzal;
                }

                if (strzal < liczba) {
                    rozwiazanie += "\n" + strzal + " za mało";
                    min = strzal;
                }

                if (strzal == liczba) {
                    rozwiazanie += "\n" + strzal + " to ta liczba";

                    if (ruchy < minLiczbaRuchow) {
                        najlepszySposob = rozwiazanie;
                        minLiczbaRuchow = ruchy;
                    }
                    break;
                }
            }
        }
        System.out.println(najlepszySposob);
    }
}

