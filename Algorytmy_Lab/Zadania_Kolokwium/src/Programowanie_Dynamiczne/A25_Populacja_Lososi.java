package Programowanie_Dynamiczne;

public class A25_Populacja_Lososi{
    public static void main(String[] args) {
        int liczbaLososi = 1000000;
        int[] tablicaLososi = new int[10000];
        boolean osiagnietaPolowa = false;
        boolean osiagnietaJednaTrzecia = false;
        boolean osiagnietaJednaDziesiata = false;
        boolean osiagnietaJednaSetna = false;
        boolean wymarcie = false;

        for (int i = 0; i < tablicaLososi.length; i++) {
            if (i == 0) {
                tablicaLososi[i] = liczbaLososi;
            } else {
                tablicaLososi[i] = (int) ((tablicaLososi[i - 1] * Math.exp(0.003) * 0.998) * 0.998);
            }

            if (!osiagnietaPolowa && tablicaLososi[i] < liczbaLososi / 2) {
                System.out.println("Polowa: po " + i + " minutach");
                osiagnietaPolowa = true;
            }

            if (!osiagnietaJednaTrzecia && tablicaLososi[i] < liczbaLososi / 3) {
                System.out.println("Jedna trzecia: po " + i + " minutach");
                osiagnietaJednaTrzecia = true;
            }

            if (!osiagnietaJednaDziesiata && tablicaLososi[i] < liczbaLososi / 10) {
                System.out.println("Jedna dziesiata: po " + i + " minutach");
                osiagnietaJednaDziesiata = true;
            }

            if (!osiagnietaJednaSetna && tablicaLososi[i] < liczbaLososi / 100) {
                System.out.println("Jedna setna: po " + i + " minutach");
                osiagnietaJednaSetna = true;
            }

            if (tablicaLososi[i] < 100) {
                System.out.println("Wymrze: po " + i + " minutach");
                wymarcie = true;
                break;
            }
        }
    }
}

