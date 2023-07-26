import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int i = 0, los, odp;

        Random rnd = new Random();

        los = rnd.nextInt(10)+1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10");

        do{
            i++;
            System.out.println("Podaj swoją liczbę");
            odp = scanner.nextInt();
            if(odp > los)
                System.out.println("Niestety nie udało ci się moja liczba jest mniejsza");
            else if(odp < los)
                System.out.println("Niestety nie udało ci się moja liczba jest większa");
        }while(odp != los);

        System.out.println("Udało ci się moja liczba to " + odp + " liczba prób " + i);



    }
}