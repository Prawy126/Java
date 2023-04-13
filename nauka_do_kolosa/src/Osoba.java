public class Osoba {
    private String imie, nazwisko;
    private int wiek;
    private float waga, wzrost;
    Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 0;
        this.waga = 0;
        this.wzrost = 0;
    }
    Osoba(String imie, String nazwisko, int wiek, float waga, float wzrost){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.waga = waga;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }
    public void wyswietl(){
        System.out.println("Imię: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        System.out.println("Wiek: "+this.wiek);
        System.out.println("Wzrost: "+this.wzrost);
        System.out.println("Waga: "+this.waga);
    }

}
