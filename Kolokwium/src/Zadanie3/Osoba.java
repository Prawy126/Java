package Zadanie3;

public class Osoba {
    String imie, nazwisko, krajPochodzenia;
    int wiek;
    public Osoba(){
        imie=null;
        nazwisko=null;
        krajPochodzenia = null;
        wiek=0;
    }
    public Osoba(String imie, String nazwisko, int wiek){
        this.imie=imie;
        this.nazwisko = nazwisko;
        if(wiek<0&&wiek>120){
            System.out.println("Błąd wiek jest nie poprawny");
            this.wiek=0;
        }else{
            this.wiek=wiek;
        }
    }
    public Osoba(String imie, String nazwisko, int wiek, String krajPochodzenia){
        this.imie=imie;
        this.nazwisko = nazwisko;
        if(wiek<0&&wiek>120){
            System.out.println("Błąd wiek jest nie poprawny");
            this.wiek=0;
        }else{
            this.wiek=wiek;
        }
        this.krajPochodzenia = krajPochodzenia;
    }
    
}
