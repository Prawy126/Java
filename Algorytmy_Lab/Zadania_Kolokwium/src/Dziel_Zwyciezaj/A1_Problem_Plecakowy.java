package Dziel_Zwyciezaj;

public class A1_Problem_Plecakowy {

    final static int[] pojemnosciPlecaka = {6, 2, 3, 2, 3, 1};
    final static int[] wartosciPrzedmiotow = {6, 4, 5, 7, 10, 2};
    final static int pojemnoscMax = 10;
    final static int iloscPrzedmiotow = pojemnosciPlecaka.length;

    public static int obliczNajlepszaWartoscPlecaka(int indeksPrzedmiotu, int pozostalaPojemnosc) {
        if (indeksPrzedmiotu == 0) {
            if (pozostalaPojemnosc < pojemnosciPlecaka[indeksPrzedmiotu]) return 0;
            else return wartosciPrzedmiotow[indeksPrzedmiotu];
        } else if (pozostalaPojemnosc < pojemnosciPlecaka[indeksPrzedmiotu]) {
            return obliczNajlepszaWartoscPlecaka(indeksPrzedmiotu - 1, pozostalaPojemnosc);
        } else {
            int bezPrzedmiotu = obliczNajlepszaWartoscPlecaka(indeksPrzedmiotu - 1, pozostalaPojemnosc);
            int zPrzedmiotem = wartosciPrzedmiotow[indeksPrzedmiotu] +
                    obliczNajlepszaWartoscPlecaka(indeksPrzedmiotu - 1, pozostalaPojemnosc - pojemnosciPlecaka[indeksPrzedmiotu]);
            if (bezPrzedmiotu > zPrzedmiotem) return bezPrzedmiotu;
            else return zPrzedmiotem;
        }
    }

    public static void main(String[] args) {
        int najlepszaWartoscPlecaka = obliczNajlepszaWartoscPlecaka(iloscPrzedmiotow - 1, pojemnoscMax);
        System.out.println("Najlepsza wartość plecaka: " + najlepszaWartoscPlecaka);
    }
}
