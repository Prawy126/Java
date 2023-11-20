package Algorytm_Zachlanny;

public class A19_Droga {

    public static void main(String[] args) {
        final int[][] polaczenia = {
                {0, 300, 402, 356, -1, -1, -1, -1, -1},
                {300, 0, -1, -1, 440, 474, -1, -1, -1},
                {402, -1, 0, -1, -1, 330, -1, -1, -1},
                {356, -1, -1, 0, -1, -1, 823, -1, -1},
                {-1, 440, -1, -1, 0, -1, -1, 430, -1},
                {-1, 474, 330, -1, -1, 0, 813, 365, 774},
                {-1, -1, -1, 823, -1, 813, 0, -1, 403},
                {-1, -1, -1, -1, 430, 365, -1, 0, 768},
                {-1, -1, -1, -1, -1, 774, 403, 768, 0}
        };
        final String[] nazwyMiast = {"Warszawa", "Katowice", "Zakopane", "Lwów", "Wiedeń", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

        int wierszStartowy = 0; // Start z Warszawy
        int cel = 8; // Cel to Sofia
        System.out.println("Trasa: ");
        System.out.print(nazwyMiast[wierszStartowy] + " -> ");

        boolean[] odwiedzoneMiasta = new boolean[polaczenia.length];
        odwiedzoneMiasta[wierszStartowy] = true;

        int sumaDlugosciTrasy = 0;
        while (wierszStartowy != cel) {
            int najkrotszaDroga = Integer.MAX_VALUE;
            int pozycja = -1;

            for (int j = 0; j < polaczenia[wierszStartowy].length; j++) {
                if (polaczenia[wierszStartowy][j] < najkrotszaDroga && polaczenia[wierszStartowy][j] > 0 && !odwiedzoneMiasta[j]) {
                    pozycja = j;
                    najkrotszaDroga = polaczenia[wierszStartowy][j];
                }
            }

            if (pozycja > -1) {
                System.out.print(nazwyMiast[pozycja] + " -> ");
                sumaDlugosciTrasy += polaczenia[wierszStartowy][pozycja];
                wierszStartowy = pozycja;
                odwiedzoneMiasta[pozycja] = true;
            } else {
                System.out.println("Nie można znaleźć dalszej drogi.");
                break;
            }
        }

        System.out.println("\nTa trasa ma " + sumaDlugosciTrasy + " km");
    }
}
