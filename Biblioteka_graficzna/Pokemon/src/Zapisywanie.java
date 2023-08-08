import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zapisywanie {
    String nazwa;
    public void zapis(String informacje){
        try{
            PrintWriter zapis = new PrintWriter(nazwa);
            zapis.print(informacje);
            zapis.close();
        }catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }
    }
    public void tworzenie(String nazwa){
        this.nazwa = nazwa;
       try {
           FileWriter tworzenie = new FileWriter(nazwa);
           tworzenie.close();
       }catch (IOException e){
           System.out.println("Wystąpił błąd");
       }
    }
    public boolean sprawdzenieCzyIstnieje(String nazwa){
        Path path = Paths.get(nazwa);
        boolean wynik = Files.exists(path);
        return wynik;

    }
}
