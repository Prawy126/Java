public class Osoba {
    private String imie, nazwisko, plec;
    private int dzien, numerMiesiaca, rok;
    Osoba(String imie, String nazwisko, String plec, int dzien, int numerMiesiaca, int rok){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.dzien = dzien;
        this.numerMiesiaca = numerMiesiaca;
        this.rok = rok;
    }
    void wyswietl(){
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Płeć: " + this.plec);
        System.out.println("Data urodzenia: "+this.dzien +"."+this.numerMiesiaca+"."+this.rok);


    }
}
