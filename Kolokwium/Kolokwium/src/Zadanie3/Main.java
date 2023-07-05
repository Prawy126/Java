package Zadanie3;

public class Main {
    public static void main(String[] args){
        Osoba osoba = new Osoba();
        Osoba osoba1 = new Osoba("Wiesław", "Paleta",50);
        Osoba osoba2 = new Osoba("Agata","Nowak",24,"Polska");
        osoba.setImie("Maja");
        osoba.setNazwisko("Kowalska");
        osoba.setWiek(19);
        osoba.setKrajPochodzenia("Polska");
        osoba.WyswietlDaneOsoby();
        osoba2.WyswietlDaneOsoby();
        osoba1.setKrajPochodzenia("Polska");
        osoba1.WyswietlDaneOsoby();
    }
}
