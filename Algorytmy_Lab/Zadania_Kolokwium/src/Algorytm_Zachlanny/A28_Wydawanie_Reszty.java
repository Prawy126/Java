package Algorytm_Zachlanny;

public class A28_Wydawanie_Reszty {
    private static final int[] NOMINAŁY = {1, 2, 5, 10, 20, 50, 100, 200, 500};
    private static final int[] DOSTĘPNE_MONETY = {5, 3, 4, 1, 0, 7, 0, 1, 3};

    public static void wydajResztę(int złote, int grosze) {
        int pozostałaKwota = złote * 100 + grosze;

        for (int i = NOMINAŁY.length - 1; i >= 0; i--) {
            int liczbaMonetDoWydania = 0;
            while (pozostałaKwota >= NOMINAŁY[i] && DOSTĘPNE_MONETY[i] > 0) {
                pozostałaKwota -= NOMINAŁY[i];
                DOSTĘPNE_MONETY[i]--;
                liczbaMonetDoWydania++;
            }

            if (liczbaMonetDoWydania > 0) {
                System.out.println("Nominał: " + NOMINAŁY[i]/100.0 + "zł, Liczba monet: " + liczbaMonetDoWydania);
            }
        }

        if (pozostałaKwota > 0) {
            System.out.println("Nie można wydać dokładnej reszty. Zostało: " + pozostałaKwota/100.0 + "zł");
        }
    }

    public static void main(String[] args) {
        int resztaZłote = 9;
        int resztaGrosze = 28;
        System.out.println("Wydawanie reszty dla kwoty: " + resztaZłote + "zł " + resztaGrosze + "gr");
        wydajResztę(resztaZłote, resztaGrosze);
    }

}

