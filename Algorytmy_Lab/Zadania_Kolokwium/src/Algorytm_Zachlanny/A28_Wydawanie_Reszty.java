package Algorytm_Zachlanny;

public class A28_Wydawanie_Reszty {
    public static void main(String[] args) {
        final int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] dostepneMonety = {1, 2, 0, 2, 1, 4, 2, 1, 1};
        int[] wydaneMonety = new int[9];
        final double RESZTA = 9.99;
        int resztaWgroszach = (int) (RESZTA * 100);

        for (int i = 0; i < nominaly.length; i++) {
            int nominal = nominaly[i];
            int iloscDostepnych = dostepneMonety[i];

            while (resztaWgroszach >= nominal && iloscDostepnych > 0) {
                resztaWgroszach -= nominal;
                iloscDostepnych--;
                wydaneMonety[i]++;
            }
        }

        System.out.println("Wydane monety:");
        for (int i = 0; i < nominaly.length; i++) {
            int zlotowki = nominaly[i] / 100;
            int grosze = nominaly[i] % 100;
            System.out.println(zlotowki + " zł " + grosze + " gr \t" + wydaneMonety[i]);
        }

        if (resztaWgroszach > 0) {
            System.out.println("Nie udało się wydać całej reszty, zostało " + resztaWgroszach + " gr");
        } else {
            System.out.println("Udało się wydać całą resztę");
        }
    }
}

