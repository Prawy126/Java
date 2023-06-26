package Zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[] tab = new float[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            tab[i] = (random.nextFloat() % 10) * 10;
        }
        System.out.println("Proszę podać liczbę z przedziału 0 do 10");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float suma = 0;
        for (int i = n; i < 20; i++) {
            if (i % 2 == 0) {
                suma += tab[i];
            }
        }
        System.out.println("Suma wynosi: " + suma);
    }
}
