import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Podaj swoje imię: ");
        name = scanner.next();
        System.out.print("Hello " + name);
    }
}