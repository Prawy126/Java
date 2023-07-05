package Zadanie4;

public class Main {
    public static void main(String[] args){
        Pracownik pracownik = new Pracownik("programista",12);
        Pracownik pracownik2 = new Pracownik("Michał","Pilecki",19,"Polska","Programista",123);
        pracownik2.WyswietlDaneOsoby();
        pracownik.WyswietlDaneOsoby();
    }
}
