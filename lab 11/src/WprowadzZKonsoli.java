import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
//zadanie 1
public class WprowadzZKonsoli {
    private Scanner scanner = new Scanner(System.in);

    public int WprowadzInt() {
        System.out.println("Podaj liczbę całkowitą: ");
        try {
            int a = scanner.nextInt();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Podana wartość nie jest liczbą całkowitą!!!");
            scanner.nextLine(); // Usunięcie nieprawidłowego wejścia z bufora
            return WprowadzInt();
        }
    }

    public boolean WprowadzBoolean() {
        System.out.println("Podaj 0 albo 1: ");
        try {
            String input = scanner.next();
            if (input.equals("0")) {
                return false;
            } else if (input.equals("1")) {
                return true;
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Podana wartość nie jest 0 ani 1!!!");
            scanner.nextLine(); // Usunięcie nieprawidłowego wejścia z bufora
            return WprowadzBoolean();
        }
    }

    public float WprowadzFloat() {
        System.out.println("Podaj liczbę rzeczywistą: ");
        try {
            float a = scanner.nextFloat();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Podana wartość nie jest liczbą rzeczywistą!!!");
            scanner.nextLine(); // Usunięcie nieprawidłowego wejścia z bufora
            return WprowadzFloat();
        }
    }

    public BigDecimal WprowadzBigDecimal() {
        System.out.println("Podaj liczbę rzeczywistą: ");
        try {
            String input = scanner.next();
            BigDecimal a = new BigDecimal(input);
            return a;
        } catch (NumberFormatException e) {
            System.out.println("Podana wartość nie jest liczbą rzeczywistą!!!");
            scanner.nextLine(); // Usunięcie nieprawidłowego wejścia z bufora
            return WprowadzBigDecimal();
        }
    }
    public BigInteger WprowadzBigInteger() {
        System.out.println("Podaj liczbę całkowitą: ");
        try {
            BigInteger a = scanner.nextBigInteger();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Podana wartość nie jest liczbą całkowitą!!!");
            scanner.nextLine(); // Usunięcie nieprawidłowego wejścia z bufora
            return WprowadzBigInteger();
        }
    }
}
