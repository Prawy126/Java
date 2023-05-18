import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)throws FileNotFoundException {
       Scanner scanner2 = new Scanner(System.in);
        File plik;
       try {
           String nazwa;
           System.out.println("Podaj nazwę pliku z rozszerzezniem: ");
           nazwa = scanner2.nextLine();
           plik = new File("C:\\Users\\micha\\Desktop\\strona_internetowa\\nauka\\java_lab\\lab 12\\src\\"+nazwa);
           Scanner scanner = new Scanner(plik);
           boolean sprawdz = true;
           while(sprawdz){
               String tekst = scanner.nextLine();
               System.out.println(tekst);
           }

            }catch (IOException a){
            a.printStackTrace();
       }catch (NoSuchElementException e){
           System.out.println("wszystkie linie zostały wypisane!!");
       }
    }
}
