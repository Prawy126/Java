public class Main {
    public static void main(String[] args) {

        final int LICZBA = 30;
        long start = System.nanoTime();
        System.out.println(silnia(LICZBA));
        long czasU = System.nanoTime() - start;
        long wynik = silnia(LICZBA);
        System.out.println("Wyink: " + wynik);
        System.out.println("Czas: "+ czasU);
    }

    private static long silnia(int liczba) {
        long wynik = 1;
        if(liczba == 1)
        return wynik;
        else if(liczba > 1){
            return silnia(liczba - 1)*liczba;
        }
        return 0;
    }
}