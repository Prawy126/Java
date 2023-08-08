import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class PokemonInfo {
    final private String pokemon;
    public PokemonInfo(String pokemon){
        this.pokemon = pokemon;
        //łączenie się ze stroną
        Connection connect = Jsoup.connect("https://pokemon.fandom.com/pl/wiki/"+pokemon);
        //pobieranie ifnoramcji i wyświeltanie ich w konsoli
        try {
            Document document = connect.get();
            Elements allH1 = document.select("div.pi-item.pi-data.pi-item-spacing.pi-border-color");
            System.out.println("działa");

        } catch (IOException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
    public String informacje() {
        String wynik;
        Connection connect = Jsoup.connect("https://pokemon.fandom.com/pl/wiki/" + pokemon);
        wynik = pokemon+"\n";
        try {
            Document document = connect.get();
            Elements allH1 = document.select("div.pi-item.pi-data.pi-item-spacing.pi-border-color");

            for (Element elem : allH1) {
                wynik = wynik + elem.text() + "\n";
            }
            return wynik;
        } catch (IOException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
        return wynik;
    }
    public String pokemnoNazwa(){
        return pokemon;
    }


}
