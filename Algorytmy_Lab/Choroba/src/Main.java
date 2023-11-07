class Choroba {

    final static int MAX_LICZBA_OSOB = 100000;
    static int liczbaChorych = 10;
    static int liczbaZdrowych = MAX_LICZBA_OSOB - liczbaChorych;
    static int liczbaOdpornych = 0;
    static int dzien = 0;
    static int[] liczbaChorychDziennie = new int[50];
    static int[] liczbaOzdrowialychDziennie = new int[50];

    public static int rozprzestrzeniajChorobe(int liczbaChorych, int dzien) {
        liczbaChorychDziennie[dzien] = liczbaChorych;
        liczbaZdrowych -= liczbaChorychDziennie[dzien];

        // Uzupełniamy dane na kolejny dzień, ludzie zdrowieją
        if (dzien > 6) {
            liczbaOzdrowialychDziennie[dzien] = liczbaChorychDziennie[dzien - 7];
            liczbaChorychDziennie[dzien] = liczbaChorychDziennie[dzien] - liczbaChorychDziennie[dzien - 7];
        }

        // Zliczamy ilość obecnie odpornych (maksymalnie 14 dni wstecz, bo wtedy znowu można zachorować)
        liczbaOdpornych = 0;
        if (dzien < 14) {
            for (int i = dzien; i >= 0; i--) {
                liczbaOdpornych += liczbaOzdrowialychDziennie[i];
            }
        }
        if (dzien >= 14) {
            for (int i = dzien; i >= dzien - 14; i--) {
                liczbaOdpornych += liczbaOzdrowialychDziennie[i];
            }
        }

        if (liczbaChorychDziennie[dzien] * 3 >= liczbaZdrowych + liczbaOdpornych) {
            System.out.println("Dzień: " + dzien + " Chorzy: " + liczbaChorych + " Ludzie: " + liczbaZdrowych + " Odporni: " + liczbaOdpornych);
            System.out.println("Liczba: " + (liczbaChorych + liczbaZdrowych + liczbaOdpornych));
            System.out.println("Ilość chorych w kolejnych dniach:");
            for (int i = 0; i < liczbaChorychDziennie.length; i++) {
                System.out.print("[" + liczbaChorychDziennie[i] + "] ");
            }
            System.out.println();
            return dzien;
        } else return rozprzestrzeniajChorobe(liczbaChorychDziennie[dzien] * 3, dzien + 1);
    }

    public static void main(String[] args) {
        rozprzestrzeniajChorobe(liczbaChorych, dzien);
    }
}
