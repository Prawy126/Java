package Monte_Carlo;

import java.io.*;
import java.util.*;

class A28_Wydawanie_Reszty {

    public static void main(String[] args) throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;

        Random losuj = new Random();
        final int[] MONETY = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int LIMIT_WYDANYCH_MONET = 11;
        final int LICZBA_LOSOWAN = 100;
        int minLiczbaWydanychMonet = LIMIT_WYDANYCH_MONET;
        int[] wydaneMonety = new int[LIMIT_WYDANYCH_MONET];
        int[] minWydaneMonety = new int[LIMIT_WYDANYCH_MONET];
        int moneta, zl, gr, r;
        System.out.println("Podaj resztę..");
        System.out.print("złotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);

        for (int i = 0; i < LICZBA_LOSOWAN; i++) {
            r = zl * 100 + gr;
            int liczbaWydanychMonet = 0;
            while (r > 0 && liczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
                moneta = MONETY[losuj.nextInt(MONETY.length)];
                if (r >= moneta) {
                    wydaneMonety[liczbaWydanychMonet] = moneta;
                    r = r - moneta;
                    liczbaWydanychMonet++;
                }
            }
            if (liczbaWydanychMonet < minLiczbaWydanychMonet) {
                minLiczbaWydanychMonet = liczbaWydanychMonet;
                for (int j = 0; j < liczbaWydanychMonet; j++)
                    minWydaneMonety[j] = wydaneMonety[j];
            }
        }
        if (minLiczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
            System.out.print("Reszta: ");
            for (int i = 0; i < minLiczbaWydanychMonet; i++)
                System.out.print(minWydaneMonety[i] / 100.0 + " ");
        } else {
            System.out.print("Nie znaleziono rozwiązania.");
        }
        System.out.println();
    }
}
