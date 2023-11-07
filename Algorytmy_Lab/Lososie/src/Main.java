public class Main {

    static boolean przekroczonaPolowa;
    final static int MAX_LICZBA_LOSOSI = 1000000;

    public static void ekosystemLososi(int liczbaLososi, int minuty) {
        if (liczbaLososi < MAX_LICZBA_LOSOSI / 2 && !przekroczonaPolowa) {
            System.out.println("Przekroczona połowa: po " + minuty + " minutach");
            przekroczonaPolowa = true;
        }
        if (liczbaLososi < 100) {
            System.out.println("Populacja wymrze po " + minuty + " minutach");
            return;
        }

        liczbaLososi = (int) (((liczbaLososi * Math.exp(0.003)) * 0.998) * 0.998);
        ekosystemLososi(liczbaLososi, minuty + 1);
    }

    public static void main(String[] args) {
        ekosystemLososi(MAX_LICZBA_LOSOSI, 0);
    }
}
