package Programowanie_Dynamiczne;

public class A20_Populacja_Krolikow {

    static boolean przekroczonaSto, przekroczonaTysiac, przekroczonaDziesiecTysiecy, przekroczonaStoTysiecy, przekroczonyMilion;

    public static int obliczPopulacjeKrolikow(int miesiace) {
        int[] sekwencjaFibonacciego = new int[miesiace + 1];
        sekwencjaFibonacciego[1] = 1;
        sekwencjaFibonacciego[2] = 1;

        for (int i = 3; i <= miesiace; i++) {
            sekwencjaFibonacciego[i] = sekwencjaFibonacciego[i - 1] + sekwencjaFibonacciego[i - 2];

            if (!przekroczonaSto && sekwencjaFibonacciego[i] >= 100) {
                System.out.println("Sto: " + i);
                przekroczonaSto = true;
            }
            if (!przekroczonaTysiac && sekwencjaFibonacciego[i] >= 1000) {
                System.out.println("Tysiac: " + i);
                przekroczonaTysiac = true;
            }
            if (!przekroczonaDziesiecTysiecy && sekwencjaFibonacciego[i] >= 10000) {
                System.out.println("Dziesiec tysiecy: " + i);
                przekroczonaDziesiecTysiecy = true;
            }
            if (!przekroczonaStoTysiecy && sekwencjaFibonacciego[i] >= 100000) {
                System.out.println("Sto tysiecy: " + i);
                przekroczonaStoTysiecy = true;
            }
            if (!przekroczonyMilion && sekwencjaFibonacciego[i] >= 1000000) {
                System.out.println("Milion: " + i);
                przekroczonyMilion = true;
            }
        }

        return sekwencjaFibonacciego[miesiace];
    }

    public static void main(String[] args) {
        final int MIESIACE = 40;
        System.out.println("Zakończono na " + obliczPopulacjeKrolikow(MIESIACE));
    }
}
