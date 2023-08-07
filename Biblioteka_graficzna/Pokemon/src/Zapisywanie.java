import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapisywanie {
    String nazwa = "text.txt";
    public Zapisywanie(String informacje){
       try {
           PrintWriter zapis = new PrintWriter(nazwa);
           zapis.print(informacje);
           zapis.close();
       }catch(FileNotFoundException e){
           System.out.println("Nie znaleziono pliku");
       }
    }
}
