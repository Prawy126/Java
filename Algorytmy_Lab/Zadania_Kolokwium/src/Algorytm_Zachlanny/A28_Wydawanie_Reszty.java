package Algorytm_Zachlanny;

public class A28_Wydawanie_Reszty {
    public static void main(String[] args) {
        final int[] nominaly = {1,2,5,10,20,50,100,200,500};
        int[] dostepneMonety = {30,7,4,1,5,3,0,1,7};
        int[] wydaneMonety = new int[9];
        final double RESZTA = 7.53;
        int resztaWgroszach = (int) (RESZTA * 100);
        //tutaj należy odwrócić pętlę
        for (int i = dostepneMonety.length-1; i >= 0; i--) {
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

