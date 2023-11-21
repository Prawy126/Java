package Monte_Carlo;

import java.util.Random;

public class A1_Problem_Plecakowy {

    static final int liczbaPrzedmiotow = 6;                // liczba przedmiotow
    static final int maksymalnaObjetoscPlecaka = 10;           // objetosc plecaka
    final static int[] objetosciPrzedmiotow = {2, 6, 3, 3, 1, 2};  // objetości przedmiotów
    final static int[] wartosciPrzedmiotow = {4, 6, 5, 10, 2, 7}; // wartości przedmiotów

    public static void main(String[] args)
    {
        String optymalnaKonfiguracja = new String();
        int optymalnaObjetosc = -1;
        int optymalnaWartosc = 0;
        Random los = new Random();
        for (int i = 0; i < 10; i++) // Bedzie 10 prob losowania
        {
            int[] ustawienie = new int[liczbaPrzedmiotow]; // Inicjujemy wstepne ustawienie przedmiotow
            for (int j = 0; j < liczbaPrzedmiotow; j++) ustawienie[j] = j;

            for (int j = 0; j < liczbaPrzedmiotow; j++) // Tasowanie przedmiotow
            {
                int indeksLosowy = los.nextInt(liczbaPrzedmiotow);
                if (indeksLosowy != j)
                {
                    int pom = ustawienie[j]; // Zamiana elementow
                    ustawienie[j] = ustawienie[indeksLosowy];
                    ustawienie[indeksLosowy] = pom;
                }
            }
            String lokalnaKonfiguracja = new String();
            int sumaObjetosci = 0;
            int sumaWartosci = 0;
            int j = 0;
            // Bierzemy przedmioty do plecaka od poczatku tablicy dopoki sie mieszcza
            while ((j < liczbaPrzedmiotow) && (sumaObjetosci + objetosciPrzedmiotow[ustawienie[j]] <= maksymalnaObjetoscPlecaka))
            {
                sumaObjetosci = sumaObjetosci + objetosciPrzedmiotow[ustawienie[j]];
                sumaWartosci = sumaWartosci + wartosciPrzedmiotow[ustawienie[j]];
                lokalnaKonfiguracja = lokalnaKonfiguracja + " " + ustawienie[j];
                j++;
            }
            if (sumaWartosci > optymalnaWartosc)
            {
                optymalnaWartosc = sumaWartosci;
                optymalnaObjetosc = sumaObjetosci;
                optymalnaKonfiguracja = lokalnaKonfiguracja;
            }
        }
        System.out.println("Calkowita objetosc: " + optymalnaObjetosc);
        System.out.println("Calkowita wartosc: " + optymalnaWartosc);
        System.out.println("Konfiguracja: " + optymalnaKonfiguracja);
        System.out.println("Niewykorzystana objetosc: " + (maksymalnaObjetoscPlecaka - optymalnaObjetosc));
    }
}
