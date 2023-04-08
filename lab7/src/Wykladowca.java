public class Wykladowca extends Osoba{
    private String przedmiot, nazwaUczelni;
    private int iloscGodzin, iloscWykladow;
    Wykladowca(String imie, String nazwisko, String plec, int dzien, int numerMiesiaca, int rok, String przedmiot, String nazwaUczelni, int iloscGodzin, int iloscWykladow){
        super( imie, nazwisko, plec,dzien, numerMiesiaca, rok);
        this.iloscGodzin = iloscGodzin;
        this.przedmiot = przedmiot;
        this.nazwaUczelni = nazwaUczelni;
        this.iloscWykladow = iloscWykladow;

    }
    @Override
    void wyswietl(){
        super.wyswietl();
        System.out.println("Przedmiot: " + this.przedmiot);
        System.out.println("Nazwa uczelni: " + this.nazwaUczelni);
        System.out.println("Liczba wykładów: " + this.iloscWykladow);
        System.out.println("Liczba godzin wykładów: " + this.iloscGodzin);
    }
}
