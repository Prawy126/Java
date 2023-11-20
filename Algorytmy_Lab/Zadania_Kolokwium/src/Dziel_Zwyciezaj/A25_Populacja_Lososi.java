package Dziel_Zwyciezaj;

public class A25_Populacja_Lososi {

    final static int MAKS_LICZBA_BAKTERII = 1000000;
    static boolean przekroczonoTysiąc, przekroczonoDziesięćTysięcy, przekroczonoStoTysięcy, przekroczonoMilion;

    public static void symulujRozmnażanieBakterii(int liczbaBakterii, int minuty) {

        if (liczbaBakterii > 1000 && !przekroczonoTysiąc) {
            przekroczonoTysiąc = true;
            System.out.println("Tysiąc razy: po " + minuty + " minutach");
        }

        if (liczbaBakterii > 10000 && !przekroczonoDziesięćTysięcy) {
            przekroczonoDziesięćTysięcy = true;
            System.out.println("Dziesięć tysięcy razy: po " + minuty + " minutach");
        }

        if (liczbaBakterii > 100000 && !przekroczonoStoTysięcy) {
            przekroczonoStoTysięcy = true;
            System.out.println("Sto tysięcy razy: po " + minuty + " minutach");
        }

        if (liczbaBakterii > 1000000 && !przekroczonoMilion) {
            przekroczonoMilion = true;
            System.out.println("Milion razy: po " + minuty + " minutach");
            return;
        }

        symulujRozmnażanieBakterii(2 * liczbaBakterii, minuty + 2);
    }

    public static void main(String[] args) {
        symulujRozmnażanieBakterii(1, 0);
    }
}
