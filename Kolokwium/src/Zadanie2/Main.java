package Zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double[] tab = new double[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Wprowadź liczbę: ");
            tab[i]=scanner.nextDouble();
        }
        double wynik = wylicz(tab);
        System.out.println("Wynik wynosi: " + wynik);

    }
    public static double wylicz(double[] tab){
        double wynik =0, wynik2=0;
        for(int i = 0; i<tab.length;i++){
            wynik+=tab[i];
        }
        wynik/=tab.length;
        for(int i =0; i<tab.length;i++)
        {
            if(tab[i]%5==0&&tab[i]>wynik){
                wynik2+=tab[i];
            }
        }
        return wynik2;
    }
}
