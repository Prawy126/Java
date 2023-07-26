public class Samochod extends Pojazd{
    Samochod(String marka, int iloscKol,int iloscDrzwi){
        super(marka, iloscKol);
        this.iloscDrzwi = iloscDrzwi;
        System.out.println("Konstruktor klasy - Samochód");

    }
    int iloscDrzwi;
    boolean otwarty = false;
    void zmaknijOtworz(){
       otwarty = !otwarty;
        if(otwarty){
            System.out.println("Owtarto");
        }else{
            System.out.println("Zamknięto");
        }
    }
}
