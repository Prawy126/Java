public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 0;
    }
    public Osoba(){
        this.imie = "brak informacji";
        this.nazwisko = "brak informacji";
        this.wiek = 0;
    }
    public void PokazDane(){
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        if(this.wiek != 0)
        System.out.println("wiek: " + this.wiek + " lat");
        else
            System.out.println("wiek: brak inforamcji");
    }
}
