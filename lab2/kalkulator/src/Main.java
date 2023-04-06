import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        while(true) {
            int x;
            double a, b, wynik;
            System.out.println("0)Dodawanie");
            System.out.println("1)Odejmowanie");
            System.out.println("2)Mnożenie");
            System.out.println("3)Dzielenie");
            System.out.println("4)Potęgowanie");
            System.out.println("5)Pierwiastkowanie");
            System.out.println("6)Sinus");
            System.out.println("7)Wyjście");

            Scanner g = new Scanner(System.in);

            System.out.println("Proszę wybrać operację którą chcesz wykonać: ");

            x = g.nextInt();

            switch (x) {
                case 0:
                    System.out.println("Podaj pierwszą liczbę: ");
                    a = g.nextDouble();
                    System.out.println("Podaj drugą liczbę: ");
                    b = g.nextDouble();
                    wynik = a + b;
                    System.out.println(wynik);
                    break;
                case 1:
                    System.out.println("Podaj pierwszą liczbę: ");
                    a = g.nextDouble();
                    System.out.println("Podaj drugą liczbę: ");
                    b = g.nextDouble();
                    wynik = a - b;
                    System.out.println(wynik);
                    break;
                case 2:
                    System.out.println("Podaj pierwszą liczbę: ");
                    a = g.nextDouble();
                    System.out.println("Podaj drugą liczbę: ");
                    b = g.nextDouble();
                    wynik = a * b;
                    System.out.println(wynik);
                    break;
                case 3:
                    System.out.println("Podaj pierwszą liczbę: ");
                    a = g.nextDouble();
                    System.out.println("Podaj drugą liczbę przez którą będzie dzielona pierwsza: ");
                    b = g.nextDouble();
                    wynik = a / b;
                    System.out.println(wynik);
                    break;
                case 4:
                    System.out.println("Podaj podstawę: ");
                    a = g.nextDouble();
                    System.out.println("Podaj potęgę: ");
                    b = g.nextDouble();
                    wynik = Math.pow(a, b);
                    System.out.println(wynik);
                    break;
                case 5:
                    System.out.println("Podaj liczbę: ");
                    a = g.nextDouble();
                    wynik = Math.sqrt(a);
                    System.out.println(wynik);
                    break;
                case 6:
                    System.out.println("Podaj pierwszą liczbę: ");
                    a = g.nextDouble();
                    wynik = Math.sin(a);
                    System.out.println(wynik);
                    break;
                case 7:
                    exit(0);
                default:
                    System.out.println("Wybrana operacja jest spoza listy");
                    break;


            }
        }
    }
}