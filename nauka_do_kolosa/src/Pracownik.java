public class Pracownik extends Osoba{
    private float wyplata;
    private String stanowisko;
    Pracownik(String imie, String nazwisko, String stanowisko, float wyplata){
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.wyplata = wyplata;
    }


   public void wyswietl(){
       super.wyswietl();
       System.out.println("Stanowisko: "+this.stanowisko);
       System.out.println("Zarobki: "+this.wyplata);
   }

}
