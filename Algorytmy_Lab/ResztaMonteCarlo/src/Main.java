import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner SKANER = new Scanner(System.in);
    private static final Random LOSOWY = new Random();
    private static final int[] MONETY = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // grosze
    private static final int[] LICZEBNOŚĆ = {6, 0, 9, 50, 20, 10, 5, 2, 1}; // indeks 0 -> 5, więc mamy pięć monet po 5 zł, dwie po 2 zł, itd...
    private static final int LIMIT_WYDANYCH_MONET = 1000; // 999 + 1
    private static final int LICZBA_LOSOWAŃ = 100; // liczba losowań

    private static int minimalnaLiczbaWydanychMonet = LIMIT_WYDANYCH_MONET; // im mniej, tym lepiej
    private static int[] wydaneMonety = new int[LIMIT_WYDANYCH_MONET];
    private static int[] minWydaneMonety = new int[LIMIT_WYDANYCH_MONET];

    public static void main(String[] args) {
        przeprowadzMonteCarlo();
    }

    private static void przeprowadzMonteCarlo() {
        System.out.println("Podaj resztę: ");
        System.out.print("Złotych: ");
        int zl = SKANER.nextInt();
        System.out.print("Groszy: ");
        int gr = SKANER.nextInt();
        int r = 0;
        for(int i = 0; i < LICZBA_LOSOWAŃ; i++) {
            r = (zl*100) + gr;
            int liczbaWydanychMonet = 0;
            int[] aktualnaLiczbaMonet = LICZEBNOŚĆ.clone();

            while ((r > 0 && liczbaWydanychMonet < LIMIT_WYDANYCH_MONET)) {
                int losowyIndeksMonety = LOSOWY.nextInt(MONETY.length);
                int moneta = MONETY[losowyIndeksMonety];
                int liczbaMonet = aktualnaLiczbaMonet[losowyIndeksMonety];
                int najmniejDostępnychMonet = znajdźNajmniejszą(aktualnaLiczbaMonet);
                if(najmniejDostępnychMonet > r) {
                    break;
                }
                if(moneta <= r && liczbaMonet > 0) {
                    wydaneMonety[liczbaWydanychMonet] = moneta;
                    aktualnaLiczbaMonet[losowyIndeksMonety]--;
                    r -= moneta;
                    liczbaWydanychMonet++;
                }
            }
            if(liczbaWydanychMonet < minimalnaLiczbaWydanychMonet && r == 0) {
                minimalnaLiczbaWydanychMonet = liczbaWydanychMonet;
                for(int j = 0; j < minimalnaLiczbaWydanychMonet; j++) {
                    minWydaneMonety[j] = wydaneMonety[j];
                }
            }
        }
        if(minimalnaLiczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
            System.out.println("Reszta: ");
            for(int i = 0; i < minimalnaLiczbaWydanychMonet; i++) {
                System.out.print(minWydaneMonety[i]/100.0 + " ");
            }
        } else {
            System.out.println("Nie ma rozwiązania");
        }
    }

    private static int znajdźNajmniejszą(int[] LICZEBNOŚĆ) {
        int najmniejsza = Integer.MAX_VALUE;
        for(int i = 0; i < MONETY.length; i++) {
            if(LICZEBNOŚĆ[i] != 0) {
                if(MONETY[i] < najmniejsza) {
                    najmniejsza = MONETY[i];
                }
            }
        }
        return najmniejsza;
    }
}
