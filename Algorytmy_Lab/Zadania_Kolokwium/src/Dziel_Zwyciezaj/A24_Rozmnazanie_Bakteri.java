package Dziel_Zwyciezaj;

public class A24_Rozmnazanie_Bakteri {

    final static int MAX_LICZBA_BAKTERII = 1000000;
    static boolean przekroczonaTysiąc, przekroczonaDziesięćTysięcy, przekroczonaStoTysięcy, przekroczonyMilion;

    public static void rozmnażajBakterie(int liczbaBakterii, int minuty) {

        if (liczbaBakterii > 1000 && !przekroczonaTysiąc) {
            przekroczonaTysiąc = true;
            System.out.println("Tysiąc razy: po " + minuty + " minutach");
        }

        if (liczbaBakterii > 10000 && !przekroczonaDziesięćTysięcy) {
            przekroczonaDziesięćTysięcy = true;
            System.out.println("Dziesięć tysięcy razy: po " + minuty + " minutach");
        }

        if (liczbaBakterii > 100000 && !przekroczonaStoTysięcy) {
            przekroczonaStoTysięcy = true;
            System.out.println("Sto tysięcy razy: po " + minuty + " minutach");
        }

        if (liczbaBakterii > 1000000 && !przekroczonyMilion) {
            przekroczonyMilion = true;
            System.out.println("Milion razy: po " + minuty + " minutach");
            return;
        }

        rozmnażajBakterie(2 * liczbaBakterii, minuty + 2);
    }

    public static void main(String[] args) {
        rozmnażajBakterie(1, 0);
    }
}