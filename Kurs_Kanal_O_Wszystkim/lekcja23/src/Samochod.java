public class Samochod extends Pojazd{
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
