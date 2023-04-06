import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę krążków: ");
        int n = input.nextInt();
        hanoi(n, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char poczatkowa, char pomocnicza, char koncowa) {
        if (n == 1) {
            System.out.println(poczatkowa + " -> " + koncowa);
        } else {
            hanoi(n-1, poczatkowa, koncowa, pomocnicza);
            System.out.println(poczatkowa + " -> " + koncowa);
            hanoi(n-1, pomocnicza, poczatkowa, koncowa);
        }
    }
}
