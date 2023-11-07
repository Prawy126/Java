public class Main {

    final static int MAX_LICZBA_BAKTERII = 1000000; // Maksymalna liczba bakterii
    static boolean przekroczonaTysiąc, przekroczonaDziesięćTysięcy, przekroczonaStoTysięcy, przekroczonyMilion;

    // Metoda symulująca rozmnażanie się bakterii
    public static void rozmnażajBakterie(int liczbaBakterii, int minuty) {

        // Sprawdź, czy liczba bakterii przekroczyła 1000 i czy flaga przekroczonaTysiąc jest ustawiona
        if (liczbaBakterii > 1000 && !przekroczonaTysiąc) {
            przekroczonaTysiąc = true;
            System.out.println("Tysiąc razy: po " + minuty + " minutach");
        }

        // Sprawdź, czy liczba bakterii przekroczyła 10000 i czy flaga przekroczonaDziesięćTysięcy jest ustawiona
        if (liczbaBakterii > 10000 && !przekroczonaDziesięćTysięcy) {
            przekroczonaDziesięćTysięcy = true;
            System.out.println("Dziesięć tysięcy razy: po " + minuty + " minutach");
        }

        // Sprawdź, czy liczba bakterii przekroczyła 100000 i czy flaga przekroczonaStoTysięcy jest ustawiona
        if (liczbaBakterii > 100000 && !przekroczonaStoTysięcy) {
            przekroczonaStoTysięcy = true;
            System.out.println("Sto tysięcy razy: po " + minuty + " minutach");
        }

        // Sprawdź, czy liczba bakterii przekroczyła 1000000 i czy flaga przekroczonyMilion jest ustawiona
        if (liczbaBakterii > 1000000 && !przekroczonyMilion) {
            przekroczonyMilion = true;
            System.out.println("Milion razy: po " + minuty + " minutach");
            return; // Zakończenie symulacji, gdy przekroczono milion bakterii
        }

        rozmnażajBakterie(2 * liczbaBakterii, minuty + 2); // Rekurencyjne wywołanie symulacji z podwajaniem liczby bakterii i zwiększeniem czasu
    }

    public static void main(String[] args) {
        rozmnażajBakterie(1, 0); // Rozpoczęcie symulacji z początkową liczbą bakterii równą 1 i czasem równym 0 minut
    }
}
