import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int[] MONETY = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // grosze
    private static final int[] LICZEBNOŚĆ = {6, 0, 9, 50, 20, 10, 5, 2, 1}; // index 0 -> 5, so we have five 5zl, two 2zl, etc...
    private static final int LIMIT_WYDANYCH_MONET = 1000; // 999 + 1
    private static final int LICZBA_LOSOWAŃ = 100; // it is number of draws(losowań)

    private static int minimalnaLiczbaWydanychMonet = LIMIT_WYDANYCH_MONET; // the fewer the better
    private static int[] wydaneMonety = new int[LIMIT_WYDANYCH_MONET];
    private static int[] minWydaneMonety = new int[LIMIT_WYDANYCH_MONET];

    public static void main(String[] args) {
        keepYourChangeMonteCarlo();
    }

    private static void keepYourChangeMonteCarlo() {
        System.out.println("Give a change: ");
        System.out.print("Zlotych: ");
        int zl = SCANNER.nextInt();
        System.out.print("Groszy: ");
        int gr = SCANNER.nextInt();
        int r = 0;
        for(int i = 0; i < LICZBA_LOSOWAŃ; i++) {
            r = (zl*100) + gr;
            int liczbaWydanychMonet = 0;
            int[] aktualnaLiczbaMonet = LICZEBNOŚĆ.clone();

            while ((r > 0 && liczbaWydanychMonet < LIMIT_WYDANYCH_MONET)) {
                int randomCoinIndex = RANDOM.nextInt(MONETY.length);
                int moneta = MONETY[randomCoinIndex];
                int liczbaMonet = aktualnaLiczbaMonet[randomCoinIndex];
                int najmniejDostępnychMonet = findLowest(aktualnaLiczbaMonet);
                if(najmniejDostępnychMonet > r) {
                    break;
                }
                if(moneta <= r && liczbaMonet > 0) {
                    wydaneMonety[liczbaWydanychMonet] = moneta;
                    aktualnaLiczbaMonet[randomCoinIndex]--;
                    r -= moneta;
                    liczbaWydanychMonet++;
                }
            }
            if(liczbaWydanychMonet < minimalnaLiczbaWydanychMonet && r == 0.0) {
                minimalnaLiczbaWydanychMonet = liczbaWydanychMonet;
                for(int j = 0; j < minimalnaLiczbaWydanychMonet; j++) {
                    minWydaneMonety[j] = wydaneMonety[j];
                }
            }
        }
        if(minimalnaLiczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
            System.out.println("Change: ");
            for(int i = 0; i < minimalnaLiczbaWydanychMonet; i++) {
                System.out.print(minWydaneMonety[i]/100.0 + " ");
            }
        } else {
            System.out.println("There is no solution");
        }
    }

    private static int findLowest(int[]LICZEBNOŚĆ) {
        int lowest = Integer.MAX_VALUE;
        for(int i = 0; i < MONETY.length; i++) {
            if(LICZEBNOŚĆ[i] != 0) {
                if(MONETY[i] < lowest) {
                    lowest = MONETY[i];
                }
            }
        }
        return lowest;
    }
}



