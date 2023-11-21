package Monte_Carlo;

import java.util.Random;

public class A1_Problem_Plecakowy {

    static final int liczbaPrzedmiotow = 6;
    static final int maksymalnaObjetoscPlecaka = 10;
    final static int[] objetosciPrzedmiotow = {2, 6, 3, 3, 1, 2};
    final static int[] wartosciPrzedmiotow = {4, 6, 5, 10, 2, 7};

    public static void main(String[] args)
    {
        String optymalnaKonfiguracja = new String();
        int optymalnaObjetosc = -1;
        int optymalnaWartosc = 0;
        Random los = new Random();
        for (int i = 0; i < 10; i++)
        {
            int[] ustawienie = new int[liczbaPrzedmiotow];
            for (int j = 0; j < liczbaPrzedmiotow; j++) ustawienie[j] = j;

            for (int j = 0; j < liczbaPrzedmiotow; j++)
            {
                int indeksLosowy = los.nextInt(liczbaPrzedmiotow);
                if (indeksLosowy != j)
                {
                    int pom = ustawienie[j];
                    ustawienie[j] = ustawienie[indeksLosowy];
                    ustawienie[indeksLosowy] = pom;
                }
            }
            String lokalnaKonfiguracja = new String();
            int sumaObjetosci = 0;
            int sumaWartosci = 0;
            int j = 0;
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
