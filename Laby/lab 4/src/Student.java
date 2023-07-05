import java.util.Scanner;

public class Student {
    private String imie;
    private String nazwisko;
    private int numerIndexu, rok;
    private String specjalnosc;

    public Student(String imie, String nazwisko, String specjalnosc, int numerIndexu, int rok){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rok = rok;
        this.numerIndexu = numerIndexu;
    }
    public Student(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Student(String imie,int rok){
        this.imie = imie;
        this.rok = rok;
    }
    public Student(int rok, int numerIndexu){
        this.rok = rok;
        this.numerIndexu = numerIndexu;
    }

    //wyświetlanie wszystkich wartości
    public void Pokaz(){
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Specjalność: " + specjalnosc);
        System.out.println("Numer indexu: " + numerIndexu);
        System.out.println("Rok: " + rok);
    }
    public void ustawImie(String imie){
        this.imie = imie;
    }
    public void ustawNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void ustawSpecjazlizacje(String specjalnosc){
        this.specjalnosc = specjalnosc;
    }
    public void ustawNumerIndexu(int numerIndexu){
        this.numerIndexu = numerIndexu;
    }
    public void ustawRok(int rok){
        this.rok = rok;
    }
}

