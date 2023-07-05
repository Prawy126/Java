package Zadanie3;

public class Osoba {
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    private String imie, nazwisko, krajPochodzenia;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public int getWiek() {
        return wiek;
    }

    private int wiek;
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
    public void WyswietlDaneOsoby(){
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        if(this.wiek!=0){
            System.out.println("Wiek: " + this.wiek);
        }
        if(this.krajPochodzenia!=null){
            System.out.println("Kraj pochodzenia: " + this.krajPochodzenia);
        }
    }

}
