public class Pojazd {
    Pojazd(String marka, int iloscKol){
        this.marka = marka;
        this.iloscKol = iloscKol;
        System.out.println("Konstruktor klasy - Pojazd");
    }
    String marka;
    int iloscKol;

    protected void odpal(){
        System.out.println("Pojazd odpalił");
    }
}
