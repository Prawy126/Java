package Algorytm_Zachlanny;

public class A1_Problem_Plecakowy {

    final static int[] objetosci = {6, 2, 3, 2, 3, 1};
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};
    final static int MAX_POJEMNOSC = 10;
    final static int liczbaPrzedmiotow = objetosci.length;

    public static void main(String[] args) {
        plecakPoObjetosci();
        plecakPoWartosci();
        plecakPoWspolczynniku();
    }

    public static void plecakPoObjetosci() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow];
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false;
        }

        int objetoscWlozona = 0;
        int wartoscWlozona = 0;

        while (true) {
            int najmniejszaObjetosc = Integer.MAX_VALUE;
            int pozycja = -1;

            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && objetoscWlozona + objetosci[i] <= MAX_POJEMNOSC && objetosci[i] < najmniejszaObjetosc) {
                    najmniejszaObjetosc = objetosci[i];
                    pozycja = i;
                }
            }

            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break;
            }
        }

        System.out.print("Najmniejsza objętość\t\t\t\t\t\t\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona);
    }

    public static void plecakPoWartosci() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow];
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false;
        }

        int objetoscWlozona = 0;
        int wartoscWlozona = 0;

        while (true) {
            int pozycja = -1;
            int maksymalnaWartosc = Integer.MIN_VALUE;

            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && wartosci[i] > maksymalnaWartosc && objetosci[i] + objetoscWlozona <= MAX_POJEMNOSC) {
                    maksymalnaWartosc = wartosci[i];
                    pozycja = i;
                }
            }

            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break;
            }
        }

        System.out.print("Najwyższa wartość\t\t\t\t\t\t\t\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona);
    }

    public static void plecakPoWspolczynniku() {
        boolean[] wybranePrzedmioty = new boolean[liczbaPrzedmiotow];
        for (boolean czyWybrany : wybranePrzedmioty) {
            czyWybrany = false;
        }

        double[] wspolczynniki = new double[liczbaPrzedmiotow];
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            wspolczynniki[i] = (double) wartosci[i] / objetosci[i];
        }

        int wartoscWlozona = 0;
        int objetoscWlozona = 0;

        while (true) {
            int pozycja = -1;

            double najwyzszyWspolczynnik = Double.MIN_VALUE;

            for (int i = 0; i < liczbaPrzedmiotow; i++) {
                if (!wybranePrzedmioty[i] && najwyzszyWspolczynnik < wspolczynniki[i] && objetosci[i] + objetoscWlozona <= MAX_POJEMNOSC) {
                    pozycja = i;
                    najwyzszyWspolczynnik = wspolczynniki[i];
                }
            }

            if (pozycja > -1) {
                wybranePrzedmioty[pozycja] = true;
                wartoscWlozona += wartosci[pozycja];
                objetoscWlozona += objetosci[pozycja];
            } else {
                break;
            }
        }

        System.out.print("Najwyższy współczynnik wartości do objętości\t Wybrane przedmioty: ");
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            if (wybranePrzedmioty[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\tWartość: " + wartoscWlozona);
    }
}

