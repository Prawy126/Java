
public class Osoba {
    //pola
    private String imie, nazwisko;
    private int wiek;
    private float waga;
    //metody
    public void pokaz(){
        System.out.println("Imię: " + imie + " nazwisko: " + nazwisko + " mam: " + wiek + " ważę " + waga);
    }
    public void setImie(String imie){
        if(imie!=null)
            this.imie = imie;
        else this.imie = "";
    }
    public void getImie(){
        System.out.println(this.imie);
    }
    //konstruktory
    public Osoba(String imie, String nazwisko){
        this.imie=imie;

    }

}
