import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        int tab[] = new int[10];
        Scanner a = new Scanner(System.in);
        int odp, licz = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("index " + i);
            tab[i] = a.nextInt();
        }
        while (true) {
            licz = 0;
            System.out.println("1) sumuę elementów.");
            System.out.println("2) iloczyn elementów.");
            System.out.println("3) średnia wartość");
            System.out.println("4) minimalna wartośc");
            System.out.println("5) maksymalna wartość");
            System.out.println("6) wyjście");

            odp = a.nextInt();

            if (odp == 1) {
                for (int i = 0; i < 10; i++) {
                    licz = licz + tab[i];
                }

                System.out.println(licz);
            }
            if (odp == 2) {
                for (int i = 0; i < 10; i++) {
                    licz = licz * tab[i];
                }

                System.out.println(licz);
            }
            if (odp == 3) {
                for (int i = 0; i < 10; i++) {
                    licz = licz + tab[i];
                }
                licz = licz / 2;
                System.out.println(licz);
            }
            if (odp == 4) {
                licz = tab[0];
                for (int i = 1; i < 10; i++) {
                    if (licz > tab[i]) {
                        licz = tab[i];
                    }
                }
                System.out.println(licz);
            }
            if (odp == 5) {
                licz = tab[0];
                for (int i = 1; i < 10; i++) {
                    if (licz < tab[i]) {
                        licz = tab[i];
                    }
                }
                System.out.println(licz);
            }
            if (odp == 6) {
                exit(0);

            }
        }

    }
}