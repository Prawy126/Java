package Programowanie_Dynamiczne;

public class A23_Przebieg_Choroby {

    final static int MAX_LICZBA_OSOB = 100000;
    static int liczbaChorych = 10;
    static int liczbaZdrowych = MAX_LICZBA_OSOB - liczbaChorych;
    static int liczbaOdpornych = 0;
    static int dzien = 0;
    static int[] liczbaChorychDziennie = new int[50];
    static int[] liczbaOzdrowialychDziennie = new int[50];

    public static void symulujEpidemie() {
        for (dzien = 0; dzien < liczbaChorychDziennie.length; dzien++) {
            liczbaChorychDziennie[dzien] = liczbaChorych;

            if (dzien > 6) {
                liczbaOzdrowialychDziennie[dzien] = liczbaChorychDziennie[dzien - 7];
                liczbaChorychDziennie[dzien] -= liczbaOzdrowialychDziennie[dzien];
            }

            liczbaOdpornych = 0;
            int startDay;
            if (dzien > 13) {
                startDay = dzien - 13;
            } else {
                startDay = 0;
            }
            for (int i = startDay; i <= dzien; i++) {
                liczbaOdpornych = liczbaOzdrowialychDziennie[i];
            }

            liczbaChorych -= liczbaOdpornych;
            liczbaZdrowych = MAX_LICZBA_OSOB - (liczbaChorych + liczbaOdpornych);

            if (liczbaChorychDziennie[dzien] * 3 > liczbaZdrowych || dzien >= liczbaChorychDziennie.length - 1) {
                wypiszWyniki();
                break;
            } else {
                int nowoZarazeni;
                if (liczbaChorychDziennie[dzien] * 3 < liczbaZdrowych) {
                    nowoZarazeni = liczbaChorychDziennie[dzien] * 3;
                } else {
                    nowoZarazeni = liczbaZdrowych;
                }
                liczbaChorych = nowoZarazeni;
            }
        }
    }

    private static void wypiszWyniki() {
        for (int i = 0; i <= dzien; i++) {
            System.out.println("Dzień: " + (i + 1) + " Chorzy: " + liczbaChorychDziennie[i] + " Zdrowi: " + (MAX_LICZBA_OSOB - (liczbaChorychDziennie[i] + liczbaOzdrowialychDziennie[i])) + " Odporni: " + liczbaOzdrowialychDziennie[i]);
        }
    }

    public static void main(String[] args) {
        symulujEpidemie();
    }
}

