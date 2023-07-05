import java.util.Scanner;
//zadanie 2
public class Ksiazka {
    private String tytul,autor;
    private int liczbaStron, rok;
    public float cena;
    Ksiazka(String tytul, String autor, int liczbaStron, int rok, float cena){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.rok = rok;
        this.cena = cena;
    }
    public void wyswietlKsiazke(){
        System.out.println("Tytuł: "  + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba storn: " + this.liczbaStron);
        System.out.println("Rok wydania: " + this.rok);
        System.out.println("Aktualna cena: " + this.cena);
    }

    public void podajCene(){
        float cena;
        System.out.println("Proszę podać nową cenę: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.replace(",", ".");
        float value = Float.parseFloat(input);
        this.cena = value;
    }
    public void nowaCena(float cena){
        this.cena = cena;
    }
}
